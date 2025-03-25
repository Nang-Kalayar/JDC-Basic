package com.solt.demo;

public class MyClass implements IPrototype{
	private String name;
	
	
	public MyClass(String name) {
		super();
		this.name = name;
	}


	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

}
