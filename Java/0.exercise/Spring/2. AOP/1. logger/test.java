package logger;

public class test {
	public static void main(String[] args) {
		HelloLogger hl = new HelloLogger();
		hl.hello("张三");
	}

}

/*  打印结果：

2008-12-25 17:05:26 logger.HelloLogger hello
信息: 日志开始记录
你好, 张三
2008-12-25 17:05:30 logger.HelloLogger hello
信息: 日志结束
*/