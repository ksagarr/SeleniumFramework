/**
 * 
 */
package com.myest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.mypage.BaseClass;
import com.mypage.page;
import com.utility.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ksagar
 *
 */
public class BaseTest {

	WebDriver driver;
	page pg;
	readConfig rd = new readConfig();
	String browser=rd.getBroser();
	@BeforeMethod
	public void setUpTest()
	{
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		driver.get(rd.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pg= new BaseClass(driver);
	}
	
}
