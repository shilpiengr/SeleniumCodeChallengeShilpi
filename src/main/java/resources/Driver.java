package resources;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver driver = null;
	public static Logger log = LogManager.getLogger(Driver.class.getName());
	
	
	public static void initializeDriver()
	{
		if (driver == null)
		{
			// Initialize the appropriate browser as read from the Configuration file
			log.info("Browser to be initialized is "+ Configuration.Browser.browser);
			if (Configuration.Browser.browser.equalsIgnoreCase("chrome"))
			{
				// Initilize Chrome Browser
				log.trace("Initializing the Chrome browser");
				//Please set the appropriate path for the chromedriver.exe location on your machine
				System.setProperty("webdriver.chrome.driver",Configuration.Browser.chromeBrowserPath);
				driver = new ChromeDriver();
				log.info("Chrome browser initialized");
			}
			else if (Configuration.Browser.browser.equalsIgnoreCase("firefox"))
			{
				// initialize Firefox driver
				log.trace("Initializing the Firefox browser");
				System.setProperty("webdriver.gecko.driver",Configuration.Browser.firefoxBrowserPath);
				driver = new FirefoxDriver();
				log.info("Firefox browser initialized");
			}
						
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
				
	}
	

	//Method to close the browser instance
	public static void close()
	{
		log.info("Closing the browser window");
		driver.close();
		driver=null;
		//log = null;
	}
	
	
	//Method to quit all the browsers
	public static void quit()
	{
		log.info("Quitting the browser window");
		driver.quit();
		driver=null;
	}
	

}
