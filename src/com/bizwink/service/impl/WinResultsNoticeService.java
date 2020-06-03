package com.bizwink.service.impl;

import com.bizwink.persistence.WinResultsNoticeMapper;
import com.bizwink.po.WinResultsNotice;
import com.bizwink.po.WinResultsNoticeWithBLOBs;
import com.bizwink.service.IWinResultsNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WinResultsNoticeService implements IWinResultsNoticeService{
    @Autowired
    private WinResultsNoticeMapper winResultsNoticeMapper;

    public WinResultsNoticeWithBLOBs getWinResultsNoticeByUUID(String uuid) {
        return winResultsNoticeMapper.selectByUUID(uuid);
    }
}
