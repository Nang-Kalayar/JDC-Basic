package com.solt.demo.beans;

import org.springframework.stereotype.Component;

@Component

public class Student {
	private String name="Solt";

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
