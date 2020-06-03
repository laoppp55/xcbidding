package com.bizwink.service;

import com.bizwink.po.ChangeNoticeWithBLOBs;

public interface IChangeNoticeService {
    ChangeNoticeWithBLOBs getChangeNoticeByUUID(String uuid);
}
