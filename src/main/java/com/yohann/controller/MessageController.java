package com.yohann.controller;

import com.yohann.entity.Message;
import com.yohann.service.MessageService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户管理控制器
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("message")
    public String findAll(Model model, Pager pager, Message message){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);

        Pager<Message> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        if (message.getName() == null)
            result.setRows(messageService.findByPager(pager));
        else
            result.setRows(messageService.findLike(pager, message.getName()));

        //计算页数
        result.setTotal(result.ComputationalPages(messageService.count(),result.getPageSize()));

        model.addAttribute("result", result);

        return "message/message";
    }

    /**
     * 删除留言
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(int id){
        messageService.deleteById(id);

        return "redirect:/message/message";
    }
}
