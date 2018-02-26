package PreBeforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//读取XML文件并启动IOC容器
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("PreBeforeAdvice/applicationContext.xml");
		
        //从容器中取中ID号为pfb,动态产生一个代理对象,强转为接口类型
		IHello helloProxy = (IHello)context.getBean("pfb");
		
		//执行业务方法
		helloProxy.hello("达内");
		
	}

}

/*  打印结果：

PreBeforeAdvice.HelloSpeaker@16d2633 //object打印的
2008-12-28 17:30:50 PreBeforeAdvice.LogBeforeAdvice before //logger打印的
信息: 日志记录开始。。。
Hello 达内
 */

