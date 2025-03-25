package com.solt.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.solt.demo.beans.MyClass;
import com.solt.demo.beans.Student;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = context.getBean(Student.class);
        System.out.println(student.getName());
		
		
	}
		
		

}
