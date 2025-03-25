package com.solt.demo;

public class Main {							
	public static void main(String[] args) {
		
		
	MyClass ob1 = new MyClass("Nann Nann");
	MyClass ob2 = (MyClass) ob1.clone();
	System.out.println(ob1.getName());
	System.out.println(ob2.getName());
	System.out.println(ob1);
	System.out.println(ob2);
	
	
	
	
	
		
		
		
	}
}
