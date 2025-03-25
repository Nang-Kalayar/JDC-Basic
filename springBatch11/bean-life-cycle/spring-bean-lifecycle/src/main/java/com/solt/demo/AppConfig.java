package com.solt.demo;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.solt.demo.beans.SpringBean1;


@ComponentScan
@Configuration
public class AppConfig {
	@Bean
	public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}
	@Bean
	public static BeanPostProcessor beanPostProcessor() {
		return new CustomBeanPostProcessor();
	}
	
	@Bean(initMethod = "customInit", destroyMethod = "customDestory")
	public SpringBean1 springBean1() {
		return new SpringBean1();
	}

}
