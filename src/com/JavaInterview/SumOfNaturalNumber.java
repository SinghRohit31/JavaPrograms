package com.JavaInterview;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		sumNatural(100);
		sumNatural2(100);
	}
	
	//using for loop
	public static void sumNatural(int number){
		int sum=0;
		for(int i=1 ; i<=number ; i++){
		    sum=sum+i;	
		}
		System.out.println("Sum of " + number + " is " + sum);
	} 

	public static void sumNatural2(int number){
		int k=1 ,sum1=0;
		while(k<=number){
			sum1 =sum1+k;
			k++;
		}
		System.out.println("Sum of " + number + " is "+ sum1);
	}
}
