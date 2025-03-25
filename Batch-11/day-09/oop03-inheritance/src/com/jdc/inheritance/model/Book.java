package com.jdc.inheritance.model;
public class Book{
	public static void main(String[] args) {
		private String title;
		private double price;
		private String author;
		private int stock;
		private boolean isbn;

	}
	public Book (String title){
		this.title = title;
		System.out.println("1 arg");
	}
	public Book(String title,double price){
		this(title,price);
		System.out.println("2 arg");
	}

	public Book(String title,double price,String author,int stock,boolean isbn){
		this.book = book;
		this.price = price;
		this.author = author;
		this.stock = stock;
	}
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
	public void setTitle(){
		this.title = title;
	}
}