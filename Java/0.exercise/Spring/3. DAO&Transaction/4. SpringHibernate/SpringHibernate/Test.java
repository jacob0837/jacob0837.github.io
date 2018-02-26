package SpringHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
    ApplicationContext context = 
    	  new ClassPathXmlApplicationContext("SpringHibernate/spring-config.xml");
    
    IUserDao userDao = 	(IUserDao)context.getBean("UserDaoImpl");
    
    User user = new User();
    user.setUserName("zhaojun");
    user.setUserGender("m");
    userDao.insert(user);
    
    userDao.find(0);
	}

}

/* 打印结果：

正在增加用户。。。
成功将zhaojun的信息加入数据库
正在查询用户。。。
id	name	gender
1	tom	m
2	marry	f
4	wangchao	m
5	zhaojun	m
*/