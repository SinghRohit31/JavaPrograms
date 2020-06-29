package com.JavaInterview;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	powerOfNumber(5,4);
		
		powerOfNumUsingWhile(5,4);
		UsingPowerFunction(5,4);
	}

/*	// using for loop
	public static void powerOfNumber(int number, int exponential){
		int result=1;
		for(int i=1; i<=exponential;i++){
			result=result*number;
		}
		System.out.println("Result is : "+ result);
	}
	*/
	// using while loop
	public static void powerOfNumUsingWhile(int num,int exp){
		long result=1;
		while(exp!=0){
			result =result*num;
			exp--;
		}
		System.out.println("result using while loop is :" + result);
	}
	
	// Using Power function
	
	public static void UsingPowerFunction(double num, double exp){
		double result = Math.pow(num, exp);
		System.out.println("Using Power function " +result );
	}
	
	
	
	
	
	
}
