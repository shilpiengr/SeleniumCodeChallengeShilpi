package resources;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import resources.Configuration.Browser;
import resources.Configuration.email;
import resources.Configuration.pwd;
import resources.Configuration.uploadFile;
import resources.Configuration.urls;
import resources.Configuration.users;

// Class to contain the common methods
public class Common {
	
	public String homeUrl;
	public String uploadFilePage_url;
	public String username;
	public String password;
	public String wrongPassword;
	public String browserName;
	public String emailId;
	public String uploadFile_path;
	
	//public static Logger log = LogManager.getLogger(Common.class.getName());
	//Method to initialize the browser based on the browser name given in the Configuration file
	@BeforeClass(alwaysRun=true)
	public void initializeBrowserAndProperties() throws IOException
	{			
			//Read various parameters from Configuration file
			browserName = Configuration.Browser.browser;
			homeUrl = Configuration.urls.home_url;
			username = Configuration.users.username;
			password = Configuration.pwd.password;
			wrongPassword = Configuration.pwd.wrongPassword;
			emailId = Configuration.email.emailId;
			uploadFilePage_url = Configuration.uploadFile.uploadFilePageUrl;
			uploadFile_path=Configuration.uploadFile.uploadFilePath;
			System.out.println("All properties loaded");
			
			
			System.out.print("Initializing the Driver");
			Driver.initializeDriver();
		
			
	}
	
	
	@AfterSuite(alwaysRun=true)
	public void cleanup()
	{
		System.out.println("Calling driver.close()  ****");
		Driver.close();
	}
}
