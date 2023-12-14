package learnMaven;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenshotInExternalReport {
	@Test
	public void addScreenshot() {
//		ExtentSparkReporter spark=new ExtentSparkReporter("./HTMLreport/extentReport.html");
//		ExtentReports reports=new ExtentReports();
//		reports.attachReporter(spark);
//		ExtentTest test = reports.createTest("addScreenshot");
//		test.log(Status.INFO, "added log statement inside the report");
//		reports.flush();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot tS=(TakesScreenshot)driver;
		String errorScreenshot = tS.getScreenshotAs(OutputType.BASE64);
		
		LocalDateTime sysTime = LocalDateTime.now();
		String time = sysTime.toString().replaceAll(":", "-");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./Htmlreport/"+time+".html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(sparkReporter);
		
		ExtentTest test=reports.createTest("addScreenshot");
		test.log(Status.PASS, "successfully captured the webpage");
		test.addScreenCaptureFromBase64String(errorScreenshot);
		reports.flush();
		
	}

}
