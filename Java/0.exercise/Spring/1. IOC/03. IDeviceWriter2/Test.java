package IDeviceWriter2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("IDeviceWriter2/Spring-Config.xml");
		
		
		BusinessBean business = (BusinessBean)context.getBean("business");
		
		
		business.save();

	}

}
