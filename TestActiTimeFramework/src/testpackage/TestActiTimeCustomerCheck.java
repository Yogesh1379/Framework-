package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;
import pagepackage.TasksPage;
@Listeners(CustomeListener.class)

public class TestActiTimeCustomerCheck extends BaseTest {
	
	@Test(groups = "Integration")
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		Flib flib = new Flib();
		String username = flib.readProperty(PROP_PATH, "username");
		String password = flib.readProperty(PROP_PATH, "password");
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username,password);
		
		HomePage hp = new HomePage(driver);
		hp.getTaskslink().click();
		
		TasksPage tp = new TasksPage(driver);
		tp.getProjectsCustomerslink().click();
		tp.getCreateNewCustomerBtn().click();
		tp.getCustomerName().sendKeys("dangade");
		tp.getCreateCustomerSubmitBtn().click();
		
		

	
		if(tp.getDangadeLink().isDisplayed())
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File(SCREENSHOT_PATH+"createCustomer.png");
		 Files.copy(src, dest);
		 
		 Reporter.log("customer is verify successfully",true);
			
		}
		
	}

}
