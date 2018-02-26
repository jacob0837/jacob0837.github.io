package BeanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BeanFactoryBean implements BeanFactoryAware{

  public BeanFactoryBean() {System.out.println("实例化 BeanFactoryBean");}

	//	容器将会调用该方法，将自身的引用传给实现了 BeanFactoryAware接口 的类
	@Override  //必须实现的方法
	public void setBeanFactory(BeanFactory bf) throws BeansException {
		System.out.println("容器调用该方法；Bean获得IoC容器的信息");
		
		//是否存在ID号为"first"的JavaBean；  true：存在；  false：不存在
		boolean isHave = bf.containsBean("first");
		   System.out.println("FirstBean"+(isHave?"存在":"不存在"));
		
		//ID号为"first"的JavaBean是否单例模式；  true：单例；  false：原型
   boolean isSingleton = 	bf.isSingleton("first");
      System.out.println("FirstBean是"+(isSingleton?"单例":"原型"));
		
	}
	
	
	

}
