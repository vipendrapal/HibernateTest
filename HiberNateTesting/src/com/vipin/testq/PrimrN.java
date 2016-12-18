package com.vipin.testq;

public class PrimrN {

	public void prime(int no){
		
		boolean flag=true;
		
		for (int i = 2; i <= no/2; i++) {
			if(no%i==0){
				flag=false;
			}
		}
		
		if(flag){
			System.out.println("no is prime");
		}else{
			System.out.println("no is not prime");
		}
	}
	
	public static void main(String[] args) {
		PrimrN p=new PrimrN();
		 p.prime(4);
	}
	
} 
