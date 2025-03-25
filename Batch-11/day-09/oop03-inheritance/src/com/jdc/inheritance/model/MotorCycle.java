package com.jdc.inheritance.model;
import com.jdc.inheritance.model.Vehicle;
 public class MotorCycle extends Vehicle{
 	private int engineCC;
 	
    public void setEngineCC(int engineCC){
        this.engineCC = engineCC;
    }
    
    public int getEngineCC(){
        return engineCC;
    }
}