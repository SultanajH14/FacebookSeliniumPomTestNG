package com.facebook_loginTestWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_baseTest.BaseTest;
import com.facebook_loginPageWithPageFactory.PageFactoryLoginPage;

public class PageFactoryLoginTest extends BaseTest{
	WebDriver driver;
	private PageFactoryLoginPage plp;
	@BeforeMethod
	public void init() {
		driver=openApp();
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void validUserNameTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getUserName("dhdwh@xmail.com");
		plp.getPassword("sjcbeh");
		plp.getLoginButton();

	}
	@Test
	public void validPasswordTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getUserName("dhdwh@xmail.com");
		plp.getPassword("sjcbeh");
		plp.getLoginButton();

	}
	@Test
	public void doLoginTest() {
		plp = new PageFactoryLoginPage(driver);
	    plp.getLogInPage("jdsdjj@xmail.com", "sdhssa");
	
	}
	
	
	@AfterMethod
	public void closeApp() {
		if(driver!= null) {
		driver.quit();
	}
	}
}
