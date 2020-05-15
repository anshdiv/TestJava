package com.example.oops.polymorphism;

public class Shape {

	public void getArea(double length,double width) {
		System.out.println("Area of Rectangle "+(2*(length+width)));
	}
	
	public void getArea(double side) {
		System.out.println("Area of Square "+(side*side));
	}
}
