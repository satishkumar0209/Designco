package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class dropdown 
{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
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
		System.out.println("click login button successfully");
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("//a[@href='/citizen']")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		System.out.println("check box clicking successfully");
		
		
		/*driver.get("http://designco.sia.co.in/citizen");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[placeholder='Email']")).click();
		driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("am");
		//driver.findElement(By.xpath("//a[@href='#']")).click();
		
		
		
		driver.findElement(By.cssSelector("div.ui-chkbox-box.ui-widget.ui-corner-all.ui-state-default")).click();
		
		driver.findElement(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='View']")).click();
		*/
		
		/*
		Thread.sleep(3000);
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Last 7 Days']")).click();
		
			
		
		//driver.findElement(By.xpath("//*[text()='View by']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[text()='View by']")).click(); 
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[text()='']")).click();
		
		driver.findElement(By.xpath("//*[text()='Last 30 Days']")).click();
		
		
		
		
		
		//driver.findElement(By.xpath("//*[text()='Last 7 Days']")).click();	                 
				*/
}
}
