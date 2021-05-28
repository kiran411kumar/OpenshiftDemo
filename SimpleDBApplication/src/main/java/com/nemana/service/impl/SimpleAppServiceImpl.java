package com.nemana.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nemana.dao.AccountsDao;
import com.nemana.entity.Accounts;
import com.nemana.service.SimpleAppService;

@Service
public class SimpleAppServiceImpl implements SimpleAppService {
	
	/*@Autowired
	private AccountsDao accountsDao;*/

	@Override
	public List<Accounts> getAllAccounts() {
		// TODO Auto-generated method stub
		//return accountsDao.findAll();
		return null;
	}

}
