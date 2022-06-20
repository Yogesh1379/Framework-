package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	@FindBy(linkText = "Projects & Customers" ) private WebElement ProjectsCustomerslink;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement CreateNewCustomerBtn;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement CreateNewProjectBtn;
	@FindBy(name = "name") private WebElement CustomerName;
	@FindBy(name = "createCustomerSubmit") private WebElement createCustomerSubmitBtn;
	
	@FindBy(linkText = "dangade") private WebElement dangadeLink;
	
	//-----------------------------------------------------------
	
	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//----------------------------------------------------------------
	
	
	public WebElement getProjectsCustomerslink() {
		return ProjectsCustomerslink;
	}
	
	public WebElement getDangadeLink() {
		return dangadeLink;
	}

	public WebElement getCreateCustomerSubmitBtn() {
		return createCustomerSubmitBtn;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getCreateNewCustomerBtn() {
		return CreateNewCustomerBtn;
	}
	public WebElement getCreateNewProjectBtn() {
		return CreateNewProjectBtn;
	} 
	
	//---------------------------------------------------------------

	
}
