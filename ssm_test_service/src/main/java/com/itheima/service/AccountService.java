package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author :YeGuoJin
 * @Date : 2020/12/3 20:49
 * @Version 1.0
 * @description :
 */
@Transactional(readOnly = true)
public interface AccountService {
    @Transactional(readOnly = false)
    boolean save(Account account);

    @Transactional(readOnly = false)
    boolean update(Account account);

    @Transactional(readOnly = false)
    boolean delete(Integer id);

    public PageInfo<Account> findAll(Integer currentPage, Integer pageSize);

    Account findById(Integer id);

    @Transactional(readOnly = false)
    boolean transfer(String from, String to, Double money);
}
