package com.DeepakYoutube;

public class DeleteElementInArray {

	public static void main(String[] args) {
		int a[]={12,32,14,56,43,78,99,101,123,45};
		
		int del_element=99;
		
		for (int i = 0; i < a.length; i++) {
			if(del_element==a[i]){
				for(int j=i;j<a.length-1;j++){
					a[j]=a[j+1];
				}
				break;
			}
		}
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + " ");
		}
		
		

	}

}
