package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ItemCategoryDao;
import com.yohann.entity.ItemCategory;
import com.yohann.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryServiceImpl extends BaseServiceImpl<ItemCategory> implements ItemCategoryService {
    @Autowired
    ItemCategoryDao itemCategoryDao;

    @Override
    public BaseDao<ItemCategory> getBaseDao() {
        return itemCategoryDao;
    }
}
