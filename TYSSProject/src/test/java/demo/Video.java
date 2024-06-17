package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Video {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.out.println(System.getProperty("user.home"));
		UiAutomator2Options options = new UiAutomator2Options();
		options.setChromedriverExecutable(
				"C:\\Users\\User\\AppData\\Roaming\\fire-flink-client\\localnode\\chromedriver.exe");
		options.setCapability("browserName", "chrome");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.caratlane.com/");
		System.out.println(driver.getContextHandles());
		Thread.sleep(10000);
		driver.context("NATIVE_APP");
		driver.findElement(By.xpath("//*[contains(@text,'Allow')]")).click();
		System.out.println("clicked on allow button");
		driver.context("CHROMIUM");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[text()='Watch'])[1]")).click();
		System.out.println("clicked on watch button");
		

		Boolean isPlaying = (Boolean) driver.executeScript("return arguments[0].paused;", driver.findElement(By.xpath("//video")));
		
		
		System.out.println(isPlaying);

		
		
	}
}

