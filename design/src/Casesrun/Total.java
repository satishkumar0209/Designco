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
		
		List<WebElement>rows=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page1="+rows.size());
		
		List<WebElement>cols=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols.size());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		
									
		
		
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows1=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page2="+rows1.size());
		
		List<WebElement>cols1=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols1.size());
		
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows2=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page 3="+rows2.size());
		
		List<WebElement>cols2=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols2.size());
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows3=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page 4="+rows3.size());
		
		List<WebElement>cols3=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols3.size());
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows4=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page 5="+rows4.size());
		
		List<WebElement>cols4=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols4.size());
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows5=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page 6="+rows5.size());
		
		List<WebElement>cols5=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols5.size());
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows6=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page 7="+rows6.size());
		
		List<WebElement>cols6=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols6.size());
		Homepagetable.arrowbutton(driver).click();
		List<WebElement>rows7=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
		System.out.println("Total no of rows page 8="+rows7.size());
		
		List<WebElement>cols7=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
		System.out.println("Total no of columns="+cols7.size());
		
		
		
		Thread.sleep(6000);
		recorder.stop();
		}
	

}



