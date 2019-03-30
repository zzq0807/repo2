package com.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMbatis {

    @Test
    public void run() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }


        session.close();
        in.close();
    }

    @Test
    public void run1() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("钱七");
        account.setMoney(100);
        dao.save(account);
      /*  int i=7/0;*/

        session.close();
        in.close();
    }
}
