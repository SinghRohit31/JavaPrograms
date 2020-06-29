package com.JavaInterview;

public class Factorial {

	public static void main(String[] args) {
		factorial(4);
	}
	
	public static void factorial(int number){
		int fact=1;
		for(int i=1 ; i<=number ;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of "+ number + " is "+fact);
	}

}
