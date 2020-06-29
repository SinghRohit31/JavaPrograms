package com.JavaInterview;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		swapNumberWithoutVariable(10, 8);
		
		swapVaribleWithVariable(10, 5);
	}

	public static void swapNumberWithoutVariable(int a , int b){
		
		System.out.println("Before swapping Value of a and b is : "+ a + " and " + b);
		a=a+b;  // 10+5 = 15
		b=a-b;   // 15-5 = 10
		a=a-b;   // 15-10 =5
		System.out.println("After swapping Value of a and b is : "+ a + " and " + b);
	}
	
	public static void swapVaribleWithVariable(int a, int b){
		System.out.println("Before swapping Value of a and b is : "+ a + " and " + b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping Value of a and b is : "+ a + " and " + b);
		
		
	}
	
	
}
