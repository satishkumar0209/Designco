package Loginrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class PageloadTime {


	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Page Load time-",false);
		recorder.start();
		
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		long start=System.currentTimeMillis();
		
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		
		long finish=System.currentTimeMillis();
		
		long totaltime=finish-start;
		
		System.out.println("page load time :"+totaltime);
		
		driver.quit();
		recorder.stop();
		
	}

}
