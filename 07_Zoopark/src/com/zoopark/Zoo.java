package com.zoopark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	//@Qualifier("tiger")
	@Autowired
	Animal animal;
	
	public Zoo() {
		super();
		System.out.println("Zoo is Opened");
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
