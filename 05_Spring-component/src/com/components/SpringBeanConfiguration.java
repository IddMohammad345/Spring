package com.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan({"com.components","com.student"}) //this also work perfectly
@ComponentScan("com.*")  //but this also work perfectly with no repeated work with less lines
@Configuration
public class SpringBeanConfiguration {
	
	@Bean
	public Order createOrderOne() {
		System.out.println("createOrderOne ... is called");
		return new Order();
	}
	
	@Bean
	public Products createProducts() {
		System.out.println("createProducts ... is called");
		return new Products();
	}

}
