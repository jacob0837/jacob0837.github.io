package PreBeforeAdvice;

public class HelloSpeaker implements IHello {

	//业务实现的方法
	public void hello(String name) {
		System.out.println("Hello "+name);

	}

}
