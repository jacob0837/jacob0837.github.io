package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.vo.Account;

public class JdbcAccountDao extends JdbcDaoSupport implements IAccountDao{

	public void deposit(long id, double amount) {
		String sql = "update account set balance = balance+? where id=?";
		Object[] args = new Object[]{amount,id};
		this.getJdbcTemplate().update(sql, args);
	}

	public long open(String name, double init) {
		String sql = "insert into account(id,name,balance) values(?,?,?)";
		long id = System.currentTimeMillis();
		Object[] args = new Object[]{id,name,init};
		this.getJdbcTemplate().update(sql, args);
		return id;
	}

	public List<Account> queryAccountsByName(String name) {
		String sql = "select * from account where name=?";
		Object[] args = new Object[]{name};
		List<Account> result = new ArrayList<Account>();
		List<Map> list = this.getJdbcTemplate().queryForList(sql, args);
		for(Map m:list){
			Account a = new Account();
			a.setId((Long)m.get("id"));
			a.setName((String)m.get("name"));
			a.setBalance((Double)m.get("balance"));
			result.add(a);
		}
		return result;
	}

	public void transfer(long ida, long idb, double amount) {
		withdraw(ida, amount);
		deposit(idb, amount);
	}

	public void withdraw(long id, double amount) {
		String sql = "update account set balance = balance-? where id=?";
		Object[] args = new Object[]{amount,id};
		this.getJdbcTemplate().update(sql, args);
	}

}
