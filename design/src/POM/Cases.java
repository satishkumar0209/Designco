package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cases {
	public static WebElement element;
	
	
	public static WebElement pendingcases(WebDriver driver)

	{
		return driver.findElement(By.xpath("//*[@label='PENDING CASES']"));
		
		
	}
	public static WebElement reviewedcases(WebDriver driver)

	{
		return driver.findElement(By.xpath("//*[@label='REVIEWED CASES']"));
		
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
	
public static WebElement Fromdate(WebDriver driver)
{
	return driver.findElement(By.xpath("//span[contains(@class,'ui-calendar ui-calendar-w-btn')]"));
}
	
public static WebElement Todate(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='To']"));
}
	
	

}
