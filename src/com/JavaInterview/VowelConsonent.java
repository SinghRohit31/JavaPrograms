package com.JavaInterview;

public class VowelConsonent {

	public static void main(String[] args) {
		
		// vowels are a , e, i, o,u
		checkVowelConsonent('a');

	}
	
	public static void checkVowelConsonent(char ch){
		
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			System.out.println("Alphabet is Vowel : " + ch);
		}else{
		System.out.println("Albhabet is Consonent : " + ch);
		}
		
	}

}
