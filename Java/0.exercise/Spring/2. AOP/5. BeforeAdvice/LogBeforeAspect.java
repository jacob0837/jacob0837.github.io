package BeforeAdvice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //日志切面
public class LogBeforeAspect {

//切入点
//在什么情况下执行before()
//@Before("execution(返回值 方法名(参数))")
//*  表示方法的返回值任意
//方法名：全路径,* 表示该接口所有方法均被监听
//参数：..表示不限

@Before("execution(* BeforeAdvice.IHello.goodbye(..))")
public void before(){
	System.out.println("加入切面。。。");
	//logger.info();
}

}



/*
public class LogBeforeAspect implements MethodBeforeAdvice{
public void before(*,*,*){
	System.out.println(object);
	System.out.println("日志开始。。。");
}}
*/