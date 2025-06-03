package com.annotionBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Product product = (Product) context.getBean("product1");
		System.out.println(product);
		Product product2 = (Product) context.getBean("product2");
		System.out.println(product2+"\n=======================\n");

		Order order = (Order) context.getBean("order1");
		System.out.print("order id : "+order.getOrderId()+"\n Items : "+order.getNoOfItems()+"\n amount : "+order.getAmount());

	}
}
