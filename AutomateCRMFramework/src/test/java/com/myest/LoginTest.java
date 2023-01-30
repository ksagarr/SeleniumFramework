package com.myest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypage.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void GetLoginIntoAccount() throws InterruptedException
	{
		pg.getInstance(LoginPage.class).DoLogin();
		Thread.sleep(5000);
		
	}
	@Test(priority = 2)
	public void validateLoginPageTitle()
	{
		boolean value=pg.getInstance(LoginPage.class).LoginPageTitle();
		Assert.assertTrue(value);
	}
	
}
