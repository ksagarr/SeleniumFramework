package com.myest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mypage.CreateNewCompany;
import com.mypage.LoginPage;
import com.mypage.Navigation;

public class AddNewCompanyTest extends BaseTest {
	
	CreateNewCompany create;
	@Test
	public void AddCompany() throws InterruptedException 
	{
		pg.getInstance(LoginPage.class).DoLogin();
		Thread.sleep(5000);
		create=pg.getInstance(Navigation.class).ClickOnNewCompany();
	}
	
	
	
	

}
