package com.yohann.controller;

import com.yohann.entity.Manage;
import com.yohann.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static java.lang.System.out;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    private ManageService manageService;

    /**
     * 管理员登录界面
     * @return
     */
    @RequestMapping("mlogin")
    public String mlogin(){
        return "login/mlogin";
    }

    /**
     * 管理员登录验证
     * @return
     */
    @RequestMapping("tomlogin")
    public String tomlogin(Manage manage, HttpServletRequest request){
        Manage manage1 = manageService.findEntity(manage);
        if (manage1 != null){
            out.println("登录成功");
        }
        return "index";
    }
}
