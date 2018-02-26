package propertiesPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("propertiesPackage/Spring-Config.xml");
		
		PropertiesBean pb = (PropertiesBean)context.getBean("propertiesBean");
		
		System.out.println("key1: "+pb.getProps().getProperty("ISBN1000"));
		System.out.println("key2: "+pb.getProps().getProperty("ISBN2000"));
		System.out.println("key3: "+pb.getProps().getProperty("ISBN3000"));
	}
}

/*  打印结果：

key1: Spring
key2: OOAD
key3: COre Java
*/