package com.example.oops.association;

public class Car {

	private String name;
	private int id;
	
	
	public Car(String name, int id) {
		this.name = name;
		this.id = id;
	}


	public String getCarName() {
		return name;
	}


	public void setCarName(String carName) {
		this.name = carName;
	}


	public int getCarId() {
		return id;
	}


	public void setCarId(int carId) {
		this.id = carId;
	}

	
}
