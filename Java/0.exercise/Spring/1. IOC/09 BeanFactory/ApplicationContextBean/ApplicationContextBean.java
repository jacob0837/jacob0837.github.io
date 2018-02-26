package ApplicationContextBean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextBean implements ApplicationContextAware{
	
	public ApplicationContextBean() {System.out.println("实例化ApplicationContextBean");}

	//	容器将会调用该方法，将自身的引用传给实现了 BeanFactoryAware接口 的类
	@Override  //必须实现的方法
	public void setApplicationContext(ApplicationContext app)
	throws BeansException {	
		 System.out.println("容器调用 setApplicationContext方法");
		
		//是否存在ID号为"first"的JavaBean；  true：存在；  false：不存在
		boolean isHave = app.containsBean("firstBean");
		 System.out.println("FirstBean"+(isHave?"存在":"不存在"));

   //ID号为"first"的JavaBean是否单例模式；  true：单例；  false：原型
		boolean isSingleton = 	app.isSingleton("firstBean");
		  System.out.println("FirstBean是"+(isSingleton?"单例模式":"原型模式"));

		isHave = app.containsBean("secondBean");
			 System.out.println("SecondBean"+(isHave?"存在":"不存在"));

		isSingleton = 	app.isSingleton("secondBean");
			  System.out.println("SecondBean是"+(isSingleton?"单例模式":"原型模式"));
		
	}
	
	
	

}
