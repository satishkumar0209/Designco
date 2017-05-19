package Loginrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Maximumlength 
{
	ATUTestRecorder recorder; 
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		
	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","maximumlength-",false);
	recorder.start();
	driver.get("http://designco.sia.co.in/");
	driver.manage().window().maximize();
	
	String emailmaxlength=Login.username(driver).getAttribute("maxlength");
	System.out.println("username maximum length is:"+emailmaxlength);
	
	String passwordmaxlength=Login.password(driver).getAttribute("maxlength");
	System.out.println("password maxlength is :"+passwordmaxlength);
	
	driver.quit();
}
}
