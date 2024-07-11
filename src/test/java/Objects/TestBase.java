package Objects;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	
	
	@BeforeTest
	public void StartBrowser() throws MalformedURLException
	
	{
		WebDriverManager.safaridriver().setup();
		//.chromedriver().setup();
		driver= new SafariDriver();
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
public void EndBrowser()
	{
		driver.quit();
		
	}

}
