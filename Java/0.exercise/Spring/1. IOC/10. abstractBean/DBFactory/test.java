package DBFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("DBFactory/applicationContext.xml");
		
  	DBManager mm = (DBManager)context.getBean("dbManager");
  	
  	mm.display();
		
	}

}

/*  打印结果：

driver:com.mysql.jdbc.Driver
url:jdbc:mysql://localhost:3306/test
user:root
password:
*/