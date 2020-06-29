package com.JavaInterview;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
			calculator();
	}
	
	public static void calculator(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values :");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		System.out.println("Enter the operator (+,-,*,/) ");
		
		char operator= sc.next().charAt(0);
		double result=0;
		
		switch (operator) {
		case '+':
			result=a+b;
			System.out.println("Addition of a and b is :"+ result);
			break;
		case '-':
			result =a-b;
			System.out.println("Substraction of a and b is :"+ result);
			break;
		case '*':
			result =a*b;
			System.out.println("Multiplication of a and b is :"+ result);
			break;
		case '/':
			result =a/b;
			System.out.println("division of a and b is :"+ result);
			break;
		default:
			System.out.println("Invalid operator entered");
			break;
		}
	}

}
