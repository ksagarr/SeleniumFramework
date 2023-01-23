/**
 * 
 */
package com.myest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mypage.CreateNewCompany;
import com.mypage.LoginPage;
import com.mypage.Navigation;

/**
 * @author ksagar
 *
 */
public class CreateNewCompanyTest extends BaseTest {
	
	CreateNewCompany create;
	@BeforeClass
	public void dologinclicknav()
	{
	    pg.getInstance(LoginPage.class).DoLogin();
	    create=pg.getInstance(Navigation.class).ClickOnNewCompany();
	}
	@Test(priority =1)
	public void verifyTaskPageTitle() 
	{
		String value=pg.getInstance(CreateNewCompany.class).validateTaskpageTitle();
		Assert.assertEquals(value, "Create New Company");
	}
	@Test(priority = 2)
	public void addInfoInTask() 
	{
		pg.getInstance(CreateNewCompany.class).addInfo();
	}

}
