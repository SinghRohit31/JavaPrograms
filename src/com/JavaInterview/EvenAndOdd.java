package com.JavaInterview;

public class EvenAndOdd {

	public static void main(String[] args) {
		checkEvenOdd(5);
	}
	
	public static void checkEvenOdd(int number){
		
		if(number%2==0){
			System.out.println("Number "+ number  +" is an even number");
		}else{
			System.out.println("Number "+ number  +" is an Odd number");
		}
	} 

}
