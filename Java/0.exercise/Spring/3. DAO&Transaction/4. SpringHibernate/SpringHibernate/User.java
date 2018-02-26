package SpringHibernate;

import java.io.Serializable;

public class User implements Serializable {
	
	private Integer userId;
	private String userName;
	private String userGender;
	
	public User() {}
	public User(String userName, String userGender) {
		this.userName = userName;
		this.userGender = userGender;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
}
