package package com.jdc.inheritance.model;

public class SpaceShip extends Vehicle{

	public int shieldStrength;
	public int weaponPower;

	public in getShieldStrength(){
		return shieldStrength;

	}

	public void shieldStrength(int shieldStrength){
		this.shieldStrength = shieldStrength;
	}

	public void setWeaponPower(int weaponPower){
		this.weaponPower = weaponPower;
	}
	public int getWeaponPower(){
		return weaponPower;
	}


	public void activeShield(){
		System.out.println("shield is avtivated");
	}

	public void fireWeapon(){
		System.out.println("weapon is avtivated");
	}
}