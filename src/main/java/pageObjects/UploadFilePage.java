package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Common;
import resources.Driver;

// Page Object class for Upload File page
public class UploadFilePage extends Common {

	
	public UploadFilePage()
	{
		PageFactory.initElements(Driver.driver, this);
	}

	@FindBy(id="file-upload")
	WebElement chooseFile;
	
	@FindBy(id="file-submit")
	WebElement upload;
	
	
	public WebElement chooseFile()
	{
		return chooseFile;
	}
	
	public WebElement uploadFile()
	{
		return upload;
	}
}
