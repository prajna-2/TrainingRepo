package practiceSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FetchapiResponse {
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();

        // Set Chrome options
        ChromeOptions options = new ChromeOptions();

        // Create WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Create DevTools instance
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Enable network events
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Set up a listener to intercept network responses
        devTools.addListener(Network.responseReceived(), responseReceived -> {
            System.out.println("Response URL: " + responseReceived.getResponse().getUrl());
            System.out.println("Response status: " + responseReceived.getResponse().getStatus());
        });

        // Navigate to the webpage
        driver.get("https://example.com");

        // Wait for some time to capture network responses
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
