package com.solt.demo;




import com.solt.demo.beans.Student;

public class Main {
	
	AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext  ("AppConfig.class");
	context.registershutdownhook();
	
	Student student = context.getBean(Student.class);
	System.out.println(student.studentInfo());
	
	
	
	
}
