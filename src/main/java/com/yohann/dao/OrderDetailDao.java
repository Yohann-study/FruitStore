package com.yohann.dao;

import com.yohann.entity.OrderDetail;

import java.util.List;
import java.util.Map;

public interface OrderDetailDao extends BaseDao<OrderDetail> {
    /**
     * 查询订单细节
     * @param map
     * @return
     */
    List<OrderDetail> findAllByOrderId(Map<String, Object> map);

    /**
     * 查询条数
     * @param orderId
     * @return
     */
    long countOrderById(long orderId);
}
