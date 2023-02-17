package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginPageMethodSignature {
	public WebDriver driver;

	@BeforeTest
	public void openAps() {
		// WebDriverManager.chromedriver().create();
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	public WebElement getUserName(String enterUserName) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("enterUserName");
		return null;
	}

	public WebElement getPassword(String enterPassword) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("enterPassword");
		return null;
	}

	public WebElement getLoginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		return null;
	}

}
