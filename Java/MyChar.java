package com.firstjavaproject;

public class MyChar {
	private char ch;
	
	public MyChar() {
		// TODO Auto-generated constructor stub
	}
	
	public MyChar(char c) {
		this.ch = c;
	}

	public boolean isVowel() {
		if (this.ch == 'a' || this.ch == 'e' || this.ch == 'i')
			return true;
		return false;
	}
	
}
