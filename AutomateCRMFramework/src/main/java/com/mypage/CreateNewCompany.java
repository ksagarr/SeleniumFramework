/**
 * 
 */
package com.mypage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author ksagar
 *
 */
public class CreateNewCompany extends BaseClass {
           
	public CreateNewCompany(WebDriver driver) {
		super(driver);
	}
	private By title=By.xpath("//legend[contains(text(),'Create ')]");
	private By company=By.id("company_name");
	private By industry=By.name("industry");
	private By annual_revenue=By.id("annual_revenue");
	private By noofemployees=By.id("num_of_employees");
	private By status=By.xpath("//select[@name=\"status\"]");
	private By category=By.xpath("//select[@name=\"category\"]");
	private By priority=By.xpath("//select[@name=\"priority\"]");
	private By source=By.xpath("//select[@name=\"source\"]");
	private By identifier=By.xpath("//input[@name=\"identifier\"]");
	private By vatnumber=By.id("vat_number");
	private By addresstitle=By.name("address_title");
	private By city=By.name("city");
	private By state=By.name("state");
	private By country=By.name("country");
	private By phone=By.id("phone");
	private By website=By.id("website");
	private By postcode=By.name("postcode");
	private By email=By.id("email");
	private By save=By.xpath("//input[@type=\"submit\"]");
	/**
	 * @return the title
	 */
	public WebElement getTitle() {
		return getElement(title);
	}
	/**
	 * @return the company
	 */
	public WebElement getCompany() {
		return getElement(company);
	}
	/**
	 * @return the industry
	 */
	public WebElement getIndustry() {
		return getElement(industry);
	}
	/**
	 * @return the annual_revenue
	 */
	public WebElement getAnnual_revenue() {
		return getElement(annual_revenue);
	}
	/**
	 * @return the noofemployees
	 */
	public WebElement getNoofemployees() {
		return getElement(noofemployees);
	}
	/**
	 * @return the status
	 */
	public By getStatus() {
		return  status;
	}
	/**
	 * @return the category
	 */
	public By getCategory() {
		return category;
	}
	/**
	 * @return the priority
	 */
	public By getPriority() {
		return priority;
	}
	/**
	 * @return the source
	 */
	public By getSource() {
		return source;
	}
	/**
	 * @return the identifier
	 */
	public WebElement getIdentifier() {
		return getElement(identifier);
	}
	/**
	 * @return the vatnumber
	 */
	public WebElement getVatnumber() {
		return getElement(vatnumber);
	}
	/**
	 * @return the addresstitle
	 */
	public WebElement getAddresstitle() {
		return getElement(addresstitle);
	}
	/**
	 * @return the city
	 */
	public WebElement getCity() {
		return getElement(city);
	}
	/**
	 * @return the state
	 */
	public WebElement getState() {
		return getElement(state);
	}
	/**
	 * @return the country
	 */
	public WebElement getCountry() {
		return getElement(country);
	}
	/**
	 * @return the phone
	 */
	public WebElement getPhone() {
		return getElement(phone);
	}
	/**
	 * @return the website
	 */
	public WebElement getWebsite() {
		return getElement(website);
	}
	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return getElement(email);
	}
	/**
	 * @return the save
	 */
	public WebElement getSave() {
		return getElement(save);
	}
	
	/**
	 * @return the postcode
	 */
	public WebElement getPostcode() {
		return getElement(postcode);
	}
	public String validateTaskpageTitle()
	{
		//driver.switchTo().frame("leftpanel");
		return getPageHeader(title);
	}
	
	public void addInfo()
	{
		getCompany().sendKeys("Doyletdxxz Ltd");
		getIndustry().sendKeys("IT");
		getAnnual_revenue().sendKeys("$2billion");
		getNoofemployees().sendKeys("5000");
		selectByVisibleText(status, "Active");
		selectByVisibleText(category, "Prospect");
		selectByVisibleText(priority, "High");
		selectByVisibleText(source, "Web Service");
		getIdentifier().sendKeys("200,Jhon sed");
		getVatnumber().sendKeys("U12345678");
		getAddresstitle().sendKeys("200 Broad St");
		getCity().sendKeys("Oakwood");
		getState().sendKeys("Texas");
		getPostcode().sendKeys("75855");
		getCountry().sendKeys("United States");
		getPhone().sendKeys("545-0088");
		getWebsite().sendKeys("www.Doyletdxxz.xyz");
		getEmail().sendKeys("info@Doyletdxxz.xyz");
		getSave().click();
	}
}
