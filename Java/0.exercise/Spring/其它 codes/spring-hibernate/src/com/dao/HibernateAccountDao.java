package com.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pojo.Account;

public class HibernateAccountDao extends HibernateDaoSupport implements IAccountDao{

	public void deposit(long id, double amount) {
		Account a = (Account)this.getHibernateTemplate().get(Account.class, id);
		a.setBalance(a.getBalance()+amount);
	}

	public long open(String name, double init) {
		long id = System.currentTimeMillis();
		Account a = new Account();
		a.setId(id);
		a.setName(name);
		a.setBalance(init);
		this.getHibernateTemplate().save(a);
		return id;
	}

	public void transfer(long ida, long idb, double amount) {
		withdraw(ida, amount);
		deposit(idb, amount);
	}

	public void withdraw(long id, double amount) {
		Account a = (Account)this.getHibernateTemplate().get(Account.class, id);
		System.out.print(a);
		a.setBalance(a.getBalance()-amount);
	}

	public List<Account> queryAccountsByName(String name) {
//		String hql = "from Account where name = '"+name+"'";
		DetachedCriteria dc = DetachedCriteria.forClass(Account.class,"a");
		if(null!=name && !"".equals(name)){
			dc.add(Restrictions.eq("a.name", name));
		}
		List<Account> result = this.getHibernateTemplate().findByCriteria(dc);
		return result;
	}

}
