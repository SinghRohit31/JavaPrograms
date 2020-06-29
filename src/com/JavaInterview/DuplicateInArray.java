package com.JavaInterview;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {

		int a[]={1,2,4,45,23,2,5,1,34,2};
		int count=0;
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i:a){
			if(set.add(i)==false){
				System.out.println("Number is duplicate : "+ i);
				
			}
		}
		
		
	}
	
	

}
