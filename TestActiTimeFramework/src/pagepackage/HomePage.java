package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeavetimeBtn;
	@FindBy(xpath = "//a[.='View Time-Track']") private WebElement viewTimeTrack;
	@FindBy(linkText = "Settings") private WebElement settingLink;
	@FindBy(linkText = "Logout") private WebElement logoutlink;
	
	//-------------------------------------------------
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	//----------------------------------------------------------------
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}



	public WebElement getSaveLeavetimeBtn() {
		return saveLeavetimeBtn;
	}
	public WebElement getViewTimeTrack() {
		return viewTimeTrack;
	}


	public WebElement getSettingLink() {
		return settingLink;
	}
	
	//---------------------------------------------------------------------------------
	
	

}
