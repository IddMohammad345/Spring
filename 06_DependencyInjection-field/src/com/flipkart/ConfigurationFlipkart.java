package com.flipkart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFlipkart {

	@Bean("product2")
	public Product createProduct() {
		return new Product();
	}
	
	
}
