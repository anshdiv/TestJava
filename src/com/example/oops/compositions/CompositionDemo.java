package com.example.oops.compositions;


public class CompositionDemo {

	public static void main(String[] args) {
		Person person = new Person(100L);
	    long salary = person.getSalary();
	    System.out.println("Person's Salary "+salary);
	      
	}
	
}
