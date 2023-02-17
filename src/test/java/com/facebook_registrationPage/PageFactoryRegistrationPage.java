package com.facebook_registrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFactoryRegistrationPage {

	WebDriver driver;

	/**
	 * @param driver
	 */
	public PageFactoryRegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//a[@role='button'])[2]")
	private WebElement createAccount;
	

	public WebElement getCreateAccount() throws InterruptedException {
		Thread.sleep(5000);
		createAccount.click();

		return createAccount;

	}

	@FindBy(how = How.NAME, using = "firstname")
	private WebElement firstName;

	public WebElement getFirstName(String enterFirstName) {
		firstName.sendKeys(enterFirstName);
		return firstName;

	}

	@FindBy(how = How.NAME, using = "lastname")
	private WebElement lastName;

	public WebElement getLastName(String enterLastName) {
		lastName.sendKeys(enterLastName);
		return lastName;

	}

	@FindBy(how = How.XPATH, using = "//input[@name='reg_email__']")
	private WebElement email;

	public WebElement getEmail(String enteremail) {
		email.sendKeys(enteremail);
		return email;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='reg_email_confirmation__']")
	private WebElement reenteremail;

	public WebElement getReEnterEmail(String confirmemail) {
		reenteremail.sendKeys(confirmemail);
		return reenteremail;
	}

	@FindBy(how = How.ID, using = "password_step_input")
	private WebElement newpassword;

	public WebElement getNewPassword(String enternewpassword) {
		newpassword.sendKeys(enternewpassword);
		return newpassword;

	}

	@FindBy(how = How.XPATH, using = " //button[@name='websubmit']")
	private WebElement signup;

	public WebElement getSignUp() {
		signup.click();
		return signup;

	}

	@FindBy(how = How.ID, using = "month")
	private WebElement months;

	public WebElement getBirthdayMonth(String entermonth) {
		//WebElement months=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select select = new Select(months);
		select.selectByVisibleText(entermonth);
		return months;

	}

	@FindBy(how = How.ID, using = "day")
	private WebElement days;

	public WebElement getBirthdayDay(String enterdays) {
		Select select = new Select(days);
		select.selectByVisibleText(enterdays);
		return days;

	}

	@FindBy(how = How.ID, using = "year")
	private WebElement years;

	public WebElement getBirthdayYear(String enteryears) {
		Select select = new Select(years);
		select.selectByVisibleText(enteryears);
		return years;

	}

	public WebElement getRegistrationPage(String enterFirstName,
			String enterLastName, String enteremail, String confirmemail,
			String enternewpassword, String entermonth, String enterdays, String enteryears ) throws InterruptedException {
		this.getCreateAccount();
		this.getFirstName(enterFirstName);
		this.getLastName(enterLastName);
		this.getEmail(enteremail);
		this.getReEnterEmail(confirmemail);
		this.getNewPassword(enternewpassword);
		

		return this.getSignUp();

	//String confirmemail
		}
}
