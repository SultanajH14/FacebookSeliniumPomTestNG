package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginPage {
	public WebDriver driver;

	@BeforeTest
	public void openAps() {
		// WebDriverManager.chromedriver().create();
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	public WebElement getUserName() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abd.J@xmail.com");
		return null;

	}

	public WebElement getPassword() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dsjsjhfdjhcb");
		return null;
	}

	public WebElement getLoginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		return null;
	}
	

}
