package com.techseries.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="Student_Data")
public class Student {

	@Id
	private int roll;
	private String name;
	private int age;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
