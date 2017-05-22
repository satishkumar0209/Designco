package POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class main {

		
		public static void main(String[] args) throws InterruptedException {
			//public static WebDriver driver;
			
			
			WebDriver driver = null;
			
			email page=new email(driver);
			
			page.usermain("");
			
			page.validuser("");
			
			driver.navigate().refresh();
			
			page.invaliduser("");


}
	}
