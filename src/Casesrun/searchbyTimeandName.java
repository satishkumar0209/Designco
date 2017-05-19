package Casesrun;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class searchbyTimeandName {
private static WebDriver driver;
ATUTestRecorder recorder;
	
	
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException, IOException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Search-",false);
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
		WebElement LangSection=Cases.wholeDiv(driver);
		List<WebElement> lang=LangSection.findElements(By.tagName("a"));

		for(int i=0; i< lang.size(); i++)

		{

		System.out.println(lang.get(i).getText());

		}
		
		
		Homepagetable.FromTime(driver).sendKeys("1105");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-cases/app-cases-list/div/div[2]/div[2]/div/div[2]/div/p-datatable/div/div[2]/table/thead/tr/th[3]/div/div[2]/span/p-inputmask")).sendKeys("1105");
		//Homepagetable.FromTime(driver).sendKeys(Keys.TAB);
		//Homepagetable.Totime(driver).sendKeys("1105");
		
		Homepagetable.Totim(driver).sendKeys("1105");
		
}

	}