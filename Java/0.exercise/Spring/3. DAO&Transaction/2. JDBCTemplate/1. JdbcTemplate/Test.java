package JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
    ApplicationContext context = 
    	  new ClassPathXmlApplicationContext("JdbcTemplate/spring-config.xml");
    
    IUserDao userDao = 	(IUserDao)context.getBean("UserDaoImpl");
    userDao.find(1);

	}

}

/* 打印结果：

JdbcTemplate模版创建成功
find id...
id	name	fender
1	tom	m
*/