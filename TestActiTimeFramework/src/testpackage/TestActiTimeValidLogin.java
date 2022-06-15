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
public class TestActiTimeValidLogin extends BaseTest{
	
	 @Test
	 public void login() throws EncryptedDocumentException, IOException
	 {
		Flib flib = new Flib();
		String username = flib.readProperty(PROP_PATH, "username");
		String password = flib.readProperty(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username,password);
		 
	 }
}
