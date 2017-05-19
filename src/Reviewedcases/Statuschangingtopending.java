package Reviewedcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Casesrun.Homepagetable;
import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Statuschangingtopending 
{
	ATUTestRecorder recorder;

	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Changinh status to pending-",false);
		recorder.start();
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		Login.username(driver).sendKeys("superadmin@gmail.com");
		System.out.println("Enter username successfully");
		
		Login.password(driver).sendKeys("password123");
		System.out.println("Enter password successfully");
		
		
		Login.loginbutton(driver).click();
		System.out.println("click login button successfully");
		
		Thread.sleep(9000);
		Homepage.cases(driver).click();
		System.out.println("successfully clicked cases button");
		
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println("Getting current url------"+url);
		Thread.sleep(3000);
		
		
		Cases.reviewedcases(driver).click();
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url is:"+currenturl);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		Homepagetable.viewbutton(driver).click();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		Homepagetable.Statusbutton(driver).click();
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		WebElement pendingradiobutton=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default ui-state-active'])"));
		WebElement Reviewedradiobutton=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])"));
		
		if(Reviewedradiobutton.isSelected())
		{
			System.out.println("status=Reviewed");
			
		}
		else
		{
			System.out.println("Status=Pending");
			Homepagetable.pending(driver).click();
			Homepagetable.okbutton(driver).click();
			System.out.println("Changing status successfully");
		}
		
		
		recorder.stop();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
