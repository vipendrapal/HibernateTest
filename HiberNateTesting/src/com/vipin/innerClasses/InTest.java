package com.vipin.innerClasses;

public class InTest {

	
	public static void main(String[] args) {
		  
		try{  
			System.out.println(1);
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(Exception e){//System.out.println(e);
			  System.out.println(2);}  
			  finally{
				  System.out.println(3);
				  System.out.println("finally block is always executed");
			  }  
		
		System.out.println(4);
			  System.out.println("rest of the code...");  

	
	}

	
}
