package com.firstjavaproject;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(25);
		MotorBike honda = new MotorBike(10);
		MotorBike yamaha = new MotorBike(10);
		ducati.start("ducati");
		honda.start("honda");
		System.out.printf("Speed of ducati is %d", ducati.getSpeed());
		// TODO Auto-generated method stub
		ducati.setSpeed(50);
		System.out.printf("Speed of ducati is %d", ducati.getSpeed());
		honda.setSpeed(50);
		System.out.printf("\n Speed of honda is %d", honda.getSpeed());
		
		ducati.increaseSpeed(25);
		honda.increaseSpeed(10);
		
		System.out.printf("Speed of ducati is %d", ducati.getSpeed());
		System.out.printf("\n Speed of honda is %d", honda.getSpeed());
		
		ducati.decreaseSpeed(14);
		
		System.out.printf("Speed of ducati is %d",ducati.getSpeed() );
	
	}
}
