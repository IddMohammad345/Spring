package com.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype") //every request creates new object/bean
@Component("order1")
public class Order {

	private int oid;
	private double price;
	
	
	public Order() {
		System.out.println("Order Is Instantiated...");
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		System.out.println("Order.setOid()");
		this.oid = oid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
