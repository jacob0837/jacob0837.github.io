package dynaproxy;

import java.lang.reflect.Proxy;

public class Clinet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬����ķ�ʽ
//		IFoo target = new Foo();
//		IFoo foo = new FooProxy(target);
//		foo.doA();
//		foo.doB();
//		foo.doC();
		//��̬����ķ�ʽ
		//1 �������  2 ָ��ҪĿ�����Ľӿڵ����� 3 ����Ŀ��������Ҫ���е�ҵ���߼�����
	 	IFoo target = new Foo();
		IFoo foo = (IFoo)Proxy.newProxyInstance(
				Clinet.class.getClassLoader(), 
				new Class[]{IFoo.class}, 
				new FooDynaProxy(target));
	 	foo.doA();
	 	foo.doB();
	 	foo.doC();
	}

}
