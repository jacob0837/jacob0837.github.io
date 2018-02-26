package tarena;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class test {
	public static void main(String[] args) {
		
		//读取配置文件spring-config.xml
		//方法一：类路径
		//Resource rs = new ClassPathResource("tarena/Spring-Config.xml");
		
		//方法二：文件路径
		//封装IO操作           //要写完全路径，如：src/tarena/Spring-Config.xml
		Resource rs2 = new FileSystemResource("tarena/Spring-Config.xml");
		
		//构造IO容器， 并启动容器
		BeanFactory factoryIoc = new XmlBeanFactory(rs2);
		
		//从容器中，通过ID号，取得HelloBean的实例
		HelloBean hb = (HelloBean) factoryIoc.getBean("hb");
		
		System.out.println(hb.getHello());
	}

}


/*   打印结果：
调用空参构造方法：通过反射取得HelloBean的实例
调用set属性方法：SpringIoc容器将信息注入到HelloBean中
调用get属性方法
大家好
*/
