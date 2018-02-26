package tarena;

//业务类
public class HelloBean {
    
	//构造方法
	public HelloBean() {	//调用的第一步
		System.out.println("调用空参构造方法：通过反射取得HelloBean的实例");
	}
	
	public HelloBean(String hello) {//不调用
		this.hello = hello;
		System.out.println("调用带参构造方法");
	}
	
	//实例变量
	private String hello;

	public String getHello() {
		System.out.println("调用get属性方法");
		return hello;
	}

	public void setHello(String hello) {//调用的第二步
		System.out.println("调用set属性方法：SpringIoc容器将信息注入到HelloBean中");
		this.hello = hello;
	}
}

