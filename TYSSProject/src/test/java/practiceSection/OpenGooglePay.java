package practiceSection;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OpenGooglePay {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.google.android.apps.nbu.paisa.user");
		capabilities.setCapability("appActivity", "com.google.nbu.paisa.flutter.gpay.app.LauncherActivity");
		capabilities.setCapability("noReset", "true");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
	}

}
