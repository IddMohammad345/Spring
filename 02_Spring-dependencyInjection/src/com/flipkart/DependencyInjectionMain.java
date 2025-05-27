package com.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionMain {

	public static void main(String[] args) {
		
          ApplicationContext context=new FileSystemXmlApplicationContext(
        		  "C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\02_Spring-dependencyInjection\\beans.xml");
          
          Product product =(Product) context.getBean("product1");
          System.out.println(product.getId());
          System.out.println(product.getProductName());
          System.out.println(product.getPrice());
	}
}
   