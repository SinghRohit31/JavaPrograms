package com.JavaInterview;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkStringPalinDrome("abac");
	}

	public static void checkStringPalinDrome(String str){
		String rev=str;
		String temp="";
		int strlenth= str.length();
		for(int i=strlenth-1;i>=0;i--){
			temp= temp+str.charAt(i);
		}
		
		if(rev.equals(temp)){
		System.out.println("String is Palindrome");	
		}
		
		
		
		
	}
	
}
