package com.idd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		
		/*
		BeanFactory container=
		    new FileSystemXmlApplicationContext("C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\01_Spring\\Bean.xml");
*/
		
		ApplicationContext container=
			    new FileSystemXmlApplicationContext("C:\\Development_workspace\\YouTube\\NareshIt\\SpringByDilipSir\\01_Spring\\Bean.xml");

		Object obj = container.getBean("s1");
		Student s1=(Student)obj;
		
		s1.printStudentInformation();
		
		Object obj1 = container.getBean("emp");
	    Employee emp=(Employee)obj1;
	}

}
