package PropertyPlaceholderConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("PropertyPlaceholderConfigurer/applicationContext.xml");
		
		DBBean dbb = (DBBean)context.getBean("dbBean");

		System.out.println(dbb);
	}

}

/*  打印结果：

driver:com.mysql.jdbc.Driver
url:jdbc:mysql://localhost:3306/test
user:root
password:
*/