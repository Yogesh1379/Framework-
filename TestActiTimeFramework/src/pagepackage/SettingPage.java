package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage {
	
	@FindBy(name = "firstHierarchyLevelCode") private WebElement Topgroupinglevel;
	@FindBy(name = "secondHierarchyLevelCode") private WebElement middlegroupinglevel;
	@FindBy(name = "thirdHierarchyLevelCode") private WebElement timeentrylevel;
	
	//--------------------------------------------------------------------
	
	public SettingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//--------------------------------------------------
	
	
	public WebElement getTopgroupinglevel() {
		return Topgroupinglevel;
	}
	
	public WebElement getMiddlegroupinglevel() {
		return middlegroupinglevel;
	}
	public WebElement getTimeentrylevel() {
		return timeentrylevel;
	}
	
	

}
 