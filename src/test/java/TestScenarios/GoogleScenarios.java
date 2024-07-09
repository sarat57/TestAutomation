package TestScenarios;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;
import Objects.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleScenarios extends TestBase {
	WebDriver driver;
	
	
	  @BeforeTest public void StartBrowser()
	  
	  { 
		  WebDriverManager.safaridriver().setup();
			//.chromedriver().setup();
			driver= new SafariDriver();
	  driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	  driver.get("https://www.amazon.com"); }
	  
	  @AfterTest public void EndBrowser() {
	  
	  
	  driver.quit();
	  
	  }
	 

	@Test
	public void searchg() throws InterruptedException
	{
		try {
			GoogleSearch sh= new GoogleSearch(driver);
			sh.googleSearch("iphone");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
