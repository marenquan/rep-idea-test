package com.itheima.dao;

import com.itheima.domain.Account;

public interface IAccountDao {
    Account findAllByAccountId(Integer id);
    Account findAllByName(Account account);
    void updateByAccountId(Account account);
}
