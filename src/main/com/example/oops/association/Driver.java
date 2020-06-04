package main.com.example.oops.association;

public class Driver extends Car {

	private String driverName;

	Driver(String driverName, String carName, int cid) {
		super(carName, cid);
		this.driverName = driverName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	

}
