package com.jdc.registration;
import com.jdc.teaching.Course;

public class Student{
	String name;
	Course course;

	public Student(String name){
		this.name = name;
	}
	public void takeCourse(Course c){
		this.course = c;
	}
	public void sayYourCourse(){
		System.out.println("My name is " + name);
		System.out.println("I'm taking " + course.name);
	}
}


