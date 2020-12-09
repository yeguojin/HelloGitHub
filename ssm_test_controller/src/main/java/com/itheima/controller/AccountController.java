package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author :YeGuoJin
 * @Date : 2020/12/3 21:10
 * @Version 1.0
 * @description :
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        PageInfo<Account> pageInfo = accountService.findAll(1, 1000);
        modelAndView.addObject("pageBean",pageInfo);
        modelAndView.setViewName("/listAccount.jsp");
        return modelAndView;
    }

    @RequestMapping("/add")
    public String save(Account account){

        accountService.save(account);
        return "/success.jsp";
    }

    @RequestMapping("/transfer")
    public String transfer(String from,String to,Double money){

        boolean flag =  accountService.transfer(from,to,money);
        if (flag){
            return "/success.jsp";
        }else {
            return "/error.jsp";
        }
    }
}
