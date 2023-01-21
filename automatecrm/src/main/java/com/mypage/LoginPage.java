package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utility.readConfig;

public class LoginPage extends BaseClass {
     
    private By username=By.name("username");
    private By password=By.name("password");
    private By login=By.xpath("//input[@value=\"Login\"]");
    private By ValidUser=By.xpath("//td[@class=\"headertable\"]//td[@align=\"left\"]");
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
	public WebElement getValidUser() 
	{
		return getElement(ValidUser);
	}
	public void DoLogin()
	{
		getUsername().sendKeys(rd.getUsername());
		getPassword().sendKeys(rd.getPassword());
		getLogin().click();
	}
	
	public String validateUserName()
	{
		return getValidUser().toString();
	}


	

}
