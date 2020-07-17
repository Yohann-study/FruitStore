package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.NewsDao;
import com.yohann.entity.News;
import com.yohann.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public BaseDao<News> getBaseDao() {
        return newsDao;
    }
}
