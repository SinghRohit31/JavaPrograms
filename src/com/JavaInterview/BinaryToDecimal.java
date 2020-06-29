package com.JavaInterview;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println(binaryToDecimal(1001101));
	}
	
	public static double binaryToDecimal(long num){
		 long rem;
		 int rev=0,i=0;
		
		while(num!=0){
			rem=num % 10;
			num=num/10;
			rev +=rem* Math.pow(2, i);
			
			++i;
			
		}
		return rev;
	}

}
