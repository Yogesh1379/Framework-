package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;
import pagepackage.TasksPage;
@Listeners(CustomeListener.class)

public class TestActiTimeCreateCustomer extends BaseTest {
	
	@Test(groups = "functional")
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
		
	}

}
