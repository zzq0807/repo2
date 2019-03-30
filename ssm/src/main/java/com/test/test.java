package com.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();

    }

    @Test
    public void testSave(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService as = (AccountService) ac.getBean("accountService");
        Account account = new Account();
        account.setName("钱七");
        account.setMoney(100);

        as.save(account);

    }

}
