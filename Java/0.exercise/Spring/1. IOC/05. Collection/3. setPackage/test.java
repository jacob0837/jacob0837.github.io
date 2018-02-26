package setPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("setPackage/Spring-Config.xml");
		
		SetBean sb = (SetBean)context.getBean("setBean");
		
		sb.show();

	}
}

/*   打印结果：

书名->OOAD
作者->张三
出版社->人民出版社
=======
书名->HTML
作者->李四
出版社->广东出版社
=======
书名->JavaScript
作者->王五
出版社->商务出版社
=======
*/
