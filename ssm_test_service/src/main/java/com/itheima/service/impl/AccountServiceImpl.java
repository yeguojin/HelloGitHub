package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :YeGuoJin
 * @Date : 2020/12/3 20:49
 * @Version 1.0
 * @description :
 */
@Service("userService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public boolean save(Account account) {
        return accountDao.save(account);
    }

    @Override
    public boolean update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public boolean delete(Integer id) {
        return accountDao.delete(id);
    }

    @Override
    public PageInfo<Account> findAll(Integer currentPage,Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Account> lists= accountDao.findAll();

        return new PageInfo<Account>(lists);
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public boolean transfer(String from, String to, Double money) {

            accountDao.transferFrom(from,money);
            int i = 1/0;
            accountDao.transferTo(to,money);
            return true;
    }
}
