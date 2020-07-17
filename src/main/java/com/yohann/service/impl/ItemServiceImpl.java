package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ItemDao;
import com.yohann.entity.Item;
import com.yohann.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public BaseDao<Item> getBaseDao() {
        return itemDao;
    }
}
