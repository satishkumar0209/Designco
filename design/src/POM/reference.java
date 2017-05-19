package POM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reference {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://designco.sia.co.in/login");
	
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("superadmin@gmail.com");
			driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("password123");
		driver.findElement(By.xpath(".//*[@type= 'submit']")).click();
		
		Thread.sleep(5000);
		
		
		driver.get("http://designco.sia.co.in/cases/complete-detail/97");
		Thread.sleep(5000);
		
		
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
	
	
	
