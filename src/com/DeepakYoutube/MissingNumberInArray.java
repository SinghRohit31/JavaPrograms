package com.DeepakYoutube;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int arr1[]={2,5,7,8,9,3,1,6};
		
		int sum=0;
		int sum1=0;
		for (int i : arr1) {
			sum=sum+i;
		}

	System.out.println("sum is " +sum);	
	
	
	for (int j = 0; j <= arr1.length+1; j++) {
		sum1=sum1+j;
	}
	
	System.out.println("sum1 is " +sum1);	
	
	System.out.println("Missing number is :" + (sum1-sum));
	
	}

}
