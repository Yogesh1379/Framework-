package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {

	protected static  WebDriver driver;

	@BeforeTest
	public void setUp() throws EncryptedDocumentException, IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readProperty(PROP_PATH, "browser");
		String url = flib.readProperty(PROP_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);

		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);

		}
		
		else
		{
	      Reporter.log("Enter proper browser name either chrome or firefox");
		}
	}
	
	
	public void failed(String methodName)
	{
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+methodName+".png");
		Files.copy(src, dest);
		}
		
		catch (Exception e) {
			
		}
	}

	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
