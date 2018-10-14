package com.spring.dev.model;

import com.spring.dev.modelinterface.Journey;
import com.spring.dev.modelinterface.Vehicle;

public class Traveller implements Journey {

	// Setter Injection by Object or Bean

	private Vehicle vehicle;

	
	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney() {
		vehicle.move();
	}



	

}
