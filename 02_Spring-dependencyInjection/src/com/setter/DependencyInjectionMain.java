package com.setter;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionMain {

	public static void main(String[] args) {
		
          ApplicationContext context=new FileSystemXmlApplicationContext(
        		  "C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\02_Spring-dependencyInjection\\beans.xml");
          
          Product product =(Product) context.getBean("product1");
          System.out.println(product.getId());
          System.out.println(product.getProductName());
          System.out.println(product.getPrice());
          
          System.out.println("***********  Order Data  *************");
          Order order = context.getBean(Order.class);
          System.out.println(order);
          
          //using core java 
          List<String>itemNames=order.getFoodItemNames();
          for(String names:itemNames) {
        	  System.out.println(names);
          }
          
          //now using stream api
          itemNames.forEach(System.out::println);
          
  
           new ClassPathXmlApplicationContext(context).close(); //closing the spring container
	}
}
   