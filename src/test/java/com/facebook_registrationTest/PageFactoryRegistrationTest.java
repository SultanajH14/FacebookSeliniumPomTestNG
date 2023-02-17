package com.facebook_registrationTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.facebook_baseTest.BaseTest;
import com.facebook_registrationPage.PageFactoryRegistrationPage;

public class PageFactoryRegistrationTest extends BaseTest	{
	WebDriver driver;
	
	private PageFactoryRegistrationPage prp;

	@BeforeMethod
	public void init() {
		driver=openApp();
		//driver=opeChrome();
		//driver=openEdge();
		//openFirefox();
		
	}
	@Test
	public void xyz() throws InterruptedException {
		 prp = new PageFactoryRegistrationPage(driver);
		prp.getCreateAccount();
		prp.getFirstName("jhwtdyw");
		prp.getLastName("dherrh");
		prp.getEmail("hdfurhf@zmail.com");
		prp.getReEnterEmail("hdfurhf@zmail.com");
		prp.getNewPassword("khyihjgj33");
		prp.getBirthdayMonth("Jun");
		prp.getBirthdayDay("12");
		prp.getBirthdayYear("1991");
	}

	@Test
	public void doRegistrationTest() throws InterruptedException {
		
		prp = new PageFactoryRegistrationPage(driver);
		prp.getRegistrationPage("jhwtdyw", "dherrh", "gkor@qmail.com","gkor@qmail.com",
				 "khyihjgj33", "Dec", "16",
				"1990");
	}

	@AfterMethod
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}
	}
}
