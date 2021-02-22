package com.firstjavaproject;

import java.util.Scanner;

public class PrimeNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int x = scanner.nextInt();
		number.checkNumber(x);
		number.isPrimeCheck();

	}
	
}
