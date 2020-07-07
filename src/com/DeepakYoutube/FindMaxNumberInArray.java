package com.DeepakYoutube;

public class FindMaxNumberInArray {

	public static void main(String[] args) {
		int a[]={12,32,14,56,43,78,99,101,123,45};
		
		int max=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("Max Number in List is :" + max);

	}

}
