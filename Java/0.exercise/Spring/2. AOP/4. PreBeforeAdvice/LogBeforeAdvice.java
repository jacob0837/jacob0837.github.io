package PreBeforeAdvice;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{
	
    private Logger logger =	Logger.getLogger(this.getClass().getName());

    	
	@Override //必须实现的方法；框架自动调用
	public void before(Method method, Object[] arg1, Object object) throws Throwable {
		//method=hello(String)
		
		//System.out.println(arg1.length); //打印是 1
		System.out.println(object);
		logger.info("日志记录开始。。。");
		
	}
	

}
