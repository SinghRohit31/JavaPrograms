package com.DeepakYoutube;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int a[]={12,32,14,56,43,78,99,101,123,45};
		
		int temp;
	   for (int i = 0; i < a.length-1; i++) {
		   for(int j=i+1; j<a.length;j++){
			   if(a[i]<a[j]){
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
	}
	   
	  for (int no : a) {
		System.out.print(no + " ");
	}
	  System.out.println("");
	  System.out.println("Largest Number is : " + a[0]);
	  System.out.println("Second largest Number is :" + a[1]);
		
		
		
		
		

	}

}
