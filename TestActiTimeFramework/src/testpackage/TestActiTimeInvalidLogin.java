package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import pagepackage.LoginPage;

@Listeners(CustomeListener.class)
public class TestActiTimeInvalidLogin extends BaseTest{
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for (int i=1;i<=rc; i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLogin(username,password);
		}
	}
	

}
