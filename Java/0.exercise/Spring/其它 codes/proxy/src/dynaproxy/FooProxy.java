package dynaproxy;

public class FooProxy implements IFoo {

	private IFoo foo;
	public FooProxy(IFoo foo){
		this.foo = foo;
	}
	public void doA() {
		System.out.println("before doA()~~~");
		foo.doA();
		System.out.println("after doA()~~~");
	}

	public void doB() {
		System.out.println("before doB()~~~");
		foo.doB();
		System.out.println("before doB()~~~");
	}

	public void doC() {
		System.out.println("before doC()~~~");
		foo.doC();
		System.out.println("before doC()~~~");
	}

}
