package org.green;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreensCart {
	
	static WebDriver driver;
	
	@BeforeClass
	
	
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		
	}
	@Before
	public void timeStart() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		
	}
	
	@After
	public void timeEnd() {
		long end = System.currentTimeMillis();
		System.out.println(end);
		
		
	}
	@Test
	public void login() {
		WebElement txtUser = driver.findElement(By.id("loginEmailId"));
		txtUser.sendKeys("Jarvis");
		WebElement txtPass = driver.findElement(By.id("loginPassword"));
		txtPass.sendKeys("AgeOfUltron");
		
		WebElement btnLogin = driver.findElement(By.className("btnRegister form-control"));
		btnLogin.click();
		
		
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	

}
