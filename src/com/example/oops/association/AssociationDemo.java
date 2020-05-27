package com.example.oops.association;

public class AssociationDemo {

	public static void main(String ...arg) {
		Driver obj = new Driver("Andy", "Ford", 9988);
		System.out.println(obj.getDriverName()+" is a driver of car Id: "+obj.getCarId());
	}
}
