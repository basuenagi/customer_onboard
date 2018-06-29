package com.zycus.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	static String cellValue;

	public static String ReadExcel() throws IOException {
		FileInputStream dataFile = new FileInputStream (new File("src/main/resources/customer_file/CustomerData.xlsx"));
		
		Workbook customerSheet = new XSSFWorkbook(dataFile);
		Sheet firstSheet = customerSheet.getSheetAt(0);
		Iterator<Row> sheetThro = firstSheet.iterator();
		int colCount=0;
		while(sheetThro.hasNext()) {
			colCount++;
		}
		
		int i=0;
		while(i<colCount)
		{
			Row nextRow = sheetThro.next();
			
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			int rowCount=0;
			while(cellIterator.hasNext()) {
				rowCount++;
			}
			int j=0;
			while (j<rowCount) {
				 Cell cell = cellIterator.next();
				 cellValue=cell.getStringCellValue();
				 
			 }
		}
		
		return cellValue;
	}

	
}
