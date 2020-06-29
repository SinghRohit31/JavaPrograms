package com.JavaInterview;

public class LengthOfStringWithoutLenghtFunc {

	public static void main(String[] args) {
		String str="tests test yty";
		char[] ch= str.toCharArray();
		int count=0;
		
		for(char ch1:ch){
			count++;
		}
		System.out.println(count);

	}

}
