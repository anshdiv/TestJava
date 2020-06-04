package main.com.example.oops.association;

public class Car {

	private String carName;
	private int carId;
	
	
	public Car(String name, int id) {
		super();
		this.carName = name;
		this.carId = id;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}

	
}
