package com.spring_practice.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.spring_practice.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
