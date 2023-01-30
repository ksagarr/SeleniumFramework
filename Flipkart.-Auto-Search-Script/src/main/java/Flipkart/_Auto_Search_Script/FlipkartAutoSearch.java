package Flipkart._Auto_Search_Script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAutoSearch {
	@Test 
	public static void search() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("ipad");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> sp=driver.findElements(By.xpath("//div[contains(@class ,'lrtEPN _17d0yO')]"));
		Thread.sleep(5000);
		try {
		for (WebElement nsp : sp) {
			if(nsp.getText().equalsIgnoreCase("ipad 10th generation"))
			{
				nsp.click();
			}
		}
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
		}
	}

}
