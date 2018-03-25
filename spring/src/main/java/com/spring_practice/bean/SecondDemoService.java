package com.spring_practice.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondDemoService {

	@Autowired
	private FirstDemoService firstDemoService;
	public void print() {
		System.out.println("this is the seond demo service...");
		firstDemoService.print();
	}
}
