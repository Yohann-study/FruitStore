package com.yohann.service;

import com.yohann.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findAccount(Account account);
    void save(Account account);
}
