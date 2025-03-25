package com.jdc.mkt.dto;

import java.time.LocalDateTime;

public class Account {
	private int id;
	private double price;
	private LocalDateTime createDate;
	private LocalDateTime updateDate;
	public Account() {
		super();
		
	}
	
	public Account(int id, double price, LocalDateTime createDate, LocalDateTime updateDate) {
		super();
		this.id = id;
		this.price = price;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}


	}
	
	
	
	

