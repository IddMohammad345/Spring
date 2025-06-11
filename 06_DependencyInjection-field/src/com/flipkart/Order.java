package com.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {

	private int oid;
	private String userName;
	
   @Qualifier("product2")  //use to give to our custom name of bean or to store by name it will reduce ambiguity problem 
	@Autowired 
	private Product product;  //field injection
	
	public Order() {
		super();
		System.out.println("Order is Created...");
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
