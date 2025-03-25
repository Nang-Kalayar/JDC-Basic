package com.jdc.abstraction;

public  class AbstractionApplication{
	public static void main(String[] args) {
		new AbstractionApplication().run();
	}
	private void run(){
		Vehicle veh= new ElectricCar("BYD","Atto3",2023,4,60);
		veh.startEngine();
		veh.stopEngine();

		veh.move();
	}
}