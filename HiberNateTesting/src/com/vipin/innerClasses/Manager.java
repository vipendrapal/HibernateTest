package com.vipin.innerClasses;

public class Manager implements NestedInterface1.A {

	@Override
	public void test11() {
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) {
		NestedInterface1.A  na=new Manager();
		na.test11();
	}

}
