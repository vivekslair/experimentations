package com.firstjavaproject;

public class MotorBike {
	private int speed; //Enabling encapsulation
	
	MotorBike(int speed) { 
		this.speed = speed;
	}
	
	void setSpeed(int speed) {
		if (speed > 0 )
			this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		start("Ducati");
	}
	void start(String a) {
		System.out.printf("The bike %s has started",a).println();
	}

}
