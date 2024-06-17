package practiceSection;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.remote.SupportsRotation;
import io.appium.java_client.touch.offset.PointOption;

public class BriskpeApplication2 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		//cap.setCapability("appPackage", "com.briskpe.sme.mobile");
		//cap.setCapability("appActivity", "com.briskpe.sme.mobile.MainActivity");
		cap.setCapability("noReset", "true");
		URL url = new URL("http://localhost:4723/wd/hub");
		//WebDriver driver = new AppiumDriver(url, cap);
		AppiumDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.findElement(By.xpath("(//android.view.View//android.view.View//android.widget.Image)[5]")).click();
		
		Thread.sleep(9000);
	System.out.println("hi");
		//AppiumDriver driver1 = new AndroidDriver(url, cap);
	
		//driver.findElement(By.xpath("//*[@text='Play Video']")).click();
		
		((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);

	}

}
