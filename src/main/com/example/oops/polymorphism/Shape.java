package main.com.example.oops.polymorphism;

public class Shape {

	public double getArea(double length,double width) {
		System.out.println("Area of Rectangle "+(2*(length+width)));
		return (2*(length+width));
	}
	
	public double getArea(double side) {
		System.out.println("Area of Square "+(side*side));
		return (side*side);
	}
}
