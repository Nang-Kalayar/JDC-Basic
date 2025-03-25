package com.jdc.singleton;

public class Container {
	private String []array;
	private static Container instance;
	
	public static Container getInstance() {
		if(null == instance) {
			instance =new Container();
		}
		return instance;
	}
	private Container() {
		this.array = new String[0];
	}
	public void add () {
		String [] temp = new String[array.length+1];
		for(int i =0;i<array.length;i++) {
			temp[i]=array[i];
		}
		
	}

}
