package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Parameters({"browser"})
	@Test
	public void m1(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		}
		
//		WebElement txtUser = driver.findElement(By.id("email"));
//	
//	txtUser.sendKeys(name);
//	WebElement txtPass = driver.findElement(By.id("pass"));
//	
//	txtPass.sendKeys(pass);
	
	
	

		 if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		}
		
		
//		WebElement txtUser = driver.findElement(By.id("email"));
//	
//	txtUser.sendKeys(name);
//	WebElement txtPass = driver.findElement(By.id("pass"));
//	
//	txtPass.sendKeys(pass);
//	
	

		if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		WebElement txtUser = driver.findElement(By.id("email"));
//	
//	txtUser.sendKeys(name);
//	WebElement txtPass = driver.findElement(By.id("pass"));
//	
//	txtPass.sendKeys(pass);
//	
	}
	
	}
}
