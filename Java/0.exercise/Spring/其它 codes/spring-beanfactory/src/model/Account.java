package model;

import java.util.Map;
import java.util.Properties;

public class Account implements IAccount{
	private int id;
	private String name;
	private Map subAccount;
	private Properties log;
	public Account(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map getSubAccount() {
		return subAccount;
	}
	public void setSubAccount(Map subAccount) {
		this.subAccount = subAccount;
	}
	public Properties getLog() {
		return log;
	}
	public void setLog(Properties log) {
		this.log = log;
	}
	public String getData() {
		return "id="+id+"\n"
				+"name="+name+"\n"
				+"subAccount="+subAccount+"\n"
				+"log="+log+"\n";
	}
}
