package POM;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class reference {
public static WebDriver driver;
	
		@BeforeTest
		@Parameters("browser")
		public void setup(String browser){
			if(browser.equals("")){
				driver=new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
				WebDriver driver=new ChromeDriver();
			}
			
		}
		@Test
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 2);  
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver");
		 driver=new ChromeDriver();	
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("superadmin@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("password123");
		driver.findElement(By.xpath(".//*[@type= 'submit']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//*[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='ui-dropdown-item ui-corner-all'])")).click();

		
		driver.findElement(By.xpath("//*[text()='Last 30 Days']")).click();
		//driver.findElement(By.xpath("//*[@text()='Last 30 Days']")).click();
		
		driver.get("http://designco.sia.co.in/cases");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='ui-inputtext ui-corner-all ui-state-default ui-widget'])")).sendKeys("1105");
		
		System.out.println("cases="+driver.findElement(By.xpath("(//*[@class='ui-g'])")).getText());
		System.out.println("cases="+driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-cases/app-complete-detail/div[2]/div[2]/div/div/div[3]/div")).getText());
		//WebElement checkbox=driver.findElement(By.xpath("//*[@class='ui-radiobutton-box ui-widget ui-state-default']"));
		//driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[1]")).getAttribute("Total Citizens");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-cases/app-complete-detail/div[2]/div[2]/div/div/div[3]/div")).click();
		
		
		//driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-dashboard/div[2]/div[1]/div/div[2]/h1")).getText();
	
		//driver.findElement(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)["+r+"]/td["+c+"]/span"));
		
		
		//driver.findElement(By.cssSelector(""));
		WebElement LangSection=driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-dashboard > div.content-section.ui-g-12"));
		List<WebElement> lang=LangSection.findElements(By.tagName("a"));

		for(int i=0; i< lang.size(); i++)

		{

		System.out.println(lang.get(i).getText());

		
		
		
		driver.findElement(By.xpath("")).click();
		WebElement element=driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-dashboard > div.content-section.ui-g-12 > div:nth-child(2) > div > div.ui-g-7.ui-lg-7.ui-md-7"));
		element.getText();
		System.out.println(element);
		
		Thread.sleep(5000);
	driver.get("http://designco.sia.co.in/cases");
	
	driver.get("http://designco.sia.co.in/cases/pending-detail/86");
	driver.findElement(By.xpath("//*[text()='Status']")).click();


try
 
	{
 
	WebElement checkbox=driver.findElement(By.xpath("//*[@class='ui-radiobutton-box ui-widget ui-state-default']"));
			
	checkbox.click();
			if(checkbox.isDisplayed())
			{
				System.out.println("click button suuccesfully");
				
			}
			
 
	}
catch(Exception e)
{
 
	
	}
	
	
	
	
	
	
	
	
	driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-cases/app-cases-list/div/div[2]/div[2]/div"));
	driver.findElement(By.tagName("a"));

	List<WebElement> alllinkspresent=driver.findElements(By.tagName("a"));

	
System.out.println("no of links `:" +alllinkspresent.size());

	for(int i1=0; i1< alllinkspresent.size(); i++)

	{

	System.out.println(alllinkspresent.get(i1).getText());

	}
	driver.findElement(By.xpath("//*[@title='Choose']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("*//input[@role='textbox']")).sendKeys("Environment Impact");
	driver.findElement(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	driver.findElement(By.xpath("//a[@href='#']")).click();
	
	List<WebElement>rows=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
	System.out.println("Total no of rows="+rows.size());
	
	List<WebElement>cols=driver.findElements(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr[1]/td)"));
	System.out.println("Total no of columns="+cols.size());
	
	for (int r=1;r<=rows.size();r++)
	{
		for(int c=1;c<=cols.size();c++)

	{
	try
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)["+r+"]/td["+c+"]/span"));
	System.out.println(driver.findElement(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)["+r+"]/td["+c+"]/span")).getText()+"");
	}
	catch(Exception e)
	{
		
	}
		Thread.sleep(3000);
		System.out.println("\n");
	}
	}
		}
	}
}
	
	
	
