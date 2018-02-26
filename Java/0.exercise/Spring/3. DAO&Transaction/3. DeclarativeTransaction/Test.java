package DeclarativeTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
    ApplicationContext context = 
    	  new ClassPathXmlApplicationContext("DeclarativeTransaction/spring-config.xml");
    
    IUserDao userDao = 	(IUserDao)context.getBean("UserDaoImpl");
    
    User user = new User();
    user.setUserName("zhaojun");
    user.setUserGender("m");
    userDao.insert(user);
    
    userDao.find(1);//遍历

	}

}

/* 打印结果：

JdbcTemplate模版创建成功
insert User...
插入成功
遍历...
id	 name	 fender
1	 tom	 m
2	 marry	 f
3	 zhaojun	 m
*/