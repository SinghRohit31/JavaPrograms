package com.JavaInterview;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumberPalindrome(121);
	}

	public static void checkNumberPalindrome(int number){
		int rev=0,reminder;
		int temp=number;
		
		while(number !=0){
		reminder=number%10;
		rev=rev*10+reminder;
		number=number/10;
		}
		
		if(rev==temp){
			System.out.println("Number is palindrome");
		}else{
			System.out.println("Number is not palindrome");
		}
		
	}
}
