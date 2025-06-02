package com.field;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Product {
	private static Log log=LogFactory.getLog(Product.class);
     private Integer id;
     private double amount;
     private String name;
     
     
     
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product() {
		super();
		log.info("In product class default param constructor");
	}
	public Product(Integer id, double amount, String name) {
		super();
		log.info("In product class param constructor");
		this.id = id;
		this.amount = amount;
		this.name = name;
	}
	
	
     
}
