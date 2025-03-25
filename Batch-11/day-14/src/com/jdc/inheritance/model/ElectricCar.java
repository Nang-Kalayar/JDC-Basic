 package com.jdc.inheritance.model;

public class ElectricCar extends Car{

	public int batteryCapacity;

	public ElectricCar(int door){
		super(door);//hard core
		System.out.println("ElectricCar constructor is called");
	}

	public void setBatteryCapacity(int batteryCapacity){
	this.batteryCapacity= batteryCapacity;
	}

	public int getBatteryCapacity(){
		return batteryCapacity;
	}

	public void chargeBattery(){
		System.out.println("battery is charging");
	}


}