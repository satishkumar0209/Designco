package Casesrun;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Gettingthestatus 
{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Details page-",false);
		recorder.start();
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		Login.username(driver).sendKeys("superadmin@gmail.com");
		System.out.println("Enter username successfully");
		
		Login.password(driver).sendKeys("password123");
		System.out.println("Enter password successfully");
		
		
		Login.loginbutton(driver).click();
		System.out.println("click login button successfully");
		Thread.sleep(6000);
		
		driver.get("http://designco.sia.co.in/cases");
		Thread.sleep(6000);
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		
		
		driver.findElement(By.xpath("//*[text()='View']")).click();
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			System.out.println("Total no of cases check through url:="+url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Status']")).click();
	                           
		WebElement pendingradiobutton=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default ui-state-active'])"));
		WebElement Reviewedradiobutton=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])"));
		if(pendingradiobutton.isSelected())
		{
			System.out.println("status=pending");
			
		}
		else
		{
			System.out.println("Status=Reviewed");
			driver.findElement(By.xpath("//*[text()='Ok']")).click();
			//driver.manage().timeouts().implicitlyWait(120000, TimeUnit.SECONDS);
			Thread.sleep(7000);
			driver.findElement(By.xpath("//*[text()='Reply']")).click();
			driver.findElement(By.cssSelector("[placeholder='Reply']")).sendKeys("Case successfully reviewed");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-cases/app-complete-detail/div[4]/p-dialog/div/div[2]/div[2]/div/button[1]/span")).click();
			
		}
		
		
		
		recorder.stop();
		
		//driver.quit();
		
		
		
		
	}
}
