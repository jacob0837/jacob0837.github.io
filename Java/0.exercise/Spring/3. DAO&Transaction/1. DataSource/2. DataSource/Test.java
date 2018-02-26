package DataSource;

import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {

		ApplicationContext context = 
			new ClassPathXmlApplicationContext("DataSource/spring-config.xml");

		DataSource ds = (DataSource)context.getBean("dataSource");
		
		Connection conn = ds.getConnection();
		
		System.out.println(conn!=null?"取得连接":"未取得连接");
	}

}

/* 打印结果：

取得连接
*/






