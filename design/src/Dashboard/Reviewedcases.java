package Dashboard;

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
import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Reviewedcases 
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
		System.out.println(" login  successfully");
		Thread.sleep(3000);
		System.out.println("Reviewed cases = "+driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[3]/div/div[2]/h1")).getText());
		pageelement.Reviewedcases(driver).click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		Homepagetable.Lastpagearrowbutton(driver).click();
		Cases.reviewedcases(driver).click();
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                    
		FileUtils.copyFile(scrFile, new File("/home/aj/screenshot/Reviewed cases last page.png"));
		System.out.println("check the screen shot for Reviewed cases ");
			Homepage.Logoutbutton(driver).click();
			driver.quit();
		
	}
}
