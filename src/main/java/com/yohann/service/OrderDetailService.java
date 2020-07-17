package com.yohann.service;

import com.yohann.entity.OrderDetail;
import com.yohann.utils.Pager;

import java.util.List;

public interface OrderDetailService extends BaseService<OrderDetail> {
    /**
     * 查询订单细节
     * @param pager
     * @param orderDetail
     * @return
     */
    List<OrderDetail> findAllByOrderId(Pager pager, OrderDetail orderDetail);


    /**
     * 查询条数
     * @param orderId
     * @return
     */
    long countOrderById(long orderId);
}
