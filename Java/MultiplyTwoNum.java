package com.firstjavaproject;

public class MultiplyTwoNum { 
	
	private int firstNumber;
	private int secondNumber;
	
	MultiplyTwoNum() {

	}



	MultiplyTwoNum(int first , int second) {
		setNum(first,second);
	}
	
	public void setNum(int first , int second) {
		if (first >0) 
			this.firstNumber = first;
		else 
			this.firstNumber = 0;
		if (second >0)
			this.secondNumber = second;
		else
			this.secondNumber = 0;
	}
	
	int getNumFirst() {
		return this.firstNumber;
	}
	int getNumSecond() {
		return this.secondNumber;
	}
	
	int multiplyNumbers() {
		return this.firstNumber * this.secondNumber;
	}
}
