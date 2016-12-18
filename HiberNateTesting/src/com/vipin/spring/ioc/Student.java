package com.vipin.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	int id;
	String name;
	@Autowired(required=false)
	Address address;
	 public Student() {
		 System.out.println(" i am form constructor");
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		 System.out.println(" i am form set ID");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
