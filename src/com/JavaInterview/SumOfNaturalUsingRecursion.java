package com.JavaInterview;

public class SumOfNaturalUsingRecursion {

	public static void main(String[] args) {
		
		System.out.println(checkNatural(5));
	}
	
	public static int checkNatural(int num){
		 if(num !=0){
			 return num+checkNatural(num-1);
		 }else{
			 return num;
		 }
	}

}
