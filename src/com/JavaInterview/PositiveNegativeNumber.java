package com.JavaInterview;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		positiveNegative(0);
	}

	public static void positiveNegative(double number){ // We have taken datatype as it will accepts all the types of Number
		if(number<0.0){
			System.out.println(number +" is Negative number");
		}else if (number>0.0){
			System.out.println(number + " is Positive Number");
		}else{
			System.out.println(number + " is Zero");
		}	
	}
	
	
}
