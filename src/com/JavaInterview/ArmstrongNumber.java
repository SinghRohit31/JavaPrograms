package com.JavaInterview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(371);
	}
   static int count=0;
	public static int armStrongNumber(int number){
		int reminder=0,temp=0;
		while(number !=0){
			reminder=number %10;
			temp=temp*10 + reminder;
			number= number /10;
			count ++;
		}
		System.out.println("Number of digits are "+ count);
		return count;
	}
	
	public static void checkNumber(int val){
		int rem=0;   double power=0;
		
		int actualVal=val;
		int numberofDigit = armStrongNumber(153);
		while(val !=0){
			rem=val %10;
			power =power+ Math.pow(rem, numberofDigit);
			val= val/10;
		}
		
		System.out.println("after calculation val is  "+ power);
		
		if(power == actualVal){
			System.out.println("Provided Number is armStrongNumber : " + power);
		}else{
			System.out.println("Provided Number is not an armStrongNumber");
			
		}
	}
	
}
