package com.DeepakYoutube;

import java.util.HashSet;
import java.util.Set;

public class CommonElementInArray {

	public static void main(String[] args) {
		int arr1[]={2,5,7,8,9,3,8};
		int arr2[]={6,5,0,8,9,1};
		
	// if we have duplicate element in any array, then we should take Set to avoid that
		
		Set<Integer> set=new HashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]){
					set.add(arr1[i]);
					//System.out.println("Element is commmon " + arr1[i]);
				}
			}
		}
		
		for(int no:set){
			System.out.println("Element is commmon " + no);
		}
		
	}

}
