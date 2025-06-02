package com.field;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Transaction {
	private static Log log=LogFactory.getLog(Transaction.class);
	
	private boolean isSuccess;
	private String massage;
	private int id;
	
	
	
	public Transaction() {
		super();
		log.info("In transaction default constructor");
	}
	public Transaction(boolean isSuccess, String massage, int id) {
		super();
		log.info("In Transaction constructor ");
		this.isSuccess = isSuccess;
		this.massage = massage;
		this.id = id;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		log.info("In transaction setter Id");
		this.id = id;
	}

}
