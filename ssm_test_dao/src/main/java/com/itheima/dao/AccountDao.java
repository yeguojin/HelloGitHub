package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author :YeGuoJin
 * @Date : 2020/12/3 20:36
 * @Version 1.0
 * @description :
 */
public interface AccountDao {

    boolean save(Account account);

    boolean update(Account account);

    boolean delete(Integer id);

    List<Account> findAll();

    Account findById(Integer id);

    boolean transferFrom(@Param("name") String name,@Param("money") Double money);

    boolean transferTo(@Param("name") String name,@Param("money") Double money);


}
