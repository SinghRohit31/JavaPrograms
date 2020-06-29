package com.JavaInterview;

public class LargestAmongThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber(30,30,30);

	}
	
	public static void LargestNumber(int a, int b, int c){
		if(a>b && a>c){
			System.out.println("Largest Number is : " + a);
		}else if(b>a && b>c){
			System.out.println("Largest Number is : " + b);
		}else if (c>a && c>b){
			System.out.println("Largest Number is " + c);
		}else {
			System.out.println(" All Numbers are equal");
		}
	}

}
