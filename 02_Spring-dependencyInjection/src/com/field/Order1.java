package com.field;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Order1 {
	
	private static Log log=LogFactory.getLog(Order1.class);

	private String orderId;
	private Product product;
	private Transaction transaction;
	
	
	
	
	public Order1(String orderId, Product product) {
		super();
		log.info("In Order two param constructor");
		this.orderId = orderId;
		this.product = product;
	}



	public Order1(String orderId, Product product, Transaction transaction) {
		super();
		log.info("In Order all beans are create using constructor ");
		this.orderId = orderId;
		this.product = product;
		this.transaction = transaction;
	}
	
	

	public Order1() {
		super();
		log.info("In Order no param constructor");
		// TODO Auto-generated constructor stub
	}
	
	public Transaction getTransaction() {
		return transaction;
	}
	
	public void setTransaction(Transaction transaction) {
		
		this.transaction = transaction;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		log.info("Product is injected via setter");
		this.product = product;
	}
	
	
}
