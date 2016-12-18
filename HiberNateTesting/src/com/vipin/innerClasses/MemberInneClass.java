package com.vipin.innerClasses;

public class MemberInneClass {

	
	


	public static void main(String[] args) {
	
		final int t=12;
	class B{
		public void test(){
			System.out.println(t);
		}
	}
	
	B b=new B();
	b.test();
	
		
		
	}
}
