package com.jdc.inheritance.model;
import com.jdc.inheritance.model.Car;
//concrete class
public class ElectricalCar extends Car{
	private int batteryCapacity;
	
	public ElectricalCar(){
		super(door);//hard code
		System.out.println("ElectricalCar constructor called!");
	}
	
	public void setBatteryCapacity(int batteryCapacity){
		this.batteryCapacity = batteryCapacity;

	}
	public int getBetteryCapacity(){
		return batteryCapacity;
	}
	public void openDoor(){
		System.out.println("ElectricalCar is Opened!");

	}
	public void closeDoor(){
		System.out.println("ElectricalCar is closed!");
		
	}

	//Behavior
	public void chargeBattery(){
		System.out.println("Battery is charging...........");
		
	}


}