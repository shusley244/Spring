package com.spring_practice.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 
 * @author qianjiajun
 *
 */
@Aspect
@Component
public class LogAspect {

	/**
	 * use @Pointcut to declare a PointCut which use referenced annotation
	 */
	@Pointcut(value = "@annotation(com.spring_practice.aop.Action)")
	public void annotationPointCut() {};
	
	@After(value = "annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截  " + action.name());
	}
	
	/**
	 * must pay attention to blank when using the expression
	 * @param joinPoint  
	 */
	@Before("execution(* com.spring_practice.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截," + method.getName());
	}
}
