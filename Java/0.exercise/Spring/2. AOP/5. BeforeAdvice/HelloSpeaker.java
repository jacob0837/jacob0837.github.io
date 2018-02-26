package BeforeAdvice;

public class HelloSpeaker implements IHello {

	//业务实现的方法
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

	public void goodbye(String str) {		
		System.out.println("GoodBye "+str);
	}

}
