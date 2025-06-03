package com.components;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringComponentScan {

	public static void main(String[] args) {
		/*
		 ##:--> 1st Approach
		 :-->while creating container , passed config data
		AnnotationConfigApplicationContext context
		             =new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
		             
		
		##:-->2nd Approach
		//Creating container
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext();
		//passing Configuration class
		context.register(SpringBeanConfiguration.class);
		context.refresh();
		*/
		
	//	##:--> 3rd Approach
	   AnnotationConfigApplicationContext context=
			   new AnnotationConfigApplicationContext();
	   context.scan("com.*");
	   context.refresh();
		
		
		
		Products product =(Products) context.getBean("products");
	System.out.println(product);
	Order order =(Order) context.getBean("order1");
	System.out.println(order);
	Order order1 =(Order) context.getBean("createOrderOne");
	
	System.out.println(order1);
	}

}
