package DynamicLogger;

//实例
public class HelloBusiness implements IHello {

	@Override
	public void hello(String username){
		System.out.println("你好， "+username);
	}

}
