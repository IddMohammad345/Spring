package com.constructor;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//Constructor Injection
public class Employee {
	
	private static Log logger=LogFactory.getLog(Employee.class);

	private int id;
	private String name;
	private double salary;
	
	
	public Employee() {
		logger.info("Employee: Default Constructor ");
	}
	
	
	public Employee(int id, String name, double salary) {
		super();
		logger.info("Employee: parametric Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		logger.info("In set Id method");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		logger.info("In set name method");
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		logger.info("In set salary method");
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
