package com.bizwink.service;

import com.bizwink.indexer.DBDocument;
import com.bizwink.persistence.ArticleMapper;
import com.bizwink.persistence.ColumnMapper;
import com.bizwink.persistence.SiteinfoMapper;
import com.bizwink.po.Article;
import com.bizwink.po.Column;
import com.bizwink.po.Siteinfo;
import com.bizwink.util.DBUtil;
import com.bizwink.util.SearchConfig;
import com.bizwink.util.SpringInit;
import com.bizwink.util.StringUtil;
import com.jolbox.bonecp.BoneCPDataSource;
import org.apache.log4j.Logger;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jackzhang
 * Date: 13-10-14
 * Time: 下午7:29
 * To change this template use File | Settings | File Templates.
 */
@Service
public class LuceneIndexService {
    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ColumnMapper columnMapper;

    @Autowired
    private SiteinfoMapper siteinfoMapper;

    public static Logger logger = Logger.getLogger(LuceneIndexService.class.getName());

    public void createIndex(){
        int siteid = SearchConfig.getInstance().getSiteidConfig();
        createIndex(SearchConfig.getInstance().getIndexpathConfig());
    }

    public void createIndex(String indexPath) {
        Date start = new Date();
        logger.debug("create index begin");

        IndexWriter writer =null;
        Directory directory = null;
        List<Siteinfo> siteinfoList = siteinfoMapper.getSiteinfos();
        String s_index_path = indexPath;
        for(int ii=0;ii<siteinfoList.size();ii++) {
            Siteinfo siteinfo = siteinfoList.get(ii);
            if (indexPath.endsWith(File.separator))
                indexPath = s_index_path + StringUtil.replace(siteinfo.getSITENAME(),".","_");
            else
                indexPath = s_index_path + File.separator + StringUtil.replace(siteinfo.getSITENAME(),".","_");
            File file = new File(indexPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            // 配置索引
            //Analyzer analyzer = new SmartChineseAnalyzer();
            try {
                Analyzer analyzer = new IKAnalyzer();
                directory = new SimpleFSDirectory(new File(indexPath));
                if (IndexWriter.isLocked(directory)) IndexWriter.unlock(directory);
                writer = new IndexWriter(directory, new IndexWriterConfig(Version.LUCENE_45, analyzer));
                // 删除所有document
                //writer.deleteAll();
                indexDoc(writer, siteinfo.getSITEID().intValue());
            } catch (IOException exp) {
                exp.printStackTrace();
            } finally {
                if(writer!=null && directory!=null){
                    try {
                        writer.commit();
                        writer.close();
                        directory.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };
            }
            logger.debug(siteinfo.getSITENAME() +  "：index end");
        }
        Date end = new Date();
        logger.debug(end.getTime() - start.getTime() + " total milliseconds");
    }

    void  indexDoc(IndexWriter writer,int siteid) {
        //List<Article> articleList =articleMapper.getNeedIndex(siteid);
        List<Article> articleList =DBUtil.getNeedIndex(siteid);
        int looptime=0;
        String artcileids ="";
        while (articleList !=null &&(articleList.size()>0) ){
            artcileids = indexResult(writer,siteid,articleList);
            articleMapper.updateIdxFlagByids(artcileids);
            looptime++;
            if (looptime <4 ){
                articleList =articleMapper.getNeedIndex(siteid);
            }else{
                articleList =null;
            }
        }
    }

    String  indexResult(IndexWriter writer,int siteid,List artlist ) {
        String artcileids ="";
        try {
            if (artlist !=null && (artlist.size() > 0)) {
                Article article=null;
                Document doc =null;
                for(int i=0; i<artlist.size(); i++) {
                    article = (Article)artlist.get(i);

                    if(artcileids ==""){
                        artcileids += article.getID();
                    }else{
                        artcileids += ","+article.getID();
                    }

                    //将该文章所在栏目及该栏目的所有父节点的id取出来拼成逗号字符串
                    int columnid = article.getCOLUMNID().intValue();
                    Column column = columnMapper.selectByPrimaryKey(BigDecimal.valueOf(columnid));
                    String columnChineseName = column.getCNAME();
                    String articlePathinfo = "c" + columnid;
                    columnid = column.getPARENTID().intValue();
                    while (columnid>0) {
                        column = columnMapper.selectByPrimaryKey(BigDecimal.valueOf(columnid));
                        columnid = column.getPARENTID().intValue();
                        articlePathinfo = articlePathinfo  + columnid;
                    }
                    String dirname = articleMapper.getColumnDirname(article.getCOLUMNID().intValue());
                    if (dirname != null) {
                        article.setDIRNAME(dirname);
                        System.out.println(article.getMAINTITLE() + ":被索引");
                        doc  = DBDocument.Document(siteid,articlePathinfo,columnChineseName,article);
                        writer.addDocument(doc);
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return artcileids;
    }

    private String getArticlePathInfo(String columnids) {

        return null;
    }
}
