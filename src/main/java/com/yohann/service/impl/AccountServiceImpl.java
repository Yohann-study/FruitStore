package com.yohann.service.impl;

import com.yohann.dao.AccountDao;
import com.yohann.entity.Account;
import com.yohann.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findAccount(Account account) {
        return accountDao.findAccount(account);
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
