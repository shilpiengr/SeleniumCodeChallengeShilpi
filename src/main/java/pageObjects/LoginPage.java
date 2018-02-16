package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Driver;

//Page Object class for Login Page
public class LoginPage {

	public LoginPage()
	{
		PageFactory.initElements(Driver.driver, this);
		
	}
	
	//By userName = By.id("username");
	//By userName = By.xpath(".//*[@id='username']");
	@FindBy(xpath=".//*[@id='username']")
	WebElement userName;
	
	//By password = By.id("password");
	//By password = By.xpath(".//*[@id='password']");
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	
	//By submit = By.cssSelector("button.radius");
	
	@FindBy(css="button.radius")
	WebElement submit;
	
	public WebElement getUserName()
	{
		return userName;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement getSubmitButton()
	{
		return submit;
	}
}
