package DynamicLogger;

public class test {
	
	public static void main(String[] args) {
		//创建LogHandler的实例
		LogHandler log = new LogHandler();
		
		//由接口和目标对象，动态产生代理对象
		IHello helloProxy = (IHello) log.bind(new HelloBusiness());
		
		helloProxy.hello("张三");
}}

/*  打印结果：

正调 bind()
回调 invoke()
2008-12-26 10:33:58 DynamicLogger.LogHandler invoke
信息: 日志开始记录。。。
你好， 张三
2008-12-26 10:34:00 DynamicLogger.LogHandler invoke
*/