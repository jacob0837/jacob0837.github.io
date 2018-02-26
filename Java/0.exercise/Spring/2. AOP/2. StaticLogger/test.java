package StaticLogger;

public class test {
	
	public static void main(String[] args) {
	
	//HelloBusiness: 目标对象
	//HelloProxy:代理对象
	//IHello接口
	IHello proxy = new HelloProxy(new HelloBusiness());
	
	proxy.hello("李四");

}}

/*  打印结果：

2008-12-25 18:00:21 StaticLogger.HelloProxy hello
信息: 日志开始。。。
你好， 李四
2008-12-25 18:00:24 StaticLogger.HelloProxy hello
信息: 日志结束。。。
*/