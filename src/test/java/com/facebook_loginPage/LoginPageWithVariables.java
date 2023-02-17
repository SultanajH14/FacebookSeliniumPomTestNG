package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginPageWithVariables {
	public WebDriver driver;

	@BeforeTest
	public void openAps() {
		// WebDriverManager.chromedriver().create();
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	public WebElement getUserName(String enterUserName) {
		WebElement userName =driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys(enterUserName);
		return userName;
	}

	public WebElement getPassword(String enterPassword) {
		WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
				password.sendKeys("dshdgshs");
				return password;
		
	}

	public WebElement getLoginButton() {
	WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
			loginButton.click();
			return loginButton;
		
	}

}
