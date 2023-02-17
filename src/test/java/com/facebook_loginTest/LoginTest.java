package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPage;

public class LoginTest {
	//public WebDriver driver;
	
	
	
	@Test
	public void validLoginTest1() {

		LoginPage lp = new LoginPage();
		lp.openAps();
		lp.getUserName();
		lp.getPassword();
		lp.getLoginButton();
		
		

		
	}
	
	@Test
	public void validLoginTest2() {

		LoginPage lp = new LoginPage();
		lp.openAps();
		lp.getUserName();
		lp.getPassword();
		lp.getLoginButton();
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abd.J@xmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dsjsjhfdjhcb");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		*/
	
	}
	
	/*@Test
	public void validLoginTest3() {


		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abd.J@xmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dsjsjhfdjhcb");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		
	
	}
	@Test
	public void validLoginTest4() {
		
	}*/
	
	/*@AfterTest
	public void closeApp() {
		driver.quit();
	}*/

	
}
