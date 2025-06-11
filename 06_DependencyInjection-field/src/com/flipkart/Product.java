package com.flipkart;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary  //to make a bean as primary
@Component
public class Product {

	private int pid;
	private String userName;
	
	
	public Product() {
		System.out.println("Product is Created...");
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
