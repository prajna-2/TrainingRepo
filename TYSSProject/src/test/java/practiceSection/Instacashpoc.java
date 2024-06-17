package practiceSection;

import java.time.Duration;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import com.google.common.collect.Multiset.Entry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instacashpoc {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        options.setCapability("goog:loggingPrefs", logPrefs);
		WebDriver driver=new ChromeDriver(options);

		driver.manage().window().maximize();
		
		driver.get("https://getinstacash.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Login")).click();
		WebElement loginText = driver.findElement(By.xpath("//p[text()='Login with Mobile Number']"));
		
		System.out.println("login text is displayed"+loginText.isDisplayed());
		
		WebElement phoneNumber = driver.findElement(By.name("mobile"));
		phoneNumber.clear();
		phoneNumber.sendKeys("7019759212");

		driver.findElement(By.xpath("//button[@data-langkey='Send OTP' and @data-action='submit']")).click();
		
		Thread.sleep(3000);
		LogEntries logEntries = driver.manage().logs().get(LogType.PERFORMANCE);

	for (LogEntry logEntry : logEntries) {
		if (logEntry.getMessage().contains("sendOTP&")) {
			System.out.println(logEntry.getMessage());

		}
	}
		
	}

}
