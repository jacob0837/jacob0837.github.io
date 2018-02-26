package view;

import model.IAccount;

public class CommandLineView implements View {
	
	private IAccount account;
//	public CommandLineView(IAccount account){
//		this.account = account;
//	}
	public void setAccount(IAccount account) {
		this.account = account;
	}
	public String render() {
		return account.getData();
	}

}
