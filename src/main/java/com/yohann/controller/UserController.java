package com.yohann.controller;

import com.yohann.entity.User;
import com.yohann.service.UserService;
import com.yohann.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户管理控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public String findAll(Model model, Pager pager, User user){
        //将页码设置为1
        pager = pager.pageNoTo0(pager);

        Pager<User> result = new Pager<>();
        result.setPageNo(pager.getPageNo());
        result.setPageSize(pager.getPageSize());
        if (user.getUserName() == null)
            result.setRows(userService.findByPager(pager));
        else
            result.setRows(userService.findLike(pager, user.getUserName()));

        //计算页数
        result.setTotal(result.ComputationalPages(userService.count(),result.getPageSize()));

        model.addAttribute("result", result);

        return "user/user";
    }
}
