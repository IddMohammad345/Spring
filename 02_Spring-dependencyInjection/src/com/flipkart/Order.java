package com.flipkart;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Order {
	private static Log logger = LogFactory.getLog(Order.class);

	private String emailId;
	private float totalAmount;
	private boolean isOrderSuccess;
	private char foodType;
	private long mobileNumber;
	
	private ArrayList<String>foodItemNames;
	

	public ArrayList<String> getFoodItemNames() {
		return foodItemNames;
	}

	public void setFoodItemNames(ArrayList<String> foodItemNames) {
		this.foodItemNames = foodItemNames;
	}

	public Order() {
		System.out.println("Order is created....");
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		logger.info("set email called...");
		this.emailId = emailId;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		logger.info("set setTotalAmount called...");
		this.totalAmount = totalAmount;
	}
	public boolean isOrderSuccess() {
		return isOrderSuccess;
	}
	public void setIsOrderSuccess(boolean isOrderSuccess) {
		logger.info("set setOrderSuccess called...");
		this.isOrderSuccess = isOrderSuccess;
	}
	public char getFoodType() {
		return foodType;
	}
	public void setFoodType(char foodType) {
		logger.info("set setFoodType called...");
		this.foodType = foodType;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		logger.info("set setMobileNumber called...");
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Order [emailId=" + emailId + ", totalAmount=" + totalAmount + ", isOrderSuccess=" + isOrderSuccess
				+ ", foodType=" + foodType + ", mobileNumber=" + mobileNumber + ", foodItemNames=" + foodItemNames
				+ "]";
	}
	
}
