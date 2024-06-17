package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntotheElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.caratlane.com/");
		
		
		WebDriverWait explicitDriverWait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement logo = driver.findElement(By.xpath("//div[@name='logo']"));
		explicitDriverWait.until(ExpectedConditions.visibilityOf(logo));
		
		System.out.println(logo.isDisplayed());
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		for(;;){
			try{
				driver.findElement(By.xpath("//section[@data-name='bestseller_or_recentlyViewed']//span[text()='MEN']"));
				break;
			}
			catch(NoSuchElementException E){
				js.executeScript("window.scrollBy(0,500);");
			}
		}
		
		
		
		

	}

}
