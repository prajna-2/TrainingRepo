package demo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBetweenTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Renew']")).click();
		Thread.sleep(1000);
		Set<String> allWindowsId = driver.getWindowHandles();
		
		ArrayList list=new ArrayList<>();

		for(String windowId:allWindowsId){
			list.add(windowId);
			driver.switchTo().window(windowId);
			
			System.out.println(list);
			//String actualPageTitle = driver.getTitle();
			try {
				driver.findElement(By.xpath("//*[@id=\"alternative_number\"]")).isDisplayed(); 
				driver.findElement(By.xpath("//*[@id=\"alternative_number\"]")).sendKeys("987897784");
				System.out.println("Sucessfully switched the tab thourgh element");
				break;
			}
			catch (Exception e) {
				System.out.println("Failed to switch");
			}

		}

	}

}
