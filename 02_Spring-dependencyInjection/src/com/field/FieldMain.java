package com.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FieldMain {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\02_Spring-dependencyInjection\\field.xml");
		
		Order1 order=(Order1) context.getBean("order");
		System.out.println(order.getProduct());  
		System.out.println(order.getTransaction());
		System.out.println(order.getOrderId());
	new ClassPathXmlApplicationContext(context).close();
	}

}
