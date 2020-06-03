package com.bizwink.BidInfo;

import com.bizwink.po.*;
import com.bizwink.service.INoticeService;
import com.bizwink.util.ParamUtil;
import com.bizwink.util.SpringInit;
import com.bizwink.vo.voBaseContract;
import com.bizwink.vo.voBulletinNotice;
import com.bizwink.vo.voChangeNotice;
import com.bizwink.vo.voWinResultsNotice;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class NoticesController {
    @RequestMapping(value="/BulletinNoticeTop10.do")
    public @ResponseBody List<voBulletinNotice> getBulletinNoticeTop10(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voBulletinNotice> bulletinNotices = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();

        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            bulletinNotices = noticeService.getTopBulletinNotice(now,10);
        }

        return  bulletinNotices;
    }

    @RequestMapping(value="/BulletinNoticeList.do")
    public @ResponseBody List<voBulletinNotice> getBulletinNoticeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voBulletinNotice> bulletinNotices = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int startrow = ParamUtil.getIntParameter(request,"start",0);
        int rows = ParamUtil.getIntParameter(request,"rows",20);
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            bulletinNotices = noticeService.getBulletinNoticeList(now,BigDecimal.valueOf(startrow),BigDecimal.valueOf(rows));
        }

        return  bulletinNotices;
    }

    @RequestMapping(value="/BulletinNoticeCount.do")
    @ResponseBody
    public int getBulletinNoticeCount(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int count = 0;
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            count = noticeService.getBulletinNoticeCount(now);
        }

        return count;
    }

    @RequestMapping(value="/ChangeNoticeTop10.do")
    public @ResponseBody List<voChangeNotice> getChangeNoticeTop10(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voChangeNotice> changeNotices = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();

        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            changeNotices = noticeService.getTopChangeNotice(now,10);
        }

        return  changeNotices;
    }

    @RequestMapping(value="/ChangeNoticeList.do")
    public @ResponseBody List<voChangeNotice> getChangeNoticeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voChangeNotice> changeNotices = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int startrow = ParamUtil.getIntParameter(request,"start",0);
        int rows = ParamUtil.getIntParameter(request,"rows",20);
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            changeNotices = noticeService.getChangeNoticeList(now,BigDecimal.valueOf(startrow),BigDecimal.valueOf(rows));
        }

        return  changeNotices;
    }

    @RequestMapping(value="/ChangeNoticeCount.do")
    @ResponseBody
    public int getChangeNoticeCount(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int count = 0;
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            count = noticeService.getChangeNoticeCount(now);
        }

        return count;
    }

    @RequestMapping(value="/WinResultsNoticeTop10.do")
    public @ResponseBody List<voWinResultsNotice> getWinResultsNoticeTop10(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voWinResultsNotice> winResultsNotices = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();

        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            winResultsNotices = noticeService.getTopWinResultsNotice(now,10);
        }

        return  winResultsNotices;
    }

    @RequestMapping(value="/WinResultsNoticeList.do")
    public @ResponseBody List<voWinResultsNotice> getWinResultsNoticeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voWinResultsNotice> winResultsNotices = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int startrow = ParamUtil.getIntParameter(request,"start",0);
        int rows = ParamUtil.getIntParameter(request,"rows",20);
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            winResultsNotices = noticeService.getWinResultsNoticeList(now,BigDecimal.valueOf(startrow),BigDecimal.valueOf(rows));
        }

        return  winResultsNotices;
    }

    @RequestMapping(value="/WinResultsNoticeCount.do")
    @ResponseBody
    public int getWinResultsNoticeCount(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int count = 0;
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            count = noticeService.getWinResultsNoticeCount(now);
        }

        return count;
    }
    @RequestMapping(value="/BaseContractTop10.do")
    public @ResponseBody List<voBaseContract> getBaseContractTop10(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voBaseContract> baseContracts = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();

        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            baseContracts = noticeService.getTopBaseContract(now,10);
        }

        return  baseContracts;
    }

    @RequestMapping(value="/BaseContractList.do")
    public @ResponseBody List<voBaseContract> getBaseContractList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<voBaseContract> baseContracts = null;
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int startrow = ParamUtil.getIntParameter(request,"start",0);
        int rows = ParamUtil.getIntParameter(request,"rows",20);
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            baseContracts = noticeService.getBaseContractList(now,BigDecimal.valueOf(startrow),BigDecimal.valueOf(rows));
        }

        return  baseContracts;
    }

    @RequestMapping(value="/BaseContractCount.do")
    @ResponseBody
    public int getBaseContractCount(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ApplicationContext appContext = SpringInit.getApplicationContext();
        int count = 0;
        if (appContext!=null) {
            INoticeService noticeService = (INoticeService)appContext.getBean("noticeService");
            Timestamp now = new Timestamp(System.currentTimeMillis());
            count = noticeService.getBaseContractCount(now);
        }

        return count;
    }
}
