package dynaproxy;

import java.lang.reflect.Proxy;

public class Clinet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//静态代理的方式
//		IFoo target = new Foo();
//		IFoo foo = new FooProxy(target);
//		foo.doA();
//		foo.doB();
//		foo.doC();
		//动态代理的方式
		//1 类加载器  2 指定要目标对象的接口的数组 3 拦截目标对象后需要进行的业务逻辑规则
	 	IFoo target = new Foo();
		IFoo foo = (IFoo)Proxy.newProxyInstance(
				Clinet.class.getClassLoader(), 
				new Class[]{IFoo.class}, 
				new FooDynaProxy(target));
	 	foo.doA();
	 	foo.doB();
	 	foo.doC();
	}

}
