package com.JavaInterview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUsingHashMap {

	public static void getData() throws IOException{
		 String path = "C:\\Users\\Rohit.Singh\\Desktop\\SheetMap.xlsx";
		  
		  FileInputStream fis = new FileInputStream(path);
	
		  Workbook workbook = new XSSFWorkbook(fis);
		
		  Sheet sheet = workbook.getSheetAt(0);
		  
		  int lastRow = sheet.getLastRowNum();
		  
		  
		  Map<String , Map<String,String>> parentmap= new HashMap<String , Map<String,String>>();
		  Map<String,String> childMap= new HashMap<String,String>();
		  
		  for(int i=0; i<=lastRow;i++){
			  Row row= sheet.getRow(i);
			  Cell cellVal=row.getCell(1);
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
