package Loginrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import junit.framework.Assert;

public class Invaliduser {
private static WebDriver driver;
	
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Invalid user-",false);
		recorder.start();
		WebDriver driver=new ChromeDriver();
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		Login.username(driver).sendKeys("superadmi@gmail.com");
		System.out.println("Enter username successfully");
		
		Login.password(driver).sendKeys("password123");
		System.out.println("Enter password successfully");
		
		
		Login.loginbutton(driver).click();
		System.out.println("click login button successfully");
		
		Thread.sleep(3000);
		
		Assert.assertEquals("http://designco.sia.co.in/login", "http://designco.sia.co.in/login");
		
		recorder.stop();
		
		driver.quit();
		

}
}
