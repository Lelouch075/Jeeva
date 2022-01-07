package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTable {
	public static void main(String[] args) throws IOException  {
		File f=new File
				("C:\\Users\\Jeeva\\eclipse-workspace\\MavenProject\\Excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(f);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("FirstTab");
		
		Row row = sheet.getRow(0);
		
		int count = sheet.getPhysicalNumberOfRows();
		
		System.out.println(count);
		
		int cellcont = row.getPhysicalNumberOfCells();
		
		System.out.println(cellcont);
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row2 = sheet.getRow(i);
			
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row2.getCell(j);
				
			//	System.out.println(cell);
				int cel1 = cell.getCellType();
				//System.out.println(cel1);
				
				
				
				
				if(cel1==1) {
					System.out.println(cell.getStringCellValue());
					
				}
				
				if(cel1==0) {
					if(DateUtil.isCellDateFormatted(cell)) 
					{
						Date date = cell.getDateCellValue();
					SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yy");
					String data1 = dateformat.format(date);
					System.out.println(data1);
					}
				
					
					
				else{
					double d = cell.getNumericCellValue();
					
					long l=(long)d;
					
					String data = String.valueOf(l);
					System.out.println(data);
				}
				
				}

		
					
				}
				
				
				
				
				
				
				
				
				}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}


