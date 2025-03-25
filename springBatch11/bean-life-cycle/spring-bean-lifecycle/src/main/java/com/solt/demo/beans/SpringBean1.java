package com.solt.demo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SpringBean1 implements  InitializingBean,DisposableBean{
	private SpringBean2 springBean2;
	public SpringBean1() {
		System.out.println("SpringBean1 instantiated");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("SpringBean1 postConstruct method called..");
	}

	@Autowired
	public void setSpringBean2(SpringBean2 springBean2) {
		System.out.println("SpringBean2 setter method called with DI..");
		this.springBean2 = springBean2;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("SpringBean1 afterPropertiesSet method called..");
	}
	
	public void customInit() {
		System.out.println("SpringBean1 customInit method called..");
	}
	public String greet(String name) {
		return "Hello " + name;
    }
	@PreDestroy
	public void preDestroy() {
		System.out.println("SpringBean1 preDestroy method called..");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("SpringBean1 DisposableBean::destroy method called..");
		
	}
	public void customDestory() {
		System.out.println("SpringBean1 customDestory method called..");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
