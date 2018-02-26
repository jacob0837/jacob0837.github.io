package AutoWireBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("AutoWireBean/Spring-Config.xml");
		
		HelloBean hb = (HelloBean)context.getBean("helloBean");
		
		System.out.println("姓名："+hb.getStaffName());
		System.out.println("入职时间："+hb.getStaffTime());
	}

}

/*  打印结果：

姓名：李江
入职时间：Thu Dec 25 10:04:46 CST 2008（当前时间）
*/