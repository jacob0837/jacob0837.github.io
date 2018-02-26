package DynamicLogger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;
import java.lang.reflect.Proxy;

//动态代理(切面)，使用一个日志处理器，服务于多个对象。必须实现InvocationHandler接口
public class LogHandler implements InvocationHandler {

	//日志记录器
	private Logger logger = Logger.getLogger("HelloLog");
	
	//目标对象
	private Object targetObject;
	
	//代理对象调用目标对象的方法，后返回
	//代理。 代理调用目标。 目标返回代理。 自动注入
	@Override //必须实现
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
	     System.out.println("回调 invoke()");
	     //写日志
	     logger.info("日志开始记录。。。");
	     Thread.sleep(2000);
	     
	     //调用目标对象的方法。 返回值为代理对象
	     result = method.invoke(targetObject, args);
	     //hello.(HelloBusiness,username);
	     
	     logger.info("日志结束。。。");
				
		return result;
	}
	
	//传入目标对象，动态产生代理对象
	public Object bind(Object targetObject){
		System.out.println("正调 bind()");
		this.targetObject = targetObject;
		return (
				//参数一：目标对象的类加载器
				//参数二：目标对象实现的接口
				//参数三：LogHandler的实例产生
				//返回值：根据接口和目标对象动态产生的代理对象
				Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
						targetObject.getClass().getInterfaces(),this)	);
	}

}
