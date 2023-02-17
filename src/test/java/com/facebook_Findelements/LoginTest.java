package com.facebook_Findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver dr;
	@BeforeTest
	public void openAps() {
		//WebDriverManager.chromedriver().create();
		//WebDriverManager.chromedriver().setup();
		dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		
	}
@Test
public void validLoginTest() {
	dr.findElement(By.xpath("//input[@id='email']")).sendKeys("abd.J@xmail.com");
	dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("dsjsjhfdjhcb");
	dr.findElement(By.xpath("//button[@name='login']")).click();
}

public void invalidLoginTest() {
	//dr.findElement(By.xpath("//button[@name=\"login\"]")).click();
}
}
