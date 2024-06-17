package practiceSection;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class OpenApplication {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.rubanbridge.connect");
		capabilities.setCapability("appActivity", "com.rubanbridge.connect.MainActivity");
		capabilities.setCapability("noReset", "true");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
	       
        // Get list of WebElements after swiping
        List<WebElement> elements = driver.findElements(By.xpath("//android.view.View[@content-desc='Featured Stores']/..//android.view.View//android.view.View//android.widget.ImageView"));
        for (WebElement element : elements) {
            // Do something with each element
            System.out.println(element.getText());
        }
	}
}
