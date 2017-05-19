package pendingcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Cases;
import POM.Homepage;
import POM.Login;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Radiobutton
{
	ATUTestRecorder recorder;
	@Test
	public void user() throws InterruptedException, ATUTestRecorderException
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		recorder = new ATUTestRecorder("/home/aj/Documents/Selenium recording videos","Pending Quality products-",false);
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
driver.get("http://designco.sia.co.in/cases/pending-detail/85");
Thread.sleep(2000);
//driver.findElement(By.xpath("//*[text()='Status']")).click();
Thread.sleep(2000);
List<WebElement> buttons = driver.findElements(By.xpath("submit"));
int buttonCount=1;
for(WebElement a : buttons){        
    if(a.getText().equals("buttonName")){
          buttonCount++;
}   
    System.out.println(buttonCount);
}
	WebElement eleemnt=driver.findElement(By.xpath("//*[@class='ui-radiobutton-box ui-widget ui-state-default']"));
	eleemnt.getAttribute("radiobutton");
	eleemnt.click();
	driver.findElement(By.xpath("//*[@label='Ok']")).click();
	//driver.findElement(By.xpath("//*[@class='ui-radiobutton-box ui-widget ui-state-default']")).getAttribute("checked");




	}
}
