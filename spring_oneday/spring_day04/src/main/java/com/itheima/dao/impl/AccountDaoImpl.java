package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;

import java.lang.reflect.InvocationHandler;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    @Override
    public Account findAllByAccountId(Integer id) {
        return null;
    }

    public Account findAllByName(Account account) {
        return null;
    }

    public void updateByAccountId(Account account) {

    }
}
