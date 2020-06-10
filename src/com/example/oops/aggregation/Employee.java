package com.example.oops.aggregation;

public class Employee {

	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		System.out.println(id + " " + name);
		return address.getCity() + " " + address.getState() + " " + address.getCountry();
	}
}
