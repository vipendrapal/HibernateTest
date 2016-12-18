package com.vipin.testq;

import java.util.Arrays;

public class CustomArrayList {

	Object table[];
	int capacity;
	int size;
	public CustomArrayList() {
		// TODO Auto-generated constructor stub
		this.capacity=5;
		table=new Object[capacity];
		
	}
	
	
	
	public static void main(String[] args) {
		CustomArrayList c=new CustomArrayList();
		
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		c.add("ed");
		
		System.out.println(c);
		
		
	}
	public void altercapacity(){
		Object temp[]=table;
		
		capacity=(int) (capacity+(capacity*(0.5)));
		table=new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			table[i]=temp[i];
			
		}
	}
	
	public void add(Object o){
		if(table.length==capacity){
			altercapacity();
		}
		table[size]=o;
		size++;
	}
	
	@Override
	public String toString() {
		String s="[";
		for (int i = 0; i < size; i++) {
			s=s+table[i]+",";
		}
		return s.substring(0, s.length()-1)+"]";
	}
}
