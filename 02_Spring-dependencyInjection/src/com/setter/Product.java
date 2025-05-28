package com.setter;
//creating pojo class


public class Product {

	private int id;
	private String productName;
	private double price;
	
	
	
	public Product() {
		System.out.println(" Product is created...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
