package com.firstjavaproject;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterestCalc calc = new SimpleInterestCalc("5000.0",5.0,10);
		BigDecimal a = calc.simpleinterestcalc();
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
