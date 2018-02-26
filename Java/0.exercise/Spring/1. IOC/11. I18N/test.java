package I18N;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("I18N/applicationContext.xml");
				
		//查找 .properties 文件
		//参数一：属性文件中的key
		//参数二：向属性文件传参数
		//参数三： Local信息
		//返回值：对应属性的value
		
		String msg = context.getMessage("hello.key", new Object[]{"jack","Tom"},Locale.US);
		System.out.println("英文： "+msg);
		
        //找不到或默认语系，都是以操作系统的语系为标准
		msg = context.getMessage("hello.key", new Object[]{"jack"},Locale.getDefault());
		System.out.println("中文： "+msg);
		
		msg = context.getMessage("hello.key", new Object[]{"jack"},Locale.CANADA);
		System.out.println("找不到的： "+msg);
				
	}

}

/*  打印结果：

英文： welcom to China, jack and Tom!
中文： 欢迎 jack 来到中国！
找不到的： 欢迎 jack 来到中国！
*/