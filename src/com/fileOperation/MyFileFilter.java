package com.fileOperation;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter {

	// Below example shows how to get specific files from a folder. Sometimes we
	// need to pic only specific extensions from the given folder. Implement
	// FilenameFilter class and override accept() method, and add your filter
	// logic here. Pass this object to list() method to get specific file
	// extensions.

	public static void main(String a[]) {
		File file = new File("C:\\Users\\Rohit.Singh\\Downloads\\Documents\\Documents");
		String[] files = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".docx")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (String f : files) {
			System.out.println(f);
		}
	}

}
