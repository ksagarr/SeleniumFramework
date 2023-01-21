package com.myest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.mypage.Registationpage;

public class RegistationTest extends BaseTest {
	
	@Test
	public void registerUser() throws InterruptedException
	{
		Registationpage rg = new Registationpage(driver);
		rg.doreg();
		rg.componeyInfo();
		String value=rg.validateReg();
		Assert.assertEquals(value, "Your account is now registered.");
	}

}
