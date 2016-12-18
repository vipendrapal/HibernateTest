package com.vipin.innerClasses;

 class StaticNestedClass {

	 static int  d=12;
	 int m=0;
	public static class A{
		StaticNestedClass sq=new StaticNestedClass();
		int t=12;
		static int  k=12;
		
		public void test(){
			System.out.println("hello"+sq.m);
		}
		public static void test1(){
			System.out.println("hello1"+d);
		}
		
	}
	
	public static void main(String[] args) {
		StaticNestedClass.A sn=new StaticNestedClass.A();
		sn.test();
		sn.test1();
	}
	
}
