package com.JavaInterview;

public class CharacterAlphabetCheck {

	public static void main(String[] args) {
		checkAlphabet('0');
	}
	
	public static void checkAlphabet(char ch){
		
	if((ch >= 'a' && ch<='z') || (ch >= 'A' && ch<='Z') ){
		System.out.println( ch + " is an alphabet");
	}else{
		System.out.println( ch + " is not alphabet");
	}
	
	}

}
