package com.jdc.singleton;

public class ContainerAdder {
	private Container container;
	public ContainerAdder() {
		container =Container.getInstance();
	}
	public void add(String str) {
		container.add();
		System.out.println("Adding a string:" + str);
	}

}
