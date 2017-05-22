package Loginrun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import junit.framework.Assert;

public class Invaliduser {
private static WebDriver driver;
ATUTestRecorder recorder;
	@Test
	@Parameters("browser")
	public void setup(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette", "/home/aj/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
			WebDriver driver=new ChromeDriver();
		}
		
		else
		{
			
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
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
