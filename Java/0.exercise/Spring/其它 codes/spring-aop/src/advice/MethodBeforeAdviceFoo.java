package advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeAdviceFoo implements MethodBeforeAdvice {

	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("before "+method.getName()+"~~~");
	}

}
