package com.fileOperation;

import java.io.File;

public class ListOfFilesFromFolder {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Rohit.Singh\\Downloads\\Documents\\Documents");
		String[] listoffiles= file.list();
		for(String name:listoffiles){
			System.out.println(name);
		}
		
	}

}
