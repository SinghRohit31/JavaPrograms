package com.JavaInterview;

public class MultiplicationTable {

	public static void main(String[] args) {
		multiply(15);

	}

	public static void multiply(int number){
		for(int i=1; i<=10;i++){
			System.out.println(number + " * " + i + " = " + (number*i));
		}
	}
}
