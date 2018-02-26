package logger;

import java.util.logging.Logger;

public class HelloLogger {
	
	//日志处理器；使用一个新的线程记录日志
	private Logger logger = Logger.getLogger("HelloLog");
	
	//业务方法
	public void hello(String name) {
		//混入系统代码
		logger.info("日志开始记录");
		
		//线程休息2秒
		try{Thread.sleep(2000);} catch (Exception e){}
		
		//主要业务
		System.out.println("你好, "+name);
		
		try{Thread.sleep(2000);} catch (Exception e){}
		logger.info("日志结束");
	}

}
