package com.jdc.abstraction;

public abstract class Vehicle{
	public static int count =1;

	private String model;
	private String color;
	private int year;

	static {
		System.out.println("Static block in Vehicle");
	}
	{
		System.out.println("Instance block in Vehicle");
	}
	public Vehicle(String model,String color,int year){
		System.out.println("Vehicle Constructor");
		this.model= model;
		this.color = color;
		this.year = year;
	}
	public String getMethod(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getYear(){
		return year;
	}
	public void startEnginge(){
		System.out.println("Vehicle enginne started");
	}
	public void stopEnginge(){
		System.out.println("Vehicle enginne stopped");
	}
	 public abstract void move();//no body method
}