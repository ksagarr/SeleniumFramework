/**
 * 
 */
package com.mypage;

import org.openqa.selenium.WebDriver;

/**
 * @author ksagar
 *
 */
public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getHomepageTitle() 
	{
		return getPageTitle();
	}

}
