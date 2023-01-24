/**
 * 
 */
package com.myest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


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
	public page pg;
	readConfig rd = new readConfig();
	String browser=rd.getBroser();
	@BeforeClass
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
	public void CaptureScreenShot(WebDriver driver,String testname) throws IOException
	{
		TakesScreenshot ts= ((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png");
		FileUtils.copyFile(src, dest);
	}
}
