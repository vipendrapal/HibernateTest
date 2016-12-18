package com.test.hiber;

public class Product {

	
	private int productId;
	private String proName;
	private double price;
	 
	public void setProductId(int productId)
	{
	    this.productId = productId;
	}
	public int getProductId()
	{
	    return productId;
	}
	 
	public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}
	 
	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.proName+" "+this.price+" "+this.productId;
	}
}
