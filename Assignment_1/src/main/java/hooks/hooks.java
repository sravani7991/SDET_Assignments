package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

public static WebDriver driver;
	
	@Before
	public void webdriverinitialization()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\0004VQ744\\Desktop\\Automation-Training\\chromedriver_win32\\chromedriver.exe");
		 System.out.println("This will run before the Scenario");
		 driver = new ChromeDriver();
		
	}
	
	@After
	public void closingdriver()
	{
		//driver.quit();
	}
}
