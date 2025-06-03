package com.annotionBasedConfig;

public class Order {

	private String orderId;
	private int noOfItems;
	private Double amount;
	
	
	public Order() {
		super();
		System.out.println("Order is Instantiated...");
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
