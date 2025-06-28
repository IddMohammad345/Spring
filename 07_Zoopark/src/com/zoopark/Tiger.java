package com.zoopark;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

	public Tiger() {
		super();
		System.out.println("New Tiger is added");
	}

	@Override
	public void getNameOfAnimal() {
	    System.out.println("This is Tiger");

	}

	@Override
	public int getCountOfAnimal(String animalName) {
		System.out.println("10 Tigers available in zoo");
		return 10;
	}

}
