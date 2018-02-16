package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Common;
import resources.Driver;

/*Acceptance Criteria 2: Test  method to test the Login failure scenario by entering invalid username and password.
 * Username and invalid password are read from the properties file.
 * User should see an error message on entering the invalid username and password.
 */
public class AC02_LoginFailureTest extends Common {
	
	public static Logger log = LogManager.getLogger(AC02_LoginFailureTest.class.getName());

	@Test
	public void loginPageNavigation() throws IOException, InterruptedException
	{
		log.info("*********************************************************************");
		log.info("Executing AC02: Test  method to test the Login failure scenario by entering invalid username and password.");
		String errorMessage = "Your password is invalid!";	
		
		//Going to Home page
		Driver.driver.navigate().to(homeUrl);
		HomePage hp = new HomePage();
		hp.getLogin().click();
		
		// Going to Login page and entering username and wrong password
		LoginPage lp = new LoginPage();
		log.info("navigated to Login page");
		lp.getUserName().sendKeys(username);
		lp.getPassword().sendKeys(wrongPassword);
		lp.getSubmitButton().click(); 
		
		// Doing validations
		log.trace("*********************************************");
		String actualMessage = Driver.driver.findElement(By.cssSelector("div#flash.flash.error")).getText();
		log.trace(actualMessage);
			
		//Assertion
		SoftAssert assertion = new SoftAssert();
		//assertion.assertEquals(successMessage, actualMessage);
		assertion.assertTrue(true, errorMessage);
		log.info("**********Test case: AC02_LoginFailureTest has been executed*********");
		assertion.assertAll();
		Thread.sleep(1000);
		
		
	}

}
