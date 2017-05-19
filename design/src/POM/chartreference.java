package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chartreference 
{

	 public static WebDriver driver;

	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
			WebDriver driver=new ChromeDriver();
	 
	 driver.get("http://yuilibrary.com/yui/docs/charts/charts-pie.html");

	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	 //FIND DIFFERENT SECTIONS IN PIE CHART**
Thread.sleep(5000);
	 WebElement ViolettePart = driver.findElement(By.xpath("//*[contains(@id,'yui_3_13_0_1_')][contains(@class,'yui3-svgSvgPieSlice')][@fill='#66007f']"));
	 WebElement GreenPart = driver.findElement(By.xpath("//*[contains(@id,'yui_3_13_0_1_')][contains(@class,'yui3-svgSvgPieSlice')][@fill='#295454']"));
	 WebElement GreyPart = driver.findElement(By.xpath("//*[contains(@id,'yui_3_13_0_1_')][contains(@class,'yui3-svgSvgPieSlice')][@fill='#e8cdb7']"));
	 WebElement LightViolettePart = driver.findElement(By.xpath("//*[contains(@id,'yui_3_13_0_1_')][contains(@class,'yui3-svgSvgPieSlice')][@fill='#996ab2']"));
	 WebElement BrownPart = driver.findElement(By.xpath("//*[contains(@id,'yui_3_13_0_1_')][contains(@class,'yui3-svgSvgPieSlice')][@fill='#a86f41']"));

	

	 WebElement ToolTip = driver.findElement(By.xpath("//div[contains(@id,'_tooltip')]"));

	 //CLICK EACH SECTION OF PIE CHART AND GET THE TEXT OVER IT**

	 ViolettePart.click();
	 System.out.println("Violette Part:"+ToolTip.getText());
	 GreyPart.click();
	 System.out.println("Grey Part:"+ToolTip.getText());
	 LightViolettePart.click();
	 System.out.println("Light Violete Part:"+ToolTip.getText());
	 GreenPart.click();
	 System.out.println("Green Part:"+ToolTip.getText());
	 BrownPart.click();
	 System.out.println("Brown Part:"+ToolTip.getText());
	 } }
