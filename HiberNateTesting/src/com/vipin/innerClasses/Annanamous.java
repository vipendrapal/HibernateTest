package com.vipin.innerClasses;

public class Annanamous  {
	
	 
	public void testM(){
		final int t=34;
	class Person1{

	
		public void drive() {
			System.out.println("drives slowly"+t);
			
		}
		
	};
	
	Person1 p=new Person1();
	p.drive();
	
	}

	public static void main(String[] args) {
		Annanamous a=new Annanamous();
		a.testM();

	}

}
