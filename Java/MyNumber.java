package com.firstjavaproject;

public class MyNumber {

	private int number;
	
	public MyNumber(int i) {
		// TODO Auto-generated constructor stub
		checkNumber(i);
	}
	
	public void checkNumber(int i) {
		if (i >0) {
			this.number = i;
		}
	}
	
	public void isPrimeCheck() {
		if (this.number <2 ) {
			System.out.println("This number is not prime and is less than 2");
		}
		
		for (int a=2; a <= this.number-1 ; a++) {
			if (this.number%a == 0) {
				System.out.println("This number is not a prime");
				return;
			} 
		}
		System.out.println("This number is prime");
	}
}
