package com.selenium.scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotDemo {

	  public static void main(String[] args)   {
		  WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			TakesScreenshot src=(TakesScreenshot)driver;
			File sfile=src.getScreenshotAs(OutputType.FILE);
			try {
				File dest= new File(System.getProperty("user.dir")+"\\ScreenShot\\img.png");
				FileUtils.copyFile(sfile, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement search= driver.findElement(By.className("lnXdpd"));
			File ele=search.getScreenshotAs(OutputType.FILE);
			File dest= new File(System.getProperty("user.dir")+"\\ScreenShot\\elesearch.png");
			try {
				FileUtils.copyFile(ele, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
