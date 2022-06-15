package testpackage;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;
import pagepackage.SettingPage;
@Listeners(CustomeListener.class)
public class TestOptionsOfDropdown extends BaseTest{
	@Test 
	public void options() throws EncryptedDocumentException, IOException
	{

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String username = flib.readProperty(PROP_PATH, "username");
		String password = flib.readProperty(PROP_PATH, "password");
		lp.validLogin(username,password);

		HomePage hp = new HomePage(driver);
		hp.getSettingLink().click();

		SettingPage setting = new SettingPage(driver);
		WebElement drop = setting.getTopgroupinglevel();
		Select select = new Select(drop);
	List<WebElement> options = select.getOptions();
		
		for(int i=0; i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text = ops.getText();
			Reporter.log(text,true);
		
			select.selectByIndex(i);
		}
	
		

	}


}
