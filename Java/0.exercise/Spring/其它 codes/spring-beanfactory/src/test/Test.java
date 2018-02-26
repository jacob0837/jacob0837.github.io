package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import view.View;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Account account = new Account();
//		account.setId(10001);
//		account.setName("Eric");
//		View view = new CommandLineView(account);
//		Resource resource  = new ClassPathResource("bean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		View view = (View)factory.getBean("view");
		View view = (View)context.getBean("view");
		String result = view.render();
		System.out.println(result);
	}

}
