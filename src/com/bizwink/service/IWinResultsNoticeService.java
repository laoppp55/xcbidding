package com.bizwink.service;

import com.bizwink.po.WinResultsNotice;
import com.bizwink.po.WinResultsNoticeWithBLOBs;

public interface IWinResultsNoticeService {
    WinResultsNoticeWithBLOBs getWinResultsNoticeByUUID(String uuid);
}
