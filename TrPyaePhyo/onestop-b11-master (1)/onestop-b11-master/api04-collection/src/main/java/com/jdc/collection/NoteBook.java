package com.jdc.collection;

import com.jdc.collection.test.Comparabel;

public class NoteBook implements Comparator <NoteBook> {
	private int id;
	private String name;
	private String model;
	private int ram;
	private double price;
	
	@Override
	public int compareTo(NoteBook o) {
		return id-o.getId();
	}
	public NoteBook(int id, String name, String model, int ram, double price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.ram = ram;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "NoteBook [id=" + id + ", name=" + name + ", model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
	

}
