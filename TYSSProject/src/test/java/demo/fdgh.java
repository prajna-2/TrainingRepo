package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class fdgh {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
				DesiredCapabilities dc=new DesiredCapabilities();
				dc.setCapability(CapabilityType.PLATFORM_NAME, "Android");
				dc.setCapability("autoGrantPermissions", "true");
				dc.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
				ChromeOptions chromeOptions = new ChromeOptions();
		        chromeOptions.addArguments("--enable-notifications");

		        // Set the ChromeOptions capability
		        dc.setCapability("goog:chromeOptions", chromeOptions);
				dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\User\\AppData\\Roaming\\fire-flink-client\\localnode\\chromedriver.exe");
			
				dc.setCapability("noReset", "true");
				dc.setCapability("fullReset", "false");

				URL url=new URL("http://localhost:4723/wd/hub/");
				AppiumDriver driver=new AppiumDriver(url,dc);
			
				driver.get("https://www.caratlane.com/");
				
			}


		

	}

	

