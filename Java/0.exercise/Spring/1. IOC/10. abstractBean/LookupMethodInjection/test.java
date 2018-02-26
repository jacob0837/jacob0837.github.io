package LookupMethodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("LookupMethodInjection/applicationContext.xml");
		
  	MessageManager mm = (MessageManager)context.getBean("messageManager");
  	
  	mm.display();
		
	}

}

/*  打印结果：

当前时间为：Thu Dec 25 13:42:27 CST 2008
*/