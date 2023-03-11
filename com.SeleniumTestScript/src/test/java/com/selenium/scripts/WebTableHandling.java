package com.selenium.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.moneycontrol.com/stocks/marketstats/bsemact1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		////div[@class="ReuseTable_bsr_table__1CjQ3 ReuseTable_hist_tbl_hm__1E7kx ReuseTable_PR__3JfHx undefined"]//tr/th column
		////div[@class="ReuseTable_bsr_table__1CjQ3 ReuseTable_hist_tbl_hm__1E7kx ReuseTable_PR__3JfHx undefined"]//tbody/tr/td rows
		List<WebElement> rows=driver.findElements(By.xpath("//div[@class=\"bsr_table hist_tbl_hm\"]//tbody/tr"));
	    int rowssize=rows.size();
	    System.out.println("total rows "+rowssize);
	    List<WebElement> column=driver.findElements(By.xpath("//div[@class=\"bsr_table hist_tbl_hm\"]//tbody/tr/td"));
	    int columnsize=column.size();
	    System.out.println("total column "+columnsize);
	    for(int i=1;i<=34;i++) {
	    	System.out.println("===========================================================");
	    	for(int j=1;j<=7;j++) {
	   String data=driver.findElement(By.xpath("//div[@class=\"bsr_table hist_tbl_hm\"]//tbody/tr["+i+"]/td["+j+"]")).getText();
       System.out.println(data);	    	}
	    }
	    
	}
}
