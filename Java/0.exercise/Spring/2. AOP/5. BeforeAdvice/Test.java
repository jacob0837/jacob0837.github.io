package BeforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//读取XML文件并启动IOC容器
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("BeforeAdvice/applicationContext.xml");
		
		IHello helloProxy = (IHello)context.getBean("helloSpeaker");//之前是 getBean("lba");
		
		//执行业务方法
		helloProxy.hello("达内");//普通的方法调用
		helloProxy.goodbye("达内");//加入切面
		
	}

}

/*  打印结果：

Hello 达内
日志开始。。。
GoodBye 达内
 */

