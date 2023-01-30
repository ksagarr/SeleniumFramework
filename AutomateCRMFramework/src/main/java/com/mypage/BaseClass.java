package com.mypage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass extends page {


	public BaseClass(WebDriver driver) {
		super(driver);

	}

	JavascriptExecutor js;

	@Override
	public String getPageTitle() {

		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By Locator) {
		return getElement(Locator).getText();
	}

	@Override
	public WebElement getElement(By Locator) {
		WebElement element=null;
		try {
			element=driver.findElement(Locator);
			return element;
		}catch (Exception e) {
			System.out.println("Some Exception Occured While Creating element"+Locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public WebElement getElements(By Locator) {
		List<WebElement> element=null;
		try {
			element=driver.findElements(Locator);
			return (WebElement) element;
		}catch (Exception e) {
			System.out.println("Some Exception Occured While Creating element"+Locator.toString());
			e.printStackTrace();
		}
		return (WebElement) element;

	}

	@Override
	public void waitforElement(By Locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		}
		catch (Exception e) {
			System.out.println("Show the error/exception for waiting element"+Locator.toString());
		}

	}

	@Override
	public void waitforTitle(String Title) {
		try {
			wait.until(ExpectedConditions.titleContains(Title));
		}
		catch (Exception e) {
			System.out.println("Show the error/exception for waiting element"+Title);
		}

	}

	@Override
	public void scrollToElement(By Locator) {
		action.scrollToElement(getElement(Locator)).perform();

	}

	@Override
	public void selectByVisibleText(By Locator, String text) {
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(text);

	}



	@Override
	public void javascrpitScroll(By Locator) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", getElement(Locator));
		
		}



	@Override
	public void javascrpitClick(By Locator) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", getElement(Locator));
		}

	@Override
	public void MouseMoveOver(WebElement element) {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		
	}

	@Override
	public boolean GetDisplay(By Locator) {
	
		return getElement(Locator).isDisplayed();
	}

	

}
