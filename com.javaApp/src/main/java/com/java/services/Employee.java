package com.java.services;

public class Employee 
{
	private Integer empId;
	private String name;
	private String city;
	private Double salary;
	
	public Employee(Integer empId, String name, String city, Double salary) {
		super();
		System.out.println("Employe Bean created");
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	public String employeeTask()
	{
		return "Working hard employee Just telling working hard";
	}
}
