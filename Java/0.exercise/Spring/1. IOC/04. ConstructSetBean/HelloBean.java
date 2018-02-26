package ConstructSetBean;

//业务对象
public class HelloBean {
	
	private String username;
	private int age;
	
//	满参构造方法
	public HelloBean(String username, int age) {
		super();
		this.username = username;
		this.age = age;
		System.out.println("满参构造方法，实例化、赋初值");
	}

     //为每个属性提供get方法；不需要set方法，因为满参构造方法已经赋值了
	public int getAge() {
		return age;
	}

	public String getUsername() {
		return username;
	}
	
	

}
