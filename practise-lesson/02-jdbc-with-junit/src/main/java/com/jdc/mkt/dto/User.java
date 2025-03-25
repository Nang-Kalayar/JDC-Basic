package com.jdc.mkt.dto;

import java.time.LocalDateTime;

public class User {
	private int id;
	private String name;
	private String password;
	private LocalDateTime createDate;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name, String password, LocalDateTime createDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.createDate = createDate;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	
	

}
