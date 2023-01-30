package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utility.readConfig;

public class LoginPage extends BaseClass {
     
    private By username=By.name("username");
    private By password=By.name("password");
    private By login=By.xpath("//input[@value=\"Login\"]");
    private By userTitle=By.xpath("//td[contains(text(),' suraj ')]");
	readConfig rd = new readConfig();
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getUsername() {
		return getElement(username);
	}
	public WebElement getPassword() {
		return  getElement(password);
	}
	public WebElement getLogin() {
		return  getElement(login);
	}
	public boolean LoginPageTitle()
	{
		driver.switchTo().frame("mainpanel");
		return GetDisplay(userTitle);
	}
	public void DoLogin()
	{
		getUsername().sendKeys(rd.getUsername());
		getPassword().sendKeys(rd.getPassword());
		getLogin().click();
	}
	
	


	

}
