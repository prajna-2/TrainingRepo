package demo;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the project name");
		String prjectName=sc.next();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		
		driver.findElement(By.name("emailId")).sendKeys("prajnaanandamoolya@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Moolya@28");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		

		
		WebElement project = driver.findElement(By.xpath("//tr[contains(@class,'project-row border')]//span[text()='"+prjectName+"']"));
		//js.executeScript("arguments[0].click();", project);
		wait.until(ExpectedConditions.visibilityOf(project));
		project.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//label[contains(@class,'project_label text')]")).getText());		
		driver.findElement(By.xpath("//li[contains(@class,' side_navigation_style_side')]//span[contains(text(),'Test Data')]")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//label[contains(@class,'project_label text')]")).getText());
		driver.findElement(By.xpath("//button[@title='Expand All Folders']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,' fancytree-title-wrapper')]//span[contains(text(),'Caratlane')]")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\User\\Downloads\\Caratlane_Android.xlsx");
		Thread.sleep(5000);
		WebElement successfullMsg = driver.findElement(By.xpath("//div[contains(@class,'message') and contains(text(),'replaced successfully')]"));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@class,'message') and contains(text(),'replaced successfully')]"))));
//		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'message') and contains(text(),'replaced successfully')]")).getText());
		wait.until(ExpectedConditions.visibilityOf(successfullMsg));
		System.out.println(successfullMsg.getText());
		driver.quit();
		
	}

}
