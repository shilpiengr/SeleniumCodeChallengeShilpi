package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import resources.Common;
import resources.Driver;

public class AC03_ForgotPasswordTest extends Common {
	
	/* Acceptance Criteria 3: Test method to test the Forgot password functionality.
	 * User would go to Forgot password page and enter his email id and click on retrieve password button.
	 * User should see a message saying email has been sent.
	 * 
	 */
	public static Logger log = LogManager.getLogger(AC03_ForgotPasswordTest.class.getName());
	@Test
	public void retrievePassword() throws InterruptedException 
	{
		log.info("*********************************************************************");
		log.info("Executing AC03: Test method to test the Forgot password functionality ");
		//Going to home page
				Driver.driver.navigate().to(homeUrl);
				log.info("Navigated to home page");
				HomePage hp = new HomePage();
				hp.getForgotPasswordUrl().click();
				log.trace("Clicked on forgot password link on home page");
				
				//Navigating to Forgot password page
				ForgotPasswordPage forgotPwd = new ForgotPasswordPage();
				forgotPwd.inputEmailId().sendKeys(emailId);
				log.trace("Entered the email id " +emailId);
				forgotPwd.retrievePassword().click();
				log.info("clicked on retrieve password button");
				
				// Doing validations
				String emailSentMessage = Driver.driver.findElement(By.cssSelector("#content")).getText();
				log.info("***************" + emailSentMessage);
				String expectedMessage = "Your e-mail's been sent!";
				
				//Assertion
				SoftAssert assertion = new SoftAssert();
				assertion.assertEquals(expectedMessage, emailSentMessage);
				log.info("**********Test case: AC03_ForgotPasswordTest has been executed*********");
				assertion.assertAll();
				Thread.sleep(1000);
	}
	
	
}
