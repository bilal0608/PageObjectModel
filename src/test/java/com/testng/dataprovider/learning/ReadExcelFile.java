package com.testng.dataprovider.learning;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static String[][] leadData() throws IOException {
		
			XSSFWorkbook book = new XSSFWorkbook("./Data/Createlead.xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum();
			int colcount = sheet.getRow(1).getLastCellNum();
			
			String[][] data = new String[rowcount][colcount];
			for(int i=1; i<=rowcount; i++)
			{
				for (int j=0; j<colcount; j++)
				{
					String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j]=stringCellValue;
				}
			
				
			}
			book.close();
			return data;
	
	}

}
