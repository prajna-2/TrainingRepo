package practiceSection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScanQrCode {

    public static void main(String[] args) throws InterruptedException {
    	String propPath = System.getProperty("user.home");
	System.out.println(propPath);
	}

//    private static void scanQRCodeOnWeb(WebDriver driver) throws InterruptedException {
//        // Navigate to the web page containing the QR code scanner
//        driver.get("https://scanqr.org/qr-code-generator/");
//        Thread.sleep(20000);
//
//        // Find the QR code scanner element
//        WebElement qrCodeScanner = driver.findElement(By.xpath("//div[@class=\"resultholder\"]"));
//
//        // Simulate scanning the QR code
//        qrCodeScanner.click();
//
//        // You may need to handle the process of scanning and its result here
//    }
//
//    private static void scanQRCodeOnMobile(WebDriver driver) {
//        // Enable network connection
//        NetworkConnection networkConnection = ((NetworkConnection) driver);
//        networkConnection.setNetworkConnection(networkConnection.getNetworkConnection().ALL);
//
//        // Navigate to the mobile application containing the QR code scanner
//        driver.get("https://scanqr.org/qr-code-generator/");
//
//        // Find the QR code scanner element
//        WebElement qrCodeScanner = driver.findElement(By.xpath("//div[@class=\"resultholder\"]"));
//
//        // Simulate scanning the QR code
//        qrCodeScanner.click();
//
//        // You may need to handle the process of scanning and its result here
//    }
}
