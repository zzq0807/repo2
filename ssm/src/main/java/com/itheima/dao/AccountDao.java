package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();



    @Select("insert into account (name,money) values (#{name},#{money})" )
    void save(Account account);
}
