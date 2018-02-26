package arrayPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("arrayPackage/Spring-Config.xml");
		
		ArrayBean ab = (ArrayBean)context.getBean("arrayBean");
		
		ab.show();

	}
}

/*   打印结果：
书：OOAD
书：XML
书：HTML
书：Spring
*/
