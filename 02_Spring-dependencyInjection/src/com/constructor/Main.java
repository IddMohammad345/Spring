package com.constructor;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\02_Spring-dependencyInjection\\constructor.xml");
		
		Employee emp = (Employee) context.getBean("e1");
		System.out.println(emp);
		
		
		context.close();
	}
}
                   