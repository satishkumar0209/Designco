package Casesrun;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Totalcasecount 
{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException, IOException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Totalcasecount-",false);
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
		
		Homepagetable.Lastpagearrowbutton(driver).click();
		
		WebElement LangSection=driver.findElement(By.xpath("(//span[@class='ui-paginator-pages'])"));
		List<WebElement> arrowdiv=LangSection.findElements(By.tagName("href=#"));

		for(int i=0; i< arrowdiv.size(); i++)

		{

		System.out.println(arrowdiv.get(i).getText());

		}
		File snapshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snapshot, new File("D:\\screenshot.png"));
		
		System.out.println("check the image in screen shot");
		recorder.stop();
		
		driver.quit();
		
		
		
		
		
		
		

	}
}