package com.DeepakYoutube;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateelementInArray {

	public static void main(String[] args) {
		int a[]={10,20,40,50,10,40,80};
		
		
		Set<Integer> set= new HashSet<>();
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(set.add(a[i])==false){
				System.out.println("First Duplicate Element is " + a[i]);
				break;
			}
		}
		
		
		
	}

}
