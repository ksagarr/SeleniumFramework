package com.mypage;
import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class page {
	
	WebDriver driver;
	WebDriverWait wait;
	public static Logger logger;
	Actions action;
    public page(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
		action = new Actions(driver);	
	}
	
	//Abstract Methods
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By Locator);
	
	public abstract WebElement getElement(By Locator);
	
	public abstract WebElement getElements(By Locator);
	
	public abstract void waitforElement(By Locator);
	
	public abstract void waitforTitle(String Title);
	
	public abstract void scrollToElement(By Locator);
	
	public abstract void selectByVisibleText(By Locator ,String text);
	
	public abstract void javascrpitScroll(By Locator);
	
	public abstract void javascrpitClick(By Locator);
	
	public abstract void MouseMoveOver(WebElement element);
	
	public <Tpage extends BaseClass> Tpage getInstance(Class<Tpage> pageClass) 
	{
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		return null;
	}
	
}
