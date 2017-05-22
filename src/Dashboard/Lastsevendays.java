package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Lastsevendays 
{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Comparingcases -",false);
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
		
		
		pageelement.All(driver).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@class='ui-dropdown-item ui-corner-all'][3])")).click();
		Thread.sleep(5000);
		
		WebElement one=driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[2]/div/div[2]"));
		one.getText();
		String st1=one.getText();
				
		System.out.println("Total cases ="+st1);
		
		WebElement two=driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[3]/div/div[2]"));
		two.getText();
		String st2=two.getText();
		
		
		System.out.println("Reviewed cases ="+st2);
		WebElement three=driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[4]/div/div[2]"));
		three.getText();
		String st3=three.getText();
		System.out.println("Pending cases ="+st3);
		
		
		int value1=Integer.parseInt(st1);
		
		int value2=Integer.parseInt(st2);
		
		int value3=Integer.parseInt(st3);
		
		int total=value2+value3;
		
		if(total == value1)
		{
		System.out.println("Toal cases is Equals to reviewed cases plus pending cases");	
		}
		else
		{
			System.out.println("Toal cases is Not Equals to reviewed cases plus pending cases");
		}
			
			
		
		 	driver.quit();
		 	recorder.stop();
		
	}
}
