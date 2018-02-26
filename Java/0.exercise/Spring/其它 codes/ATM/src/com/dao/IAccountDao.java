package com.dao;

import java.util.List;

import com.vo.Account;

public interface IAccountDao {
	long open(String name,double init);
	void withdraw(long id,double amount);
	void deposit(long id,double amount);
	void transfer(long ida,long idb,double amount);
	List<Account> queryAccountsByName(String name);
}
