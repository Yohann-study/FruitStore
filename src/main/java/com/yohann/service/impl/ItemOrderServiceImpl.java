package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ItemOrderDao;
import com.yohann.entity.ItemOrder;
import com.yohann.service.ItemOrderService;
import com.yohann.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemOrderServiceImpl extends BaseServiceImpl<ItemOrder> implements ItemOrderService{
    @Autowired
    private ItemOrderDao itemOrderDao;

    @Override
    public BaseDao<ItemOrder> getBaseDao() {
        return itemOrderDao;
    }
}
