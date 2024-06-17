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
import io.appium.java_client.touch.offset.PointOption;

public class BriskpeApplication {
	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.briskpe.sme.mobile");
		cap.setCapability("appActivity", "com.briskpe.sme.mobile.MainActivity");
		cap.setCapability("noReset", "true");
		URL url = new URL("http://localhost:4723/wd/hub");
		//WebDriver driver = new AppiumDriver(url, cap);
		AppiumDriver driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String mobileNumber = "9833010550";
		String otp = "123456";
		String companyName = "tyss";
		String payerNickname = "Prajna";
		String email = "mailto:tyss@gmail.com";
		String companyWebsite="https://abcd.com/";
		String cname="ffdfdf";

		Actions act =new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	
		  try { wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		  xpath("//android.widget.Button[@content-desc='Log in with Mobile Number']")))
		  ; WebElement loginWithMobileNumber = driver.findElement(By.
		  xpath("//android.widget.Button[@content-desc='Log in with Mobile Number']"));
		  System.out.println("Login link is displayed, "+loginWithMobileNumber.
		  isDisplayed()); loginWithMobileNumber.click(); } catch (Exception e) {
		  System.out.println("Not displayed"); }
		 

		WebElement mobileNumberTextfield = driver.findElement(By.xpath("//android.view.View[@content-desc='Enter Phone Number']/..//android.widget.EditText"));
		System.out.println("Phone Number Textfield is displayed, "+mobileNumberTextfield.isDisplayed());
		mobileNumberTextfield.sendKeys(mobileNumber);

		WebElement getOTP = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Get OTP']"));
		getOTP.click();



		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));

		WebElement otpTextfield = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'We sent you an OTP')]/following-sibling::android.widget.EditText"));
		System.out.println("OTP Textfield is displayed, "+otpTextfield.isDisplayed());
		otpTextfield.sendKeys(otp);


		WebElement verifyButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Verify']"));
		verifyButton.click();

		WebElement setUpTPIN = driver.findElement(By.xpath("//android.view.View[@content-desc='Setup TPIN']"));
		System.out.println("Setup TPIN text is displayed, "+setUpTPIN.isDisplayed());

		WebElement createTPIN = driver.findElement(By.xpath("//android.view.View[@content-desc='Confirm TPIN']/preceding-sibling::android.view.View//android.view.View/following-sibling::android.widget.EditText"));

		Dimension sizeOfCreateTPIN = createTPIN.getSize();
		Point locationOFCreateTPIN = createTPIN.getLocation();
		int xCoordinatelocationOFCreateTPIN = locationOFCreateTPIN.getX();
		int yCoordinatelocationOFCreateTPIN = locationOFCreateTPIN.getY();

		Thread.sleep(3000);

		System.out.println("Clicked on Verfiy Button");
		//	 createTPIN.click();
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));

		Thread.sleep(2000);

		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));


		WebElement saveButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']"));
		saveButton.click();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Not Now']")));
			WebElement notNowButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Not Now']"));
			System.out.println("Not Now Button is displayed, "+notNowButton.isDisplayed());
			notNowButton.click();
		}
		catch (Exception e) {
			System.out.println("Not Clicked on Not now");
		}

		WebElement managePayers = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Manage Payers']"));
		managePayers.click();

		WebElement addPayers = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add Payer']"));
		addPayers.click();

		WebElement companyNameTextfield = driver.findElement(By.xpath("(//android.view.View/android.widget.EditText)[1]"));
		companyNameTextfield.click();
		companyNameTextfield.sendKeys(companyName);

		// Create a Random object
		Random random = new Random();

		// Generate a random integer between 1 and 100
		int randomNumber = random.nextInt(1000) + 1;


		WebElement payerNicknamefield = driver.findElement(By.xpath("(//android.view.View/android.widget.EditText)[2]"));
		payerNicknamefield.click();
		Thread.sleep(1000);
		payerNicknamefield.click();
		payerNickname=payerNickname+randomNumber;
		payerNicknamefield.sendKeys(payerNickname);

		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));


		WebElement countryDropdown = driver.findElement(By.xpath("(//android.view.View/android.widget.EditText)[3]"));
		countryDropdown.click();

		WebElement countryOption = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='US']"));
		countryOption.click();

		WebElement emailTextfield = driver.findElement(By.xpath("(//android.widget.EditText)[3]"));
		emailTextfield.click();
		emailTextfield.sendKeys(email);

		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));

		WebElement companyWebsiteTextfield = driver.findElement(By.xpath("(//android.widget.EditText)[4]"));
		companyWebsiteTextfield.click();
		companyWebsiteTextfield.sendKeys(companyWebsite);

		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));

		WebElement purposeCodeDropdown = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Purpose Code')]/android.view.View[4]/android.widget.EditText"));
		purposeCodeDropdown.click();

		WebElement purposeCodeOption = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'P0101')]/android.widget.CheckBox"));
		purposeCodeOption.click();

		WebElement submitButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Submit']"));
		submitButton.click();

		try {

			Dimension screenSize = driver.manage().window().getSize();//Identify screen dimension
			int screenCenter = (int) (screenSize.getWidth()*0.2);//Identify center point of screen for Y axis
			int startPoint = (int) (screenSize.getHeight()*0.3);//Identify beginning point of scroll for X axis
			int endPoint = (int) (screenSize.getHeight()*0.1);//Identify ending point of scroll
			int count=0;
			int maxSwipeCount = 1;			

			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

			//Search Element until it is available on screen. If no, then perform below operations
			while (driver.findElements(By.xpath("//android.widget.Button[@content-desc='Save']")).isEmpty()) {
				Sequence swipe =  new Sequence(finger, 1);

				//Move finger into starting position
				swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), screenCenter, startPoint));


				//Finger goes up into contact with screen
				swipe.addAction(finger.createPointerDown(0));

				//Finger moves to End Position
				swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), screenCenter, endPoint));

				//Take out finger from screen
				swipe.addAction(finger.createPointerUp(0));

				driver.perform(Arrays.asList(swipe));

				if(++count >= maxSwipeCount) {
					break;
				}
				if(count >= maxSwipeCount) {

				}
				else {
					Thread.sleep(1000);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Not Scrolled");	}


		WebElement save = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
		save.click();
		Thread.sleep(2000);
		WebElement payerAddedText = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'Payer Added Successfully')]"));
		System.out.println("Payers Added Succesfully text is displayed, "+payerAddedText.isDisplayed());

		WebElement okButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']"));
		okButton.click();

		WebElement forwardNickname = driver.findElement(By.xpath("(//android.view.View[contains(@content-desc,'"+payerNickname+"')])[1]/android.widget.Button"));
		System.out.println("Forward Nick name icon is displayed, "+forwardNickname.isDisplayed());
		forwardNickname.click();

		WebElement edit = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Edit\"]"));
		System.out.println("Edit link is displayed, "+edit.isDisplayed());
		edit.click();

		WebElement comNameTextfield = driver.findElement(By.xpath("//android.widget.EditText[@text='"+companyName+"']"));
		System.out.println("Edit link is displayed, "+comNameTextfield.isDisplayed());
		comNameTextfield.click();
		Thread.sleep(2000);
		comNameTextfield.click();
		Thread.sleep(1000);
		comNameTextfield.click();
		comNameTextfield.clear();
		comNameTextfield.sendKeys(cname);
		
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));

		try {

			Dimension screenSize = driver.manage().window().getSize();//Identify screen dimension
			int screenCenter = (int) (screenSize.getWidth()*0.2);//Identify center point of screen for Y axis
			int startPoint = (int) (screenSize.getHeight()*0.3);//Identify beginning point of scroll for X axis
			int endPoint = (int) (screenSize.getHeight()*0.1);//Identify ending point of scroll
			int count=0;
			int maxSwipeCount = 1;			

			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

			//Search Element until it is available on screen. If no, then perform below operations
			while (driver.findElements(By.xpath("//android.widget.Button[@content-desc='Save']")).isEmpty()) {
				Sequence swipe =  new Sequence(finger, 1);

				//Move finger into starting position
				swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), screenCenter, startPoint));


				//Finger goes up into contact with screen
				swipe.addAction(finger.createPointerDown(0));

				//Finger moves to End Position
				swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), screenCenter, endPoint));

				//Take out finger from screen
				swipe.addAction(finger.createPointerUp(0));

				driver.perform(Arrays.asList(swipe));

				if(++count >= maxSwipeCount) {
					break;
				}
				if(count >= maxSwipeCount) {

				}
				else {
					Thread.sleep(1000);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Not Scrolled");	
		}

		
		WebElement saveButton1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']"));
		saveButton1.click();
		
		WebElement oKButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']"));
		oKButton.click();
		
		WebElement forwardIconNickname = driver.findElement(By.xpath("(//android.view.View[contains(@content-desc,'"+payerNickname+"')])[1]/android.widget.Button"));
		System.out.println("Forward Nick name icon is displayed, "+forwardIconNickname.isDisplayed());
		forwardIconNickname.click();
		
		WebElement companyNameVerify = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'"+cname+"')]"));
		System.out.println("Company Name is displayed, "+companyNameVerify.isDisplayed());
		
		WebElement deleteButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Delete Payer']"));
		deleteButton.click();
		
		WebElement deletePayer = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'Delete Payer?')]"));
		System.out.println("Delete Payer text is displayed, "+deletePayer.isDisplayed());
		
		WebElement yesButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Yes']"));
		yesButton.click();
		
		WebElement payerDeleted = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Payer has been deleted!']"));
		System.out.println("Are you sure Delete Payer text is displayed, "+payerDeleted.isDisplayed());
		
		WebElement oKButton1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Ok']"));
		oKButton1.click();
		
		try {
		WebElement forwardIconNickname1 = driver.findElement(By.xpath("(//android.view.View[contains(@content-desc,'"+payerNickname+"')])[1]/android.widget.Button"));
		System.out.println("Forward Nick name icon is displayed, "+forwardIconNickname1.isDisplayed());
		}
		catch (Exception e) {
			System.out.println("NickName is not displayed");
		}
		driver.quit();
	}

}
