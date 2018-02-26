package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundInterptorFoo implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("before "+mi.getMethod().getName());
		mi.proceed();
		System.out.println("after "+mi.getMethod().getName());
		return null;
	}
}
