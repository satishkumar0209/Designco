package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public static WebElement element;
	
	public static WebElement username(WebDriver driver)

	{
		return driver.findElement(By.cssSelector("[placeholder='Username']"));
		
		
	}
	public static WebElement password(WebDriver driver)

	{
		return driver.findElement(By.cssSelector("[placeholder='Password']"));
		
		
	}
	public static WebElement loginbutton(WebDriver driver)

	{
		return driver.findElement(By.xpath(".//*[@type= 'submit']"));
		
		
	}
	
}
