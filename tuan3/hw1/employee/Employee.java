package com.tuan3.hw1.employee;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String fistName, String lastName, int salary) {
		this.id = id;
		this.firstName = fistName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFistName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return getSalary() * 12;
	}

	public int raiseSalary(int percent) {
		salary = (int) (getSalary() * ((double) (100 + percent) / 100));
		return salary;
	}

	public String toString() {
		return "Employee[id = " + getId() + ", name = " + getName() + ",salary = " + getSalary() + "]";
	}
}
