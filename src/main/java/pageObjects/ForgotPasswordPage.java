package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Driver;

// Page Object class for Forgot Password Page

public class ForgotPasswordPage {
	
	public ForgotPasswordPage()
	{
		PageFactory.initElements(Driver.driver, this);
	}

	@FindBy(css="input#email")
	WebElement email;
	
	@FindBy(id="form_submit")
	WebElement submitBtn;
	
	public WebElement inputEmailId()
	{
		return email;
	}
	
	
	public WebElement retrievePassword()
	{
		return submitBtn;
	}
	
}
