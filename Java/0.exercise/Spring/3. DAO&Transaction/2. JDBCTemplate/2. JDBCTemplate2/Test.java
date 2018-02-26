package JDBCTemplate2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {

		ApplicationContext context = 
			new ClassPathXmlApplicationContext("JDBCTemplate2/spring-config.xml");
		
		IDao dao = (IDao)context.getBean("DaoImpl");
		
		//dao.insert();
		
		dao.findAllStaff();
		
		//dao.findStaffById(5);
		
		//dao.deleteStaffByName("tony");
	}

}


/* 打印结果：

1	tom	m
2	marry	f
4	wangchao	m
5	zhaojun	m
*/