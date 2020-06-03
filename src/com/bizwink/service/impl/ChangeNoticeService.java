package com.bizwink.service.impl;

import com.bizwink.persistence.ChangeNoticeMapper;
import com.bizwink.po.ChangeNotice;
import com.bizwink.po.ChangeNoticeWithBLOBs;
import com.bizwink.service.IChangeNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeNoticeService implements IChangeNoticeService {
    @Autowired
    private ChangeNoticeMapper changeNoticeMapper;

    public ChangeNoticeWithBLOBs getChangeNoticeByUUID(String uuid) {
        return changeNoticeMapper.selectByPrimaryKey(uuid);
    }
}
