package com.yohann.controller;

import com.yohann.entity.Manage;
import com.yohann.service.ManageService;
import com.yohann.utils.mySession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录相关控制器
 */
@Controller
@RequestMapping("/login")
public class LoginController{

    @Autowired
    private ManageService manageService;

    /**
     * 管理员登录界面
     * @return
     */
    @RequestMapping("admin")
    public String mlogin(){
        return "login/adminLogin";
    }

    /**
     * 管理员登录验证
     * @return
     */
    @RequestMapping("adminToLogin")
    public String tomlogin(Manage manage, HttpServletRequest request){
        Manage manage1 = manageService.findEntity(manage);

        if (manage1 == null){
            //登录失败
            return "redirect:/login/exit";
        }

        //登录成功，设置session
        request.getSession().setAttribute(mySession.MANAGE, manage1);
        return "login/adminIndex";
    }

    /**
     * 管理员退出登录
     * @param request
     * @return
     */
    @RequestMapping("exit")
    public String exit(HttpServletRequest request){
        //清除session
        request.getSession().setAttribute(mySession.MANAGE, null);

        return "redirect:/login/admin";
    }

    /**
     * 欢迎界面
     * @return
     */
    @RequestMapping("welcome")
    public String welcome(){
        return "index";
    }
}
