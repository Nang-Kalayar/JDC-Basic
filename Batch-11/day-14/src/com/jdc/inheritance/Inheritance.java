package com.jdc.inheritance;

import com.jdc.inheritance.model.Car;
import com.jdc.inheritance.model.ElectricCar;


public class Inheritance{
	public static void main(String[] args) {
		new Inheritance().launchFive(Car(1));
	}
	private void launchFive(Vehicle veh){
		System.out.println("Start");
		//System.out.println(veh instanceof Vehicle);//to avoid exception
		//pattern matching can use switch and instanceof 
		if (veh instanceof Car){
		Car car = (Car) veh;
		car.openDoor();
		car.closeDoor();
		}
		System.out.println("Terminated!");
	}
	private void launch(){
		var car = new ElectricCar(4);
		System.out.println("hash code" + car.hashCode());
		car.setMake("Nissan");
		car.setModel("v8");
		car.setYear(2018);
		car.setBatteryCapacity(21000);
		
		
		System.out.println("""
							make: %s
							model:%s
							year:%s
							door:%s"""
							.formatted(car.getMake(),car.getModel(),car.getYear(),car.getDoor())
							);
		car.startEngine();
		car.stopEngine();
	}
}