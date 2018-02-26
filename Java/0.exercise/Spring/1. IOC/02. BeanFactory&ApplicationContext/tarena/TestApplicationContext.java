package tarena;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
	public static void main(String[] args) {
		
	//读取XML文件，并且启动SpringIoc容器
	ApplicationContext context = 
		new ClassPathXmlApplicationContext("tarena/Spring-Config.xml");
	
	//从容器中根据ID取得HelloBean的实例
	HelloBean hb = (HelloBean)context.getBean("hb");
	
	//调用业务方法
	System.out.println(hb.getHello());

}}
