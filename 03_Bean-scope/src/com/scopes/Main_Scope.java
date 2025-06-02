package com.scopes;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main_Scope {
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\03_Bean-scope\\bean.xml");
		 //Bean scope is singleTon
		//1st time request to container for e1
		Employee emp1 = (Employee)context.getBean("e1");
	    System.out.println(emp1);
	    emp1.setName("Idd Mohammad");
		
	    //2nd time request to container for e1
	    Employee emp2 = (Employee)context.getBean("e1");
	    System.out.println(emp2);
		System.out.println(emp2.getName());
		
		//1st time request to container for e2
		Employee emp3=(Employee) context.getBean("e2");
		System.out.println(emp3);
		
		//2nd time request to container for e2
		Employee emp4=(Employee)context.getBean("e2");
		System.out.println(emp4);
		
		context.close();
	}
}
