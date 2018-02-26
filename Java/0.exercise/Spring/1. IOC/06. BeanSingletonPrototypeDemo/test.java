package BeanSingletonPrototypeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("BeanSingletonPrototypeDemo/Spring-Config.xml");
		
		for(int i=0;i<10;i++){
		DBBean dbb = (DBBean)context.getBean("dbBean");
		System.out.println(dbb.hashCode());
		}
	}

}
