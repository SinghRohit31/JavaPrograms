package com.DeepakYoutube;

public class InsertElementInArray {

	public static void main(String[] args) {
		int a[]={12,32,14,56,43,78,99,101,123,45};
		
		int Position=4;
		int element=100;
		
		
		for(int i=a.length-1; i>Position-1;i--){
			a[i]=a[i-1];
		}
		
		a[Position-1]=element;
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		
		
		

	}

}
