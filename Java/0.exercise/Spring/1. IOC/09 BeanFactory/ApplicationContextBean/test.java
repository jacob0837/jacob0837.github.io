package ApplicationContextBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = 
			new ClassPathXmlApplicationContext("ApplicationContextBean/Spring-Config.xml");
		
		//取出ID号为"acb"的Bean
		ApplicationContextBean acb = (ApplicationContextBean) context.getBean("acb");

	}

}

/*  打印结果：

实例化ApplicationContextBean
容器调用 setApplicationContext方法
FirstBean存在
FirstBean是原型模式
SecondBean存在
SecondBean是单例模式
*/