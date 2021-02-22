package com.firstjavaproject;

public class MultipyTwoNumRunner {


	public static void main(String[] args) {
		MultiplyTwoNum  multi = new MultiplyTwoNum (3,4);
		multi.setNum(5, 6);
		System.out.println(multi.getNumFirst());

		int a = multi.multiplyNumbers();
		// TODO Auto-generated method stub
        System.out.printf("the output of the mulitplication is %d",a).println();
	}

}
