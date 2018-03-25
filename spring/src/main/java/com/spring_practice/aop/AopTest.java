package com.spring_practice.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		demoAnnotationService.add();
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		demoMethodService.add();
	}
}
