package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	@Test(groups = "smoke")
	public void launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.mobiscroll.com/fullscreen/eventcalendar/multiple-timezone-support");
		WebElement year = driver.findElement(By.xpath("//div[contains(@id,'mbsc-control')]//button[@type='button']//span[2]"));
		
		
		
	}

}
