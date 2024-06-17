package demo;

import java.awt.Desktop.Action;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class captchawriting {

	public static void main(String[] args) throws IOException, InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
//		String dateTimeString = now.format(formatter);
//		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		// create file path with local date and time
////		String filePath = "D://Screenshot/" + dateTimeString + ".png";
////		File outputScreenshot = new File(filePath);
//	 
//		
//		driver.manage().window().maximize();
//		driver.get("https://www.careinsurance.com/rhicl/claim/login");
//		
//		WebDriverWait explicitWait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		
//		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='navbar-logo']"))));
//		
//		WebElement captchaImage = driver.findElement(By.xpath("//div[@id=\"to-append-captcha-img\"]//img[@alt=\"captcha\"]"));
//		TakesScreenshot tScreenshot=(TakesScreenshot)driver;
//		
//		File tempScreenshot = tScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		File permScreenshot = new File("C:/Users/User/Documents/screenshots/" + dateTimeString + ".png");
//		
//		FileUtils.copyFile(tempScreenshot, permScreenshot);
//		
//		driver.get("https://www.cardscanner.co/image-to-text");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;		
//		
//		driver.findElement(By.id("image_upload")).sendKeys("C:/Users/User/Documents/screenshots/" + dateTimeString + ".png");
//		
//		 
//		WebElement convert = driver.findElement(By.xpath("//span[text()='Convert']"));
//		Thread.sleep(5000);
//		jsExecutor.executeScript("arguments[0].click();", convert);
//		Thread.sleep(15000);
//		
//		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Copy']/following-sibling::img[@alt='image']"))));
//		WebElement copyButton = driver.findElement(By.xpath("//span[text()='Copy']/following-sibling::img[@alt='image']"));
//		Actions action=new Actions(driver);
//		Thread.sleep(5000);
//		
//		action.moveToElement(copyButton).perform();
//		Thread.sleep(2000);
//		copyButton.click();
//	
//		
//		try {
//            // Get the system clipboard
//            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//
//            // Get the clipboard's content
//            Transferable transferable = clipboard.getContents(null);
//
//            // Check if the content is text
//            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
//                // Extract and print the text
//                //String text = (String) transferable.getTransferData(DataFlavor.stringFlavor);
//            	String text="care HEALTH\r\n"
//            			+ "INSURANCE\r\n"
//            			+ "Health Insurance ✓ Travel Insurance ✓\r\n"
//            			+ "Corporate Insurance ✓ Renew\r\n"
//            			+ "Already A Customer Contact Us\r\n"
//            			+ "Login\r\n"
//            			+ "INTIMATE YOUR CLAIM\r\n"
//            			+ "HASSLE FREE CLAIM PROCESSING\r\n"
//            			+ "WITH\r\n"
//            			+ "AT YOUR FINGERTIPS!\r\n"
//            			+ "Claim Genie\r\n"
//            			+ "• UPLOAD DOCUMENTS\r\n"
//            			+ "• TRACK STATUS OF YOUR CLAIM\r\n"
//            			+ "BE\r\n"
//            			+ "Claim Journey\r\n"
//            			+ "Please Enter Your Policy Details Start your claim journey by filling following details\r\n"
//            			+ "A\r\n"
//            			+ "Claim Intimation\r\n"
//            			+ "My policy number*\r\n"
//            			+ "Initiate your claim with few details\r\n"
//            			+ "Verify the captcha\r\n"
//            			+ "oUZy3x\r\n"
//            			+ "Fill E-Claim Form\r\n"
//            			+ "Fill your E-Claim with few details instantly\r\n"
//            			+ "Upload Documents\r\n"
//            			+ "Next\r\n"
//            			+ "Upload all documents in seconds\r\n"
//            			+ "同\r\n"
//            			+ "Claim Tracking\r\n"
//            			+ "Chat with Us\r\n"
//            			+ "";
//               int index = text.indexOf("captcha", 0);
//               System.out.println(index);
//                System.out.println("Text from clipboard: " + text);
//            } else {
//                System.out.println("Clipboard does not contain text data");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		
		String text="care HEALTH\r\n"
    			+ "INSURANCE\r\n"
    			+ "Health Insurance ✓ Travel Insurance ✓\r\n"
    			+ "Corporate Insurance ✓ Renew\r\n"
    			+ "Already A Customer Contact Us\r\n"
    			+ "Login\r\n"
    			+ "INTIMATE YOUR CLAIM\r\n"
    			+ "HASSLE FREE CLAIM PROCESSING\r\n"
    			+ "WITH\r\n"
    			+ "AT YOUR FINGERTIPS!\r\n"
    			+ "Claim Genie\r\n"
    			+ "• UPLOAD DOCUMENTS\r\n"
    			+ "• TRACK STATUS OF YOUR CLAIM\r\n"
    			+ "BE\r\n"
    			+ "Claim Journey\r\n"
    			+ "Please Enter Your Policy Details Start your claim journey by filling following details\r\n"
    			+ "A\r\n"
    			+ "Claim Intimation\r\n"
    			+ "My policy number*\r\n"
    			+ "Initiate your claim with few details\r\n"
    			+ "Verify the captcha\r\n"
    			+ "oUZy3x\r\n"
    			+ "Fill E-Claim Form\r\n"
    			+ "Fill your E-Claim with few details instantly\r\n"
    			+ "Upload Documents\r\n"
    			+ "Next\r\n"
    			+ "Upload all documents in seconds\r\n"
    			+ "同\r\n"
    			+ "Claim Tracking\r\n"
    			+ "Chat with Us\r\n"
    			+ "";
       int index = text.indexOf("captcha", 0);
       System.out.println(index);
        System.out.println("Text from clipboard: " + text);
		
		
		
		
		
	}

}
