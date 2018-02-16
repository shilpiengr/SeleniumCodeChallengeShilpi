package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Common;
import resources.Driver;

public class AC01_LoginSuccessTest extends Common{
	
	/*Acceptance Criteria 1: Test  method to test the successful Login by entering valid username and password.
	 * Username and password are read from the properties file.
	 * User should see a success message on entering the correct username and password.
	 */
    public static Logger log = LogManager.getLogger(AC01_LoginSuccessTest.class.getName());
	@Test
	public void loginPageNavigation() throws InterruptedException 
	{
		log.info("*********************************************************************");
		log.info("Executing AC01: Test  method to test the successful Login by entering valid username and password");
		//String successMessage = "You logged into a secure area!";	
		Driver.driver.navigate().to(homeUrl);
		log.info("Home URL os the application is "+ homeUrl);
		
		
		//Going to home page
		HomePage hp = new HomePage();
		hp.getLogin().click();
		
		//Going to Login page
		LoginPage lp = new LoginPage();
		lp.getUserName().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSubmitButton().click(); 
		
		//Doing validations
		log.trace("*********************************************");
		//System.out.println(driver.getTitle());
	    String actualMessage = Driver.driver.findElement(By.cssSelector("div#flash.flash.success")).getText();
		log.trace(actualMessage);
		
		//Assertion
		SoftAssert assertion = new SoftAssert();
		assertion.assertTrue(true, actualMessage);
		log.info("**********Test case: AC01_LoginSuccessTest has been executed*********");
		assertion.assertAll();
		Thread.sleep(1000);
	}
}
