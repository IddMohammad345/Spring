package com.annotionBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	// Bean Id
	@Bean("product1")
	public Product getProduct() {
		System.out.println("In getProduct method");
		Product product = new Product();
		return product;
	}

	// Bean Id
	@Bean("product2")
	public Product getProductTwo() {
		System.out.println("In getProductTwo method");
		Product product = new Product();
		return product;
	}

	// Bean Id
	@Bean("product3")
	public Product getProductThree() {
		System.out.println("In getProductThree method");
		Product product = new Product();
		return product;
	}

	@Bean("order1")
	public Order getOrder() {
		Order order = new Order();
		order.setAmount(222.00);
		order.setNoOfItems(2);
		order.setOrderId("order1234");
		return order;
	}
}
