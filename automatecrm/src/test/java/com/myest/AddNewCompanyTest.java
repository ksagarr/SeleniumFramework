package com.myest;

import org.testng.annotations.Test;

import com.mypage.LoginPage;
import com.mypage.Navigation;

public class AddNewCompanyTest extends BaseTest {
	
	Navigation nv;
	LoginPage lg;
	@Test
	public void AddCompany() throws InterruptedException 
	{
		nv= new Navigation(driver);
		lg = new LoginPage(driver);
		lg.DoLogin();
		Thread.sleep(5000);
		nv.ClickOnNewCompany();
	}
	
	

}
