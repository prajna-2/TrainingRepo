package practiceSection;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//
//public class ToMoveFileToLocalDevice {
//
//    public static void main(String[] args) throws IOException {
//        // Set the desired capabilities for the Android device
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
//        // Add other desired capabilities as needed
//
//        // Initialize the Android driver
//        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//
//        // Define the path of the file to be transferred
//        String localFilePath = "C:\\Users\\User\\AppData\\Local\\Temp\\Screenshot1267888888.png"; // Update with your local file path
//
//        // Define the destination directory on the Android device
//        String destinationDirectory = "/storage/DCIM"; // Destination directory on the device
//
//        // Transfer the file to the Android device
//        File localFile = new File(localFilePath);
//        driver.pushFile(destinationDirectory, localFile);
//
//        // Close the driver
//        driver.quit();
//    }
//}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToMoveFileToLocalDevice {

    public static void main(String[] args) {
        // Source file path
        String sourceFilePath = "C:\\Users\\User\\Downloads\\screenshot (6).jpg";
        
        // Destination directory on Android device
        String androidDestinationDir = "/storage/emulated/0/Downloads/";
        
         //String androidDestinationDir = "/storage/emulated/0/Recent";

        try {
            // Move file to Android device
            moveFileToAndroid(sourceFilePath, androidDestinationDir);
            System.out.println("File moved successfully to Android device.");
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void moveFileToAndroid(String sourceFilePath, String androidDestinationDir) throws IOException, InterruptedException {
        // Get source file path
        Path source = Paths.get(sourceFilePath);
        
        // Destination file path on Android
        String destinationFilePath = androidDestinationDir + source.getFileName();

        // Execute adb command to push file to Android device
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("adb", "push", sourceFilePath, destinationFilePath);
        Process process = processBuilder.start();
        
        // Wait for the process to finish
        int exitCode = process.waitFor();
        
        // Check if the process was successful
        if (exitCode != 0) {
            throw new IOException("Failed to move file to Android device. Exit code: " + exitCode);
        }
    }
}






























