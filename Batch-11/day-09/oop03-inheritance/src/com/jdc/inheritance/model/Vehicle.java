package com.jdc.inheritance.model;

public class Vehicle {
	private String make;
	private String model;
	protected int year;

	public Vehicle(){
	
		System.out.println ("Vehicle constructor called ");
	}

	public String getMake(){
		return make;
	}

	public void setMake(String make){
		this.make = make;
	}

	public String getModel(){
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}

	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year = year;
	}





	public void startEngine(){
		System.out.println("Vehicle engine started ");

	}

	public void stopEngine(){
		System.out.println("Vehicle engine is stopped");
	}
	public static void countUp(){
		count ++;
	}
	public static int getCount(){
		return count;

	}
}