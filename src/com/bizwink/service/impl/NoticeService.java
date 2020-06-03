package com.bizwink.service.impl;

import com.bizwink.persistence.BaseContractMapper;
import com.bizwink.persistence.BulletinNoticeMapper;
import com.bizwink.persistence.ChangeNoticeMapper;
import com.bizwink.persistence.WinResultsNoticeMapper;
import com.bizwink.po.*;
import com.bizwink.service.INoticeService;
import com.bizwink.vo.voBaseContract;
import com.bizwink.vo.voBulletinNotice;
import com.bizwink.vo.voChangeNotice;
import com.bizwink.vo.voWinResultsNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NoticeService implements INoticeService{
    @Autowired
    private BulletinNoticeMapper bulletinNoticeMapper;

    @Autowired
    private ChangeNoticeMapper changeNoticeMapper;

    @Autowired
    private WinResultsNoticeMapper winResultsNoticeMapper;

    @Autowired
    private BaseContractMapper baseContractMapper;

    public BulletinNoticeWithBLOBs getBulletinNoticeBySection(String projectsectioncode){
        return bulletinNoticeMapper.getBulletinNoticeBySectionCode(projectsectioncode);
    }

    public List<BulletinNoticeWithBLOBs> getBulletinNoticeByproject(String projectcode){
        return bulletinNoticeMapper.getBulletinNoticeByProjectCode(projectcode);
    }

    public int getBulletinNoticeCount(Timestamp now) {
        return bulletinNoticeMapper.getBulletinNoticeCount(now).intValue();
    }

    public BulletinNoticeWithBLOBs getBulletinNoticeByUUID(String uuid) {
        return bulletinNoticeMapper.selectByPrimaryKey(uuid);
    }

    public List<voBulletinNotice> getBulletinNoticeList(Timestamp now,BigDecimal startrow, BigDecimal rows) {
        Map params = new HashMap();
        params.put("startrow",startrow);
        params.put("rows",rows);
        params.put("publishtime",now);
        return bulletinNoticeMapper.getBulletinNoticeList(params);
    }

    public List<voBulletinNotice> getTopBulletinNotice(Timestamp now,int toprows) {
        Map params = new HashMap();
        params.put("toprows",toprows);
        params.put("publishtime",now);

        return bulletinNoticeMapper.getTopBulletinNotice(params);
    }

    public int getChangeNoticeCount(Timestamp now) {
        return changeNoticeMapper.getChangeNoticeCount(now).intValue();
    }
    public List<voChangeNotice> getChangeNoticeList(Timestamp now,BigDecimal startrow, BigDecimal rows) {
        Map params = new HashMap();
        params.put("startrow",startrow);
        params.put("rows",rows);
        params.put("publishtime",now);

        return changeNoticeMapper.getChangeNoticeList(params);
    }

    public List<voChangeNotice> getTopChangeNotice(Timestamp now,int toprows) {
        Map params = new HashMap();
        params.put("toprows",toprows);
        params.put("publishtime",now);

        return changeNoticeMapper.getTopChangeNotice(params);
    }

    public ChangeNotice getChangeNoticeByUUID(String uuid) {
        return changeNoticeMapper.selectByPrimaryKey(uuid);
    }

    public int getWinResultsNoticeCount(Timestamp now) {
        return winResultsNoticeMapper.getWinResultsNoticeCount(now).intValue();
    }
    public List<voWinResultsNotice> getWinResultsNoticeList(Timestamp now,BigDecimal startrow, BigDecimal rows) {
        Map params = new HashMap();
        params.put("startrow",startrow);
        params.put("rows",rows);
        params.put("publishtime",now);
        return winResultsNoticeMapper.getWinResultsNoticeList(params);
    }

    public List<voWinResultsNotice> getTopWinResultsNotice(Timestamp now,int toprows) {
        Map params = new HashMap();
        params.put("toprows",toprows);
        params.put("publishtime",now);
        return winResultsNoticeMapper.getTopWinResultsNotice(params);
    }

    public WinResultsNotice getWinResultsNoticeByUUID(String uuid) {
        return winResultsNoticeMapper.selectByUUID(uuid);
    }

    public int getBaseContractCount(Timestamp now) {
        return baseContractMapper.getBaseContractCount(now);
    }

    public List<voBaseContract> getBaseContractList(Timestamp now,BigDecimal startrow, BigDecimal rows) {
        Map params = new HashMap();
        params.put("startrow",startrow);
        params.put("rows",rows);
        params.put("publishtime",now);

        return baseContractMapper.getBaseContractList(params);
    }

    public List<voBaseContract> getTopBaseContract(Timestamp now,int toprows) {
        Map params = new HashMap();
        params.put("toprows",toprows);
        params.put("publishtime",now);

        return baseContractMapper.getTopBaseContract(params);
    }

    public BaseContract getBaseContractByUUID(String uuid) {
        return baseContractMapper.selectByPrimaryKey(uuid);
    }
}
