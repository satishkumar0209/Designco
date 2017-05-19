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
		
		
		Homepagetable.viewbutton(driver).click();
		
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			System.out.println("Total no of cases check through url:="+url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Homepagetable.Statusbutton(driver).click();
		
		
	                           
		WebElement pendingradiobutton=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default ui-state-active'])"));
		WebElement Reviewedradiobutton=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])"));
		
		
		
		
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])")).click();
		Homepagetable.okbutton(driver).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()= 'Reply']")).click();
		Thread.sleep(3000);
		Homepagetable.reply(driver).sendKeys("hello");
		Thread.sleep(6000);
		
		driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-cases > app-pending-detail > div.replyDiv > p-dialog > div > div.ui-dialog-content.ui-widget-content > div:nth-child(2) > div > button:nth-child(1) > span")).click();
		driver.findElement(By.xpath("(//div[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only'])")).click();
		Thread.sleep(3000);
System.out.println("yes");
		

		
		
		recorder.stop();
		
		//driver.quit();its
		
		
		
		
	}
}
