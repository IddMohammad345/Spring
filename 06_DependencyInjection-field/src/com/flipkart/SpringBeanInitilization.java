package com.flipkart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanInitilization {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		Product product = (Product)context.getBean("product2"); //context.getBean(Product.class);->we can't write like this because we have 2 bean of product type
		product.setPid(111);
		System.out.println(product.getPid());

		System.out.println("Order Details  **************************");

		Order order = (Order) context.getBean("order");

		System.out.println(order);
		System.out.println(order.getProduct().getPid());
		
		System.out.println(" Flipkart Data ****************************");
		Flipkart flipkart = context.getBean(Flipkart.class);
		System.out.println(flipkart);
		System.out.println(flipkart.getOrder1().getProduct().getPid());
		System.out.println(flipkart.getOrder2());
	}

}
