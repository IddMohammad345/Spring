package com.idd;

public class Student {
	
	int id;
	String name;

	public Student() {
		System.out.println("Student Bean is created....");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
     
	public void printStudentInformation() {
		System.out.println("id : "+ id);
		System.out.println("name : "+ name);
	}
}
