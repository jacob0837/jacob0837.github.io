package BeanLife;

import java.util.Date;

public class LifeBean {
	
	//数据库连接
	private String conn;
	
	public LifeBean(){System.out.println("构造方法：实例化-No1");}

	public String getConn() {	return conn;}
	
	public void setConn(String conn) {
		this.conn = conn;
		System.out.println("set方法：信息注入-No2");
	}
	
	//Bean的实例化
	public void initBean(){
		System.out.println("连接数据库-No3");
		//
	}
	
	//Bean的销毁
	public void destroyBean(){
		System.out.println("关闭数据库连接-No4");
	}

}
