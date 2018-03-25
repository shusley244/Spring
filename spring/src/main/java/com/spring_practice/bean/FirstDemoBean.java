package com.spring_practice.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstDemoBean {
	
	//Bean's name is the method name.
	@Bean
	public FirstDemoService getFirstDemo() {
		return new FirstDemoService();
	}
}
