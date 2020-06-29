package com.JavaInterview;

public class NumberOfDigitInteger {

	public static void main(String[] args) {
		countDigit(0);
	}

	public static void countDigit(int Number){
		int count=0;
		while(Number !=0){
			
			Number=Number/10;
			count++;
		}
		System.out.println("Number of digits are " + count);
	}
}
