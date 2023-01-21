/**
 * 
 */
package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author ksagar
 *
 */
public class Navigation extends BaseClass{
	

	
	

	private By newcompany=By.cssSelector("document.querySelector(\".mlddm\").querySelectorAll(\"li\")[7]");
	
	public Navigation(WebDriver driver) {
		super(driver);
	}
	
	
    
	public WebElement getNewcompany() 
	{
		return getElement(newcompany);
	}
    
	public void ClickOnNewCompany()
	{
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		WebElement  movetoelement=(WebElement) js.executeScript("return document.querySelector(\".mlddm\").querySelectorAll(\"li\")[6]");
		
	}
	
	
}
