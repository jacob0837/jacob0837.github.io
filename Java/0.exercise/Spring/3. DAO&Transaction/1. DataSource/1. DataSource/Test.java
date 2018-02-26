package DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
    ApplicationContext context = 
    	  new ClassPathXmlApplicationContext("DataSource/spring-config.xml");

	}

}

/* 打印结果：

与数据库成功连接
*/