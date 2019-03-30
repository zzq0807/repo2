package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;

    public List<Account> findAll() {

        System.out.println("serice层findAll执行了");

        return dao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("serice层save执行了");
    }
}
