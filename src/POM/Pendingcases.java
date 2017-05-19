package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pendingcases
{
public static WebElement element;
	
	
	public static WebElement pendingcases(WebDriver driver)

	{
		return driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-cases > app-cases-list > div > div.ui-g-12.card-div > div.ui-g.tabbtndiv > div > button:nth-child(2) > span"));
		
		
	}
	public static WebElement reviewedcases(WebDriver driver)

	{
		return driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-cases > app-cases-list > div > div.ui-g-12.card-div > div.ui-g.tabbtndiv > div > button:nth-child(3) > span"));
		
		
	}
	
	public static WebElement wholeDiv(WebDriver driver)

	{
		return driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[1]/div"));
	}
	
	
	public static WebElement Choosesearchoption(WebDriver driver)

	{
		return driver.findElement(By.xpath("//*[@title='Choose']"));
	}
	
	public static WebElement Searchinputfield(WebDriver driver)

	{
		return driver.findElement(By.xpath("*//input[@role='textbox']"));
	}
	
	public static WebElement ENERGYUSECHECKBOX(WebDriver driver)
	{		
		return driver.findElement(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
	}


}
