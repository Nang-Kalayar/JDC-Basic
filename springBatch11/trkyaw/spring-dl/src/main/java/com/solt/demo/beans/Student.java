package com.solt.demo.beans;

public class Student {
	private String name;
	private Address address;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String studentInfo() {
		return "%s lives in %S"
				.formatted(name,address.getCity());
		
	}

}
