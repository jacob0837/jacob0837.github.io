package StaticLogger;

//实例
public class HelloBusiness implements IHello {

	//减去了系统代码，只写业务代码
	@Override
	public void hello(String username){
		System.out.println("你好， "+username);
	}

}
