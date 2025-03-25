package com.solt.demo;

public class MySingletonClass {
	private static MySingletonClass instance;
	
	private MySingletonClass() {
		
		
	}
	public static MySingletonClass getInstance() {
		if (instance == null) {
			instance = new MySingletonClass();
		}
		return instance;
	}

}
