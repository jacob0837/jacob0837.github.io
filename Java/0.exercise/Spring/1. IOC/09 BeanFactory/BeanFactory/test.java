package BeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("BeanFactory/Spring-Config.xml");
		
		BeanFactory bf = new XmlBeanFactory(r);
		
   BeanFactoryBean bfb = 	(BeanFactoryBean)bf.getBean("beanFactoryBean");

		
	}

}

/*  打印结果：

实例化 BeanFactoryBean
容器调用该方法；Bean获得IoC容器的信息
FirstBean存在
FirstBean是单例
*/