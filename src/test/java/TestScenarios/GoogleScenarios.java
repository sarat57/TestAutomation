package TestScenarios;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearch;
import Objects.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleScenarios extends TestBase {
	WebDriver driver;
	
	
	  @BeforeTest public void StartBrowser() throws MalformedURLException 
	  
	  { 
		  DesiredCapabilities caps = new DesiredCapabilities();
		  caps.setBrowserName("chrome");
		  
		  System.out.println("---First test case running---");
		 // WebDriverManager.chromedriver().setup();
			driver= new RemoteWebDriver(new URL("http://3.144.225.146:4444/"), caps);
					//EdgeDriver();
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
