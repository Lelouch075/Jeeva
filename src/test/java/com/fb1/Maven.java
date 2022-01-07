package com.fb1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("jeeva");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("kjhch");
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
