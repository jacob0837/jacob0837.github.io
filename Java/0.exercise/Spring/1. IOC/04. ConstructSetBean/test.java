package ConstructSetBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ConstructSetBean.HelloBean;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("ConstructSetBean/Spring-Config.xml");
		
		HelloBean hb = (HelloBean)context.getBean("hb");
		
		System.out.println("用户名："+hb.getUsername());
		System.out.println("年龄："+hb.getAge());

	}

}

/*  打印结果：
满参构造方法，实例化、赋初值
用户名：张三
年龄：22
*/
