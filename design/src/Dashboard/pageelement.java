package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageelement 
{
public static WebElement element;



public static WebElement Totalcaseslink(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='Total Cases']"));
}


public static WebElement Pendingcases(WebDriver driver)
{
	return driver.findElement(By.xpath("//*[text()='Pending Cases']"));
}
public static WebElement searchbyname(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='Search']"));
}
}
