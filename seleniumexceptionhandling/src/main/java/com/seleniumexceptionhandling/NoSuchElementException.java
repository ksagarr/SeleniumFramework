/**
 * 
 */
package com.seleniumexceptionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ksagar
 *
 */
public class NoSuchElementException {

    // There are Three ways to handling no such element exception
	//1.when we get an exception then we need go to application and check your xpath is valid or not. if xpath is not valid then find valid xpath.
	//2.Using wait we can overcome that exception
	//2.If your xpath is valid then check the element and our element  is present in frame or not , if present in frame then we need to switch to frame.
	@Test
	public static void search() throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_checkbox");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("vehicle1")).click();
    }
}
