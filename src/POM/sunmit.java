package POM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sunmit {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.studyfreak.com/medical_courses.php");
	    driver.manage().window().maximize();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//*[@class='panel-body'])")).getText();
	    System.out.println("hai");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	    List<WebElement> allElements = driver.findElements(By.xpath("(//*[@class='panel-body'])"));
	    System.out.println(allElements);

	    for (WebElement element: allElements) {
	        System.out.println(element.getText());
	        element.click();  
	    }
		
	    PrintStream printStream = new PrintStream(new FileOutputStream(new File("/home/aj/Desktop/text.xlsx")));
        System.setOut(printStream);
       
		
		
		
		
		
	}

}
