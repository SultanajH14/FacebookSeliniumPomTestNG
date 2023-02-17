package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPageWithVariables;

public class LoginPageWithVariableTest {
	@Test
	public void boundaryLoginTest() {
		LoginPageWithVariables lpv = new LoginPageWithVariables();
    lpv.openAps();
		lpv.getUserName("wghdhde");
		lpv.getPassword("ggdwhd");
		lpv.getLoginButton();
	}

}
