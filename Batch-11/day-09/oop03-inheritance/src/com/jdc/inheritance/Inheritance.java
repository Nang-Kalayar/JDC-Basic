package com.jdc.inheritance;

import com.jdc.inheritance.model.Car;
import com.jdc.inheritance.model.ElectricCar;
import com.jdc.inheritance.model.Calculator;

public class Inheritance{
	public static void main(String[] args) {
		new Inheritance().launch();
	}

	private void launchThree(){
		Calculator.calculate((byte)10);
	}
	private void launchFour(){
		Book book = new Book("",0,)
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
		car.openDoor();
		car.closeDoor();
		car.chargeBattery();
		ElectricalCar.countUp();
		System.out.println("Count "+ ElectricalCar.getCount());
	}
}