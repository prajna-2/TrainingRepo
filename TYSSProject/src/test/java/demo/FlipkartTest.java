package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartTest {
	@Test(groups = "smoke")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
}
