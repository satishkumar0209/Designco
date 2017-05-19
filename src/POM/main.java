package POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class main {

		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver");
			WebDriver driver=new ChromeDriver();	
			driver.get("http://designco.sia.co.in/");
			driver.manage().window().maximize();
			
			email page=new email(driver);
		
			
			page.validuser("");
			
			driver.navigate().refresh();
			
			page.invaliduser("");


}
	}
