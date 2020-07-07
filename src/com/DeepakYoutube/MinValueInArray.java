package com.DeepakYoutube;

public class MinValueInArray {

	public static void main(String[] args) {
		int a[]={12,32,14,56,43,78,99,101,123,45};
		
		int min=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Min Number in List is :" + min);	
	}

}
