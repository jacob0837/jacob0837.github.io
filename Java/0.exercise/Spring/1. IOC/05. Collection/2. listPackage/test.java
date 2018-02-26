package listPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("listPackage/Spring-Config.xml");
		
		ListBean lb = (ListBean)context.getBean("listBean");
		
		lb.show();

	}
}

/*   打印结果：
书：OOAD
书：XML
书：HTML
书：Spring
*/
