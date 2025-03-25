package com.solt.demo;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("CustomBeanFactoryPostProcessor.postProcessBeanFactory() called");
		Arrays.stream(beanFactory.getBeanDefinitionNames())
		.sorted()
		.forEach(System.out::println);
		System.out.println();
	}

}
