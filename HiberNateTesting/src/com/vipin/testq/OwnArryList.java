package com.vipin.testq;

public class OwnArryList {

	private int capacity;
	private Object []list;
	private int size;
	public OwnArryList() {
		
		// TODO Auto-generated constructor stub
		
		this.capacity=6;
		list=new Object[capacity];
	}
	void increaseCapacity(){
		
		Object temp[]=list;
		// new capacity
		 capacity=capacity+2;
		list=new Object[capacity]; 
		// we have to iterate over temp  length
		for(int i=0;i<temp.length;i++){
			list[i]=temp[i];
			//System.out.println(list[i]);
		}
		
	}
	
	public void remove(int index){
		
		list[index]=null;
		
		
		for (int i = index; i < list.length-1; i++) {
			list[i]=list[i+1];
			
		}
		size--;
	}
	
	public void add(Object obj){
		
		// when array is full altering the size of the  array
		if(list.length==capacity){
			increaseCapacity();
		}
		list[size]=obj;
		size++;
		
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer output1=new StringBuffer("[");
		//iterate over size not over array
		for (int i = 0; i < size; i++) {
			output1.append(list[i]+",");
		}
		String s=output1.substring(0,output1.length()-1);
		if(s.length()==0){
			return "[]";
		}
		return s+"]";
	}
	public static void main(String[] args) {
		OwnArryList list=new OwnArryList();
		list.add(3);
		list.add("vipin");
	
		list.add(3);
		list.add(5);
		
		System.out.println(list);
		list.remove(1);
	
		System.out.println(list);
		
		
	}
}
