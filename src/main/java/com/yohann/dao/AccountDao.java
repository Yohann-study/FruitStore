package com.yohann.dao;

import com.yohann.entity.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
    Account findAccount(Account account);
    void save(Account account);
}
