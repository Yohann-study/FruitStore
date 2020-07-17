package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.ItemOrderDao;
import com.yohann.dao.OrderDetailDao;
import com.yohann.entity.ItemOrder;
import com.yohann.entity.OrderDetail;
import com.yohann.service.ItemOrderService;
import com.yohann.service.OrderDetailService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetail> implements OrderDetailService{
    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public BaseDao<OrderDetail> getBaseDao() {
        return orderDetailDao;
    }

    @Override
    public List<OrderDetail> findAllByOrderId(Pager pager, OrderDetail orderDetail) {
        Map<String, Object> map = new HashMap();
        map.put("starIndex", (pager.getPageNo() - 1) * pager.getPageSize());
        map.put("pageSize", pager.getPageSize());
        map.put("orderId", orderDetail.getOrderId());

        return orderDetailDao.findAllByOrderId(map);
    }

    @Override
    public long countOrderById(long orderId) {
        return orderDetailDao.countOrderById(orderId);
    }
}
