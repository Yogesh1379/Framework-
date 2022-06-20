package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage {
	
	@FindBy(name = "firstHierarchyLevelCode") private WebElement Topgroupinglevel;
	@FindBy(name = "secondHierarchyLevelCode") private WebElement middlegroupinglevel;
	@FindBy(name = "thirdHierarchyLevelCode") private WebElement timeentrylevel;
	@FindBy(xpath = "//a[.='Logo & Color Scheme']") private WebElement logoAndcolorSchemelink;
	@FindBy(xpath = "//input[@id='uploadNewLogoOption']") private WebElement uploadNewLogoOptionBtn;
	@FindBy(xpath = "//input[@name='formCustomInterfaceLogo.logo']") private WebElement fileSelect;
	
	
	//--------------------------------------------------------------------
	
	public SettingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//--------------------------------------------------
	
	
	public WebElement getTopgroupinglevel() {
		return Topgroupinglevel;
	}
	
	public WebElement getLogoAndcolorSchemelink() {
		return logoAndcolorSchemelink;
	}

	public WebElement getUploadNewLogoOptionBtn() {
		return uploadNewLogoOptionBtn;
	}

	public WebElement getFileSelect() {
		return fileSelect;
	}

	public WebElement getMiddlegroupinglevel() {
		return middlegroupinglevel;
	}
	public WebElement getTimeentrylevel() {
		return timeentrylevel;
	}
	
	

}
 