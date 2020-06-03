package com.bizwink.service;

import com.bizwink.po.*;
import com.bizwink.vo.voBaseContract;
import com.bizwink.vo.voBulletinNotice;
import com.bizwink.vo.voChangeNotice;
import com.bizwink.vo.voWinResultsNotice;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public interface INoticeService {
    BulletinNoticeWithBLOBs getBulletinNoticeBySection(String projectsectioncode);

    List<BulletinNoticeWithBLOBs> getBulletinNoticeByproject(String projectcode);

    BulletinNoticeWithBLOBs getBulletinNoticeByUUID(String uuid);

    int getBulletinNoticeCount(Timestamp now);

    List<voBulletinNotice> getBulletinNoticeList(Timestamp now,BigDecimal startrow, BigDecimal rows);

    List<voBulletinNotice> getTopBulletinNotice(Timestamp now,int toprows);

    int getChangeNoticeCount(Timestamp now);

    List<voChangeNotice> getChangeNoticeList(Timestamp now,BigDecimal startrow, BigDecimal rows);

    List<voChangeNotice> getTopChangeNotice(Timestamp now,int toprows);

    ChangeNotice getChangeNoticeByUUID(String uuid);

    int getWinResultsNoticeCount(Timestamp now);

    List<voWinResultsNotice> getWinResultsNoticeList(Timestamp now,BigDecimal startrow, BigDecimal rows);

    List<voWinResultsNotice> getTopWinResultsNotice(Timestamp now,int toprows);

    WinResultsNotice getWinResultsNoticeByUUID(String uuid);

    int getBaseContractCount(Timestamp now);

    List<voBaseContract> getBaseContractList(Timestamp now,BigDecimal startrow, BigDecimal rows);

    List<voBaseContract> getTopBaseContract(Timestamp now,int toprows);

    BaseContract getBaseContractByUUID(String uuid);
}
