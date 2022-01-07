package org.excel;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewExcel {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dDnSkills = driver.findElement(By.id("Skills"));
		
		
		
		
		File file=new File("C:\\Users\\Jeeva\\Desktop\\Excel\\Test1.xlsx");
		
		Workbook workbook =new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Data");
		
		
            Select select=new Select(dDnSkills);
		
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement element = options.get(i);
			
			String text = element.getText();
			
			//System.out.println(text);
			
			Row row = sheet.createRow(i);
			
			Cell cell = row.createCell(0);
			
			cell.setCellValue(text);
	
		}
		FileOutputStream out =new FileOutputStream(file);
		
		workbook.write(out);
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

}
