package com.JavaInterview;

public class FactorsOfNumber {

	public static void main(String[] args) {
		factorsofNumber(60);
	}
	
	public static void factorsofNumber(int number){
		
		for(int i=1 ; i<=number; i++){
			if(number % i ==0){
				System.out.println("Factors of " + number + " is :" + i);
			}
		}
	}

}
