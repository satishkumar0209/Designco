package pendingcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		long start=System.currentTimeMillis();
		
		driver.get("http://designco.sia.co.in/");
		driver.manage().window().maximize();
		
		
		long finish=System.currentTimeMillis();
		
		long totaltime=finish-start;
		
		System.out.println("page load time :"+totaltime);
		
	}

}
