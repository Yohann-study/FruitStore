package com.yohann.controller;

import com.yohann.entity.ItemOrder;
import com.yohann.entity.OrderDetail;
import com.yohann.entity.User;
import com.yohann.service.ItemOrderService;
import com.yohann.service.OrderDetailService;
import com.yohann.service.UserService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单管理管理控制器
 */
@Controller
@RequestMapping("/itemOrder")
public class ItemOrderController {
    @Autowired
    private ItemOrderService itemOrderService;

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping("itemOrder")
    public String findAll(Model model, Pager pager, ItemOrder itemOrder){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);

        Pager<ItemOrder> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        if (itemOrder.getCode() == null)
            result.setRows(itemOrderService.findByPager(pager));
        else
            result.setRows(itemOrderService.findLike(pager, itemOrder.getCode()));

        //计算页数
        result.setTotal(result.ComputationalPages(itemOrderService.count(),result.getPageSize()));

        model.addAttribute("result", result);

        return "itemOrder/itemOrder";
    }

    /**
     * 订单信息
     * @param model
     * @param pager
     * @param orderDetail
     * @return
     */
    @RequestMapping("orderDetail")
    public String findAll(Model model, Pager pager, OrderDetail orderDetail){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);
        pager.setPageSize(5);

        Pager<OrderDetail> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        result.setRows(orderDetailService.findAllByOrderId(pager, orderDetail));

        //计算页数
        result.setTotal(result.ComputationalPages(orderDetailService.countOrderById(orderDetail.getOrderId()),result.getPageSize()));

        model.addAttribute("result", result);
        model.addAttribute("id", orderDetail.getOrderId());

        return "orderDetail/orderDetail";
    }

    /**
     * 发货
     * @param id
     * @return
     */
    @RequestMapping("delivery")
    public String delivery(Integer id){
        ItemOrder itemOrder = itemOrderService.findById(id);
        itemOrder.setStatus(2);
        itemOrderService.update(itemOrder);

        return "redirect:/itemOrder/itemOrder.action";
    }
}
