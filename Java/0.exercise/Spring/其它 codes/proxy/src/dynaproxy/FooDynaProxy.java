package dynaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FooDynaProxy implements InvocationHandler {
	
	private IFoo target;
	public FooDynaProxy(IFoo foo){
		this.target = foo;
	}
	public Object invoke(Object arg0, Method method, Object[] arg2)
			throws Throwable {
//		System.out.println("before "+method.getName()+"~~~");
		method.invoke(target, arg2);
		System.out.println("after "+method.getName()+"~~~");
		return null;
	}

}
