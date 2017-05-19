package Loginrun;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class cases {
private static WebDriver driver;
	
ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Gettting names in a division-",false);
		recorder.start();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		Login.username(driver).sendKeys("superadmin@gmail.com");
		System.out.println("Enter username successfully");
		
		Login.password(driver).sendKeys("password123");
		System.out.println("Enter password successfully");
		
		
		Login.loginbutton(driver).click();
		System.out.println("click login button successfully");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Homepage.cases(driver).click();
		System.out.println("successfully clicked cases button");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String url=driver.getCurrentUrl();
		System.out.println("Getting current url------"+url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement LangSection=Cases.wholeDiv(driver);
		List<WebElement> lang=LangSection.findElements(By.tagName("a"));

		for(int i=0; i< lang.size(); i++)

		{

		System.out.println(lang.get(i).getText());

		}
		
driver.quit();
recorder.stop();

		}
	

	
	
		
}
