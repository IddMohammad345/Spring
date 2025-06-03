package com.annotionBasedConfig;


public class Product {
	private int id;
	private String name;
	private double price;
	
	
	
	public Product() {
		super();
		System.out.println("product is Instantiated....");
	}
	//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
