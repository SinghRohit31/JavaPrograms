package com.JavaInterview;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		String s="tiewja";
		char[] ch= s.toCharArray();
		
		Arrays.sort(ch);
		String str= new String(ch);
		System.out.println(str);

	}

}
