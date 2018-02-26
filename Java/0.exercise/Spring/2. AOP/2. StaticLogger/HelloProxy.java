package StaticLogger;

import java.util.logging.Logger;

//代理类，需要用户自己创建，不能动态生成
public class HelloProxy implements IHello {

	private Logger logger = Logger.getLogger("HelloLog");
	private IHello helloBusiness;

	public HelloProxy(IHello ih){this.helloBusiness = ih;}
	
	@Override
	public void hello(String username) {
		//日志代码
		logger.info("日志开始。。。");
				
		//调用目标对象，执行业务方法
		helloBusiness.hello(username);
		
    try { Thread.sleep(2000); }
    catch (InterruptedException e) {e.printStackTrace();}
		
		logger.info("日志结束。。。");

	}
	
}
