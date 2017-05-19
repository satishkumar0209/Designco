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


}
