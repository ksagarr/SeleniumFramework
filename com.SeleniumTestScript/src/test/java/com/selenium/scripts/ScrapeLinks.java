package com.selenium.scripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrapeLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// JavascriptExecutor js= (JavascriptExecutor)driver;
		String pages = driver.findElement(By.xpath("//span[@class=\"title-count\"]")).getText().split(" ")[2];
		List<WebElement> links = driver.findElements(By.tagName("img"));
		// System.out.println("===================total pages:"+pages);
		WebElement button = driver.findElement(By.xpath("//a[@rel=\"next\"]"));
		Actions ac = new Actions(driver);
		// Thread.sleep(3000);
		// ac.moveToElement(button).perform();
		int code = 200;
		for (WebElement l : links) {
			String url = l.getAttribute("src");
			try {
				URL urllink = new URL(url);
				HttpURLConnection up = (HttpURLConnection) urllink.openConnection();
				up.setRequestMethod("HEAD");
				up.connect();
				int resCode = up.getResponseCode();
				if (resCode == code) {
					System.out.println("Good Links: " + url);
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		ac.scrollByAmount(0, 5000);
		System.out.println("================================================================");
		while (true) {
			try {
				button.click();
			links = driver.findElements(By.tagName("img"));
				for (WebElement l : links) {
					String url = l.getAttribute("src");

					URL urllink = new URL(url);
					HttpURLConnection up = (HttpURLConnection) urllink.openConnection();
					up.setRequestMethod("HEAD");
					up.connect();
					int resCode = up.getResponseCode();
					if (resCode == code) {
						System.out.println("Good Links: " + url);
					}

				}
				ac.scrollByAmount(0, 5000);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			catch (StaleElementReferenceException e) {
			}
			System.out.println("================================================================");
			try {
				button = driver.findElement(By.xpath("//a[@rel=\"next\"]"));
			} catch (Exception e) {
		          System.out.println("No more P roducts or Links");
			}
			
		}

	}
}
