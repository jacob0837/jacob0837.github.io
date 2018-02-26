package advice;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

public class MyPointcut implements Pointcut{

	public ClassFilter getClassFilter() {
		return ClassFilter.TRUE;
	}

	public MethodMatcher getMethodMatcher() {
		return new MethodMatcher(){

			public boolean isRuntime() {
				return false;
			}

			public boolean matches(Method method, Class arg1) {
				if(method.getName().equals("doA") || method.getName().equals("doB")){
					return true;
				}
				return false;
			}

			public boolean matches(Method arg0, Class arg1, Object[] arg2) {
				return false;
			}
			
			
		};
	}

}
