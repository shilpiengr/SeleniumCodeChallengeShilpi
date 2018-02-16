package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Driver;

//Page Object class for Home Page
public class HomePage {
	
	// Defining constructor
	public HomePage()
	{
		PageFactory.initElements(Driver.driver, this);
	}
	
	    // Locating Login link
	@FindBy(linkText="Form Authentication")
	WebElement login;
	
	 // Locating forgot password link
	@FindBy(linkText="Forgot Password")
	WebElement forgotPwd;
	
	
	// Returning the login link
	public WebElement getLogin()
	{
		return login;
	}
	
	// Returning the forgot password link
	public WebElement getForgotPasswordUrl()
	{
		return forgotPwd;
	}

}
