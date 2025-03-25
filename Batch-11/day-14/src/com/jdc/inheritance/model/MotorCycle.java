package com.jdc.inheritance.model;

public class MotorCycle extends Vehicle{

	public int engineCC;

	public void setEngineCC(int engineCC){
		this.engineCC = engineCC;
	}

	public int getEngineCC(){
		return engineCC;
	}


	public void revEngine{

		System.out.println("MotorCycle engine is revved");
	}
}