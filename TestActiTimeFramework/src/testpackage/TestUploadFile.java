package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import generic.BaseTest;
import generic.CustomeListener;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.HomePage;
import pagepackage.LoginPage;
import pagepackage.SettingPage;
@Listeners(CustomeListener.class)
public class TestUploadFile extends BaseTest {
	@Test(groups = "functional")
	public void uploadFile() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Flib flib = new Flib();
		String username = flib.readProperty(PROP_PATH, "username");
		String password = flib.readProperty(PROP_PATH, "password");
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		Thread.sleep(2000);
		WebDriverCommonLib wdcl = new WebDriverCommonLib();
		wdcl.verifyThePageTitle(HOMEPAGE_TITLE, "HomePage");
		
		HomePage hp = new HomePage(driver);
		hp.getSettingLink().click();
		
		SettingPage sp = new SettingPage(driver);
		sp.getLogoAndcolorSchemelink().click();
		
		wdcl.verifyThePageTitle("actiTIME - Logo & Color Scheme", "logo &color scheme");
		
		sp.getUploadNewLogoOptionBtn().click();
		WebElement fileSelect = sp.getFileSelect();
		
		wdcl.doubleClick(fileSelect);
		Thread.sleep(2000);
		
		File abs = new File("./AutoItScript/uf1.exe");
		String abspath = abs.getAbsolutePath();
		
		Thread.sleep(2000);
		File abs1 = new File("./AutoItScript/hitCancelButtton.exe");
		String abspath1 = abs1.getAbsolutePath();
		Runtime.getRuntime().exec(abspath1);
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec(abspath);
		Thread.sleep(3000); 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH + "uploadfile123.png");
		Files.copy(src, dest);
		
		
		
	}

}
