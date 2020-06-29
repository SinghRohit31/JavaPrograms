package com.JavaInterview;

public class ReverseNumber {

	public static void main(String[] args) {
		reverseInteger(1234);
	}
	
	public static void reverseInteger(int number){
		int rev=0;
		while(number!=0){
		int reminder=number%10;  //4 3 2 1
		rev=rev*10+reminder;
		number=number/10; // 123  // 12 // 1
		}
		System.out.println("Reverse number is "+rev);
	}

}
