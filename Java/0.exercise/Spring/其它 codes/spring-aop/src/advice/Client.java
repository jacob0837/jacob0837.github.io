package advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		IFoo foo = (IFoo)context.getBean("fooProxy");
		IFoo foo = (IFoo)context.getBean("foo2");
		foo.doA();
		foo.doB();
		foo.doC();
	}

}
