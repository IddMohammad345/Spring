package com.zoopark;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Lion implements Animal {

	@Override
	public void getNameOfAnimal() {
		System.out.println("This is Lion");

	}

	@Override
	public int getCountOfAnimal(String animalName) {
		System.out.println("15 Lion are available");
		return 15;
	}

	public Lion() {
		super();
		System.out.println("New Lion is added");
	}

}
