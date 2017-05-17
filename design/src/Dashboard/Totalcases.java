package Dashboard;

import static org.testng.Assert.assertEquals;

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

import Casesrun.Homepagetable;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import junit.framework.Assert;

public class Totalcases 

{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException, IOException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Pending casses Energy-",false);
		recorder.start();
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		Login.username(driver).sendKeys("superadmin@gmail.com");
		System.out.println("Enter username successfully");
		
		Login.password(driver).sendKeys("password123");
		System.out.println("Enter password successfully");
		
		
		Login.loginbutton(driver).click();
		System.out.println("click login  successfully");
		
		Thread.sleep(9000);
		
		
		
		System.out.println("Total cases=  "+driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[2]/div/div[2]")).getText());
		//System.out.println("Total cases = "+driver.findElement(By.xpath("//*[@class='ui-g-7 ui-lg-7 ui-md-7'])[2]")).getText());
		
		pageelement.Totalcaseslink(driver).click();
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		System.out.println("Total cases url="+url);
	
		Assert.assertEquals("http://designco.sia.co.in/cases?case=all",url);
		
		Thread.sleep(3000);
		
	
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		Homepagetable.Lastpagearrowbutton(driver).click();
		
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                    
		FileUtils.copyFile(scrFile, new File("/home/aj/screenshot/Total cases last page.png"));
		
		System.out.println("check the screen shot for Total cases ");
		
		Homepage.Logoutbutton(driver).click();
		
		
		driver.quit();
		
									
		
		
}
}
