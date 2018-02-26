package BeanLife;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		/*ApplicationContext context = 
			new ClassPathXmlApplicationContext("BeanLife/Spring-Config.xml");*/
		
   AbstractApplicationContext context = 
	     new ClassPathXmlApplicationContext("BeanLife/Spring-Config.xml");

		LifeBean lb = (LifeBean)context.getBean("lifeBean");
		
		System.out.println("调用JavaBean："+lb.getConn());
		
        //向JVM注册销毁Bean实例
   context.registerShutdownHook();

	}

}

/*  打印结果：

构造方法：实例化-No1
set方法：信息注入-No2
连接数据库-No3
调用JavaBean：connection
关闭数据库连接-No4
*/
