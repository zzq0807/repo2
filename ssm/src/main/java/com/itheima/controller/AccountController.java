package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;




    @RequestMapping(path = "/findAll")
    public String findAll() {

        System.out.println("controller层被执行");
        accountService.findAll();
        return "success";
    }

    ;
    @RequestMapping(path = "/save")
    void save(Account account) {


    }

    ;

}
