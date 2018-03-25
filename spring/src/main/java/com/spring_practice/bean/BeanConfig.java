package com.spring_practice.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan will automatically scan the referenced package 
 * which used @Service @Component @Repository @Controller POJO 
 * and register them to beans.
 * 
 * Compared to @Configuration,@Service.... in the function have not difference.
 * But we are used to @Configuration to define properties POJO and database connections,
 * and so on which are related to properties.
 * @author qianjiajun
 *
 */
@ComponentScan("com.spring_practice.bean")
@Configuration
public class BeanConfig {

}
