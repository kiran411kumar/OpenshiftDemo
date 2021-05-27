package com.nemana.service;

import com.nemana.dao.AccountsDao;
import com.nemana.entity.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsDao accountsDao;

    @Override
    public List<Accounts> getAllAccounts() {
        System.out.println("Inside service impl");
        return accountsDao.findAll();
    }
}
