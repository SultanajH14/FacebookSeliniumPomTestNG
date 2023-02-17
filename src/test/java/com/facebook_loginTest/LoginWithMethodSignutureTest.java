package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPageMethodSignature;

public class LoginWithMethodSignutureTest {
	@Test
	public void positiveLoginTest() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();
		lpms.openAps();
		lpms.getUserName("nefje1");
		lpms.getPassword("dcbdcj");
		lpms.getLoginButton();
	}

	@Test
	public void positiveLoginTest1() {
		LoginPageMethodSignature lpms = new LoginPageMethodSignature();
		lpms.openAps();
		lpms.getUserName("nefj");
		lpms.getPassword("dcbdcj");
		lpms.getLoginButton();

	}
}
