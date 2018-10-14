package com.spring.dev.model;

import com.spring.dev.modelinterface.Vehicle;

public class MotorBike implements Vehicle{
	
	
	private int maxSpeed;
	
		
	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public void move() {
		System.out.println("Fuel Type is Diesel");
		System.out.println("Max Speed "+maxSpeed);
		System.out.println("Motor Bike is started. Happy Journey!");
	}

}
