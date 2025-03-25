package com.jdc.cao.model;

public class Hero{
	public static int heroCount = 0;
	public String name;
	public String role;

	public void fight(){
		System.out.println(name + "Hero is fighting.....");
	}

	public static void countUp(){
		heroCount++;
		System.out.println("Counting Up..........");
	}
}
