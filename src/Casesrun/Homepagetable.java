package Casesrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepagetable 
{
public static WebElement Tablerow(WebDriver driver)
{
	return driver.findElement(By.xpath("(//tbody[@class='ui-datatable-data ui-widget-content']/tr)"));
	      
	
}
public static WebElement arrowbutton(WebDriver driver)
{
	return driver.findElement(By.xpath("(//span[@class='fa fa-forward'])"));
	
}


public static WebElement Lastpagearrowbutton(WebDriver driver)
{
	return driver.findElement(By.xpath("(//span[@class='fa fa-step-forward'])"));
	
}
public static WebElement tablerowcount(WebDriver driver)
{
	return driver.findElement(By.xpath("(//span[@class='fa fa-step-forward'])"));
	
}

public static WebElement pending(WebDriver driver)
{
	return driver.findElement(By.xpath("//p-radiobutton[@name= 'groupname' and @value= 'Pending']"));
	
}

public static WebElement viewbutton(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='View']"));
	
}
public static WebElement Statusbutton(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='Status']"));
	
}
public static WebElement okbutton(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='Ok']"));
	
}
public static WebElement Reply(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='Reply']"));
	
}
public static WebElement reply(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='Reply']"));
	
}

public static WebElement okbutton1(WebDriver driver)
{
	return driver.findElement(By.cssSelector("body > app-root > app-navbar > div.wrapper > div > div.right-wrap.zeropad.ui-g-11.ui-lg-11.ui-md-11.ui-sm-8 > main > app-cases > app-pending-detail > div.replyDiv > p-dialog > div > div.ui-dialog-content.ui-widget-content > div:nth-child(2) > div > button:nth-child(1) > span"));
	
}
public static WebElement FromTime(WebDriver driver)
{
	return driver.findElement(By.xpath("(//*[@class='ui-inputtext ui-corner-all ui-state-default ui-widget'])"));
	
	
}
public static WebElement Totime(WebDriver driver)
{
	return driver.findElement(By.xpath("/html/body/app-root/app-navbar/div[2]/div/div[2]/main/app-cases/app-cases-list/div/div[2]/div[2]/div/div[2]/div/p-datatable/div/div[2]/table/thead/tr/th[3]/div/div[2]/span/p-inputmask"));
	
}
public static WebElement Totim(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='To]"));
	
}
public static WebElement CHECKBOX(WebDriver driver)
{
	return driver.findElement(By.xpath("//a[@href='#']"));
	
}
public static WebElement label(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[@label='PENDING CASES']"));
	
}

}
