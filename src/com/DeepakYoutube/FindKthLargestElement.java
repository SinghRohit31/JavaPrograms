package com.DeepakYoutube;

public class FindKthLargestElement {

	public static void main(String[] args) {
		int a[]={12,32,14,56,43,78,99,101,123,45};
		int temp;
		int K=5;
		
		for (int i = 0; i < a.length-1; i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
			if(i==K-1){
				System.out.println("Kth Largest element is " + a[i]);
			}
		}
		
		

	}

}
