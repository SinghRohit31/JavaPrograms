package com.DeepakYoutube;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {

	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 45, 23, 2, 5, 1, 34, 2 };
		
		Set<Integer> set= new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			if(set.add(a[i])==false){
				System.out.println("Duplicate Element is "+ a[i]);
			}
		}
		
		
		
		
	}

}
