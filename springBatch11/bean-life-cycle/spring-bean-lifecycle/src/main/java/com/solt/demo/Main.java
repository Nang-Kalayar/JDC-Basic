package com.solt.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.solt.demo.beans.SpringBean1;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		context.registerShutdownHook();
		
		SpringBean1 springBean1 = context.getBean(SpringBean1.class);
		System.out.println(springBean1.greet("John Doe"));
		
	}

}
