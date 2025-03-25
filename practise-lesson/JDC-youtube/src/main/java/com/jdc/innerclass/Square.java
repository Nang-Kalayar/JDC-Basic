package com.jdc.innerclass;

public class Square {
	
	public double width,height;
	
	public Square(double w,double h) {
		width =w; height = h;
	}
	public void showVolume() {
		Box b =new Box(2.0);
		System.out.println("Volume is :" + b.getVolume());
		
	}

}
