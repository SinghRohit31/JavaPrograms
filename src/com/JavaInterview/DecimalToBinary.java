package com.JavaInterview;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(decimalToBinary(156));

	}
	
	public static int decimalToBinary(int num){
		int rem,i=1;
		int binary=0;
		
		while(num !=0){
			rem=num %2;
			binary+=rem*i;
			num=num/2;
			i *=10;
		}
		return binary;
	}

}
