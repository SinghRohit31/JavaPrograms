package com.DeepakYoutube;

import java.util.HashSet;
import java.util.Set;

public class CommonElementInArrayUsingSet {

	public static void main(String[] args) {
		int arr1[]={2,5,7,8,9,3,8};
		int arr2[]={6,5,0,8,9,1};
		
		Set<Integer> set = new HashSet<>();		
		
		for (int a1 : arr1) {
			set.add(a1);
		}
		
		for (int a2 : arr2) {
			if(set.add(a2)==false){
				System.out.println("Number is common " + a2);
			}
		}
		
		

		}
		
		
	}


