package com.jdc.inheritance.model;
//Method Overloading
public class Calculator{
	public static void calculate (int a,int b){
		System.out.println(a + b);
		
	}
	public static void calculate(int a ,double b){
		System.out.println(a + b);
	}
	public static void calculate(double a,int b){
		System.out.println(a + b);
	}
	public static void calculate (double a, double b)
	System.out.println(a + b);
 
}