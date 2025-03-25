package com.jdc.app;

import java.util.Objects;

public class Course {
	private String name;
	private int duration;
	private int fees;
	public Course(String name, int duration, int fees) {
		super();
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(duration, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(duration, other.duration) && Objects.equals(name, other.name);
	}
	

}
