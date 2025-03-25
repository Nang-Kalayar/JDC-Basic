package com.jdc.teaching;

public class Lesson{

	private String name;
	private Course course;

	public Lesson(String name,Course course){
		this.course = course;
		this.name = name;
	}
	public void showInfo(){
		System.out.println("This is " +name + " lesson from" + course.name);
	}

}