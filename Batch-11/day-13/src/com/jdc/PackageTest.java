package com.jdc;
import com.jdc.teaching.*;
import com.jdc.registration.*;

public class PackageTest{
	public static void main(String[] args) {
		Course c = new Course ("Java SE");
		Student student = new Student("Aung Aung");

		student.takeCourse(c);
		student.sayYourCourse();
	}
}