package com.example.test;

public class Car {
	private String carname;
	private int carPrice;
	private int carSpeed;
	private String carOwner;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public Car(String carname, int carPrice, int carSpeed, String carOwner) {
		super();
		this.carname = carname;
		this.carPrice = carPrice;
		this.carSpeed = carSpeed;
		this.carOwner = carOwner;
	}
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carPrice=" + carPrice + ", carSpeed=" + carSpeed + ", carOwner="
				+ carOwner + "]";
	}
	
	

}
