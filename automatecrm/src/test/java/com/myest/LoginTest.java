package com.myest;

import org.testng.annotations.Test;

import com.mypage.LoginPage;

public class LoginTest extends BaseTest {
	
	LoginPage lg;
	@Test(priority = 0)
	public void GetLoginIntoAccount() throws InterruptedException
	{
	    lg = new LoginPage(driver);
		lg.DoLogin();
		Thread.sleep(5000);
		
	}
	
}
