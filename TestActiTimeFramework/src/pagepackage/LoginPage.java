package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username") private WebElement usn;
	@FindBy(name = "pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(xpath = "//a[.='Actimind Inc.']") private WebElement actimindLink;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	//-----------------------------------------------------
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//--------------------------------------------------------
	
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getActimindLink() {
		return actimindLink;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	//-----------------------------------------------------
	
	public void validLogin(String username, String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
	}

	public void invalidLogin(String username,String password) throws InterruptedException
	{
		
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
	}
	
	
	
}
