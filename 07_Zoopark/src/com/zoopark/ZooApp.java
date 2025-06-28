package com.zoopark;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZooApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		System.out.println(context.getBean(Lion.class));
		System.out.println(context.getBean(Zoo.class));
		Zoo zoo = context.getBean(Zoo.class);
		Animal animal = zoo.getAnimal();
		animal.getNameOfAnimal();
		animal.getCountOfAnimal("Tiger");
	}

}
