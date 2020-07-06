package com.DeepakYoutube;

public class DuplicateNumberInArrayUsingBruteForce {

	public static void main(String[] args) {
		
		int a[]={1,5,4,45,23,2,5,1,34,2};
		
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("Duplicate ELement is "+ a[j]);
				}
				
			}
			
		}
		
		
		
		
		
		
	}

}
