package com.spring_practice.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		FirstDemoService firstDemoService = (FirstDemoService) applicationContext.getBean("getFirstDemo");
		firstDemoService.print();
		SecondDemoService secondDemoService = applicationContext.getBean(SecondDemoService.class);
		secondDemoService.print();
	}
}
