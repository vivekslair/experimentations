package com.firstjavaproject;

import java.math.BigDecimal;

public class SimpleInterestCalc {
	
	private BigDecimal principal;
	private double interest;
	private int years;
	
	SimpleInterestCalc() {
		
	}
   
	SimpleInterestCalc(String principal, double interest , int years) {
		setCalcValues(principal,interest,years);
	}
	
	public void setCalcValues (String amt,double interest,int years) {
		this.principal = new BigDecimal(amt);
		this.interest = interest/100;
		this.years = years;
	}
	
	public BigDecimal simpleinterestcalc() {
		return (this.principal.add(this.principal.multiply(new BigDecimal(this.interest).multiply(new BigDecimal(years)))));
	}
	
	
}
