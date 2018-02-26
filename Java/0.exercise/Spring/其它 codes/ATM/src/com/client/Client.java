package com.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.IAccountDao;
import com.vo.Account;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IAccountDao dao = (IAccountDao)context.getBean("dao");
		
		long ida = dao.open("eric", 10000);
		long idb = dao.open("jay", 20000);
		
		dao.transfer(ida, idb, 5000);
		
		List<Account> list1 = dao.queryAccountsByName("eric");
		for(Account a:list1){
			System.out.println(a.getId()+" "+a.getName()+" "+a.getBalance());
		}
		
		List<Account> list2 = dao.queryAccountsByName("jay");
		for(Account a:list2){
			System.out.println(a.getId()+" "+a.getName()+" "+a.getBalance());
		}
	}

}
