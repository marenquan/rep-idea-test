package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

//账户的业务层接口
public interface IAccountService {
    //查询所有功能
    List<Account> findAllAccount(Integer accountId);
    //根据条件查询，查询一个
    Account findAccountByID();
    //保存操作
    void saveAccount(Account account);
    //更新操作
    void updateAccount(Account account);
    //删除操作
    void deleteAccount(Integer accountId);


}
