/**
 * 
 */
package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author ksagar
 *
 */
public class Navigation extends BaseClass{
	

	
	

	private By newcompany=By.xpath("//a[contains(text(),'Companies')]");
	private By addtask=By.xpath("//a[contains(text(),'New Company')]");
	
	
	public Navigation(WebDriver driver) {
		super(driver);
	}
	

	public WebElement getAddtask() 
	{
		return getElement(addtask);
	}


	public WebElement getNewcompany() 
	{
		return getElement(newcompany);
	}

	public CreateNewCompany ClickOnNewCompany()
	{
		driver.switchTo().frame("mainpanel");
	  	MouseMoveOver
	    (wait.until(ExpectedConditions.visibilityOfElementLocated(newcompany)));
	  	getAddtask().click();
	  	return new CreateNewCompany();
	}


	
	
}
