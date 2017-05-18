package Casesrun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Total {
ATUTestRecorder recorder;
	
	
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException, IOException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Total cases-",false);
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
		
		int count= 0;
		List<WebElement>rows=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page1="+rows.size());	
		List<WebElement>cols=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols.size());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		int input=0;
		int required=0;
		boolean start= true;
		do
		{	
			Homepagetable.arrowbutton(driver).click();
			List<WebElement>rows8=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
			System.out.println("Total no of Rows="+rows8.size());
			input= rows8.size();
			
			if (start)
			{
				required= rows8.size();
				start= false;
				//System.out.println("inside first time");
			}
				
			List<WebElement>cols8=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
			System.out.println("Total no of columns="+cols8.size());
			
			//System.out.println("page-->"+(input)+required);
			count += input;
		}
		while(input>=required);
		System.out.println("Total Cases are-->"+count);
		
		
		Thread.sleep(6000);
		recorder.stop();
		}
	

}



