package Loginrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class valid {
private static WebDriver driver;
	
ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","valid user-",false);
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
		
		String url=driver.getCurrentUrl();
		System.out.println("browser current url :"+url);
		
		String pagetitle=driver.getTitle();
		System.out.println("Current page title:"+pagetitle);
		
		Homepage.Logoutbutton(driver).click();
		System.out.println("Logout successfully");
		
		String url1=driver.getCurrentUrl();
		System.out.println("After logout browser current url :"+url1);
		
		String pagetitle1=driver.getTitle();
		System.out.println("After logout Current page title:"+pagetitle1);
	
		driver.quit();
		
			recorder.stop();

	}
}
