package publishEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("publishEvent/applicationContext.xml");
		
		context.publishEvent(new SomeEvent("下课了"));
		context.publishEvent(new AnotherEvent("吃饭了"));

	}

}

/*  打印结果：

tom 10点30分监听到SomeEvent：下课了
publishEvent.SomeEvent[source=下课了]
监听到AnotherEvent：吃饭了
*/
