package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ManageDao;
import com.yohann.entity.Manage;
import com.yohann.service.BaseService;
import com.yohann.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl extends BaseServiceImpl<Manage> implements ManageService {
    @Autowired
    ManageDao manageDao;

    @Override
    public BaseDao<Manage> getBaseDao() {
        return manageDao;
    }
}
