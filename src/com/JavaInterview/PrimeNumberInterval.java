package com.JavaInterview;

public class PrimeNumberInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumInterval(50,100);
	}

	
	public static void primeNumInterval(int lower, int higher){
		while(lower<higher){
			boolean flag=true;
			for(int i=2;i<=lower/2;i++){
				if(lower % i ==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println("Number is Prime Number :" + lower);
			}
			lower++;
		}
	}
	
}
