package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.utility.readConfig;

public class Registationpage extends BaseClass {
    
	private By drop=By.id("payment_plan_id");
	private By singup=By.xpath("//ul[@class=\"nav navbar-nav navbar-right\"]/li[2]/a[text()=\"Sign Up\"]");
	private By firstnmae=By.name("first_name");
	private By lastname = By.name("surname");
	private By email=By.name("email");
	private By cemail=By.name("email_confirm");
	private By uname=By.name("username");
	private By psw = By.name("password");
	private By cpsw=By.name("passwordconfirm");
	private By checkbox=By.xpath("//input[@type=\"checkbox\"]");
	private By submit= By.name("submitButton");
	private By compney=By.id("company_name");
	private By phone=By.id("phone");
	private By website=By.id("website");
	private By company_email=By.id("company_email");
	private By city=By.id("city");
	private By state=By.id("state");
	private By postcode=By.id("postcode");
	private By country = By.name("country");
	private By Complete_Registration = By.xpath("//div[@style=\"padding-top:10px; float:left;\"]//button[2]");
	private By sucussfulReg = By.className("text_orange");
	private By billaddress = By.name("copy_address");
	private By continuebutton = By.name("btnSubmit");
	
	readConfig rd = new readConfig();
	public Registationpage(WebDriver driver) {
		super(driver);

	}
	public WebElement getSingup() 
	{
		return getElement(singup);
	}
	public WebElement getCheckbox() 
	{
		return getElement(checkbox);
	}
	public WebElement getSubmit() 
	{
		return getElement(submit);
	}
	public WebElement getFirstnmae() 
	{
		return getElement(firstnmae);
	}
	public WebElement getLastname() 
	{
		return getElement(lastname);
	}
	public WebElement getEmail() 
	{
		return getElement(email);
	}
	public WebElement getCemail() 
	{
		return getElement(cemail);
	}
	public WebElement getUname() 
	{
		return getElement(uname);
	}
	public WebElement getPsw() 
	{
		return getElement(psw);
	}
	public WebElement getCpsw() 
	{
		return getElement(cpsw);
	}
	public String regiStationpagetTitle()
	{
		return getPageTitle();
	}
	public WebElement getCompney() 
	{
		return getElement(compney);
	}
	public WebElement getPhone() 
	{
		return getElement(phone);
	}
	public WebElement getWebsite() 
	{
		return getElement(website);
	}
	public WebElement getCity() 
	{
		return getElement(city);
	}
	public WebElement getState() 
	{
		return getElement(state);
	}
	public WebElement getPostcode() 
	{
		return getElement(postcode);
	}
	public WebElement getComplete_Registration()
	{
		return getElement(Complete_Registration);
	}
	public WebElement getSucussfulReg() 
	{
		return getElement(sucussfulReg);
	}
	public WebElement getBilladdress() 
	{
		return getElement(billaddress);
	}
	public WebElement getContinuebutton() 
	{
		return getElement(continuebutton);
	}
	public WebElement getCompany_email() 
	{
		return getElement(company_email);
	}

	
	public void doreg()
	{
		getSingup().click();
		selectByVisibleText(drop, "Free Edition");
		getFirstnmae().sendKeys(rd.getFirstName());
		getLastname().sendKeys(rd.getLastName());
		getEmail().sendKeys(rd.getEmailID());
		getCemail().sendKeys(rd.getEmailID());
		getUname().sendKeys(rd.getUsername());
		getPsw().sendKeys(rd.getPassword());
		getCpsw().sendKeys(rd.getPassword());
		getCheckbox().click();
		getSubmit().click();

		//return getInstance(HomePage.class);
	}
	
	public void componeyInfo() throws InterruptedException
	{
		getCompney().sendKeys("stdeth");
		getPhone().sendKeys("145789");
		getWebsite().sendKeys("www.stdeth.com");
		getCompany_email().sendKeys(rd.getEmailID());
		getCity().sendKeys("Helsinki");
		getState().sendKeys("Lapland");
		getPostcode().sendKeys("415878");
		selectByVisibleText(country, "Finland");
		getBilladdress().click();
		getContinuebutton().click();
	    scrollToElement(Complete_Registration);
		getComplete_Registration().click();;
	}
	public String validateReg()
	{
		return getPageHeader(sucussfulReg);
	}

}

