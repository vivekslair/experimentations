package com.firstjavaproject;

import java.util.Scanner;
public class IFStatementsRunner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number :");
		int number1 = scanner.nextInt();
		System.out.println("The first number you entered is - " + number1);
		
		System.out.println("Please enter the second number :");
		int number2 = scanner.nextInt();
		System.out.println("The second number you entered is - " + number2);
		
		System.out.println("Please enter the operation :  1 for add , 2 for substract , 3 for multiply and 4 for divide");
		int number3 = scanner.nextInt();
		
		if (number3 == 1) {
			System.out.printf("You chose addition and the value is : %d", number1+number2).println();
		} else if (number3 == 2) {
			System.out.printf("You chose subtraction and the value is : %d", number1-number2).println();
		} else if (number3 ==3) {
			System.out.printf("You chose mulitplication and the value is : %d", number1*number2).println();
		} else if (number3 == 4) {
			System.out.printf("You chose division and the value is : %d", number1/number2).println();
		} else {
			System.out.println("The chosen operation doesnt exist please enter a value between 1 to 4");
		}
	}
}
