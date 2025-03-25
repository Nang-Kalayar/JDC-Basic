package com.jdc.inheritance.model;

public class SpaceShip extends Vehicle{
	private int shieldStrength;
	private int weaponPower;

	public int getShieldStrength(){
		return shieldStrength;
	}
	public void setShieldStrength(int shieldStrength){
		this.shieldStrength = shieldStrength;
	}


	public void activateShield(){
		System.out.println("SpaceShip is activited.");

	}

	public void fireWeapon(){
		System.out.println("SpaceShip weapon is fired");
		
	}
}