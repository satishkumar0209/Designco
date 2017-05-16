package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
public static WebElement element;
	
	public static WebElement Logoutbutton(WebDriver driver)

	{
		return driver.findElement(By.cssSelector("#logout"));
		
		
	}
	public static WebElement cases(WebDriver driver)

	{
		return driver.findElement(By.xpath("//*[text()='Cases']"));
		
		
	}

	
	


}
