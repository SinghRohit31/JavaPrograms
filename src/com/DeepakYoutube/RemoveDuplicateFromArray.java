package com.DeepakYoutube;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[]={1,5,4,45,23,2,5,1,34,2};
		
		
		Set<Integer> set= new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		
		for (int no : set) {
			System.out.print(no + " ");
		}
		
		

	}

}
