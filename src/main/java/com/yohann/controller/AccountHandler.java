package com.yohann.controller;

import com.yohann.entity.Account;
import com.yohann.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountHandler {
    @Autowired
    private AccountService accountService;

    @GetMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", accountService.findAll());

        return modelAndView;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST, params = {"id", "name", "money"})
    public String login(Account account){
        Account account1 = accountService.findAccount(account);
        if (account1 == null){
            return "fail";
        }else
        return "index";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST, params = {"id", "name", "money"})
    public String add(Account account){
        accountService.save(account);

        return "index";
    }

    @RequestMapping("test")
    public String test(){
        return "index";
    }
}
