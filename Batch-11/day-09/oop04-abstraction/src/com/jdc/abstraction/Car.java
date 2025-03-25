package com.jdc.abstraction;

public abstract class Car extends Vehicle{
	private int door;
	public Car(String model,String color,int year){
		super(model,color,year);
		this.door = door;
	}
	public int getDoor(){
		return door;
	}

	@Override
	public abstract void startEnginge();

	@Override
	public abstract void stopEnginge();

	//@Override 
	////can override on concrete class
	//public void move(){
		//System.out.println("Car is moving...");

	}
