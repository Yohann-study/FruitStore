package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ManageDao;
import com.yohann.dao.UserDao;
import com.yohann.entity.Manage;
import com.yohann.entity.User;
import com.yohann.service.UserService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public BaseDao<User> getBaseDao() {
        return userDao;
    }
}
