package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.UploadFilePage;
import resources.Common;
import resources.Driver;

public class AC04_UploadFileTest extends Common{

	/* Acceptance Criteria 4: Test method to test the Upload a file.
	 * User would go to Upload file page and choose a file from his local machine and click on Upload file button.
	 * File path to be uploaded is read from properties file.
	 * User should see a success message saying File has been uploaded.
	 */

     public static Logger log = LogManager.getLogger(AC04_UploadFileTest.class.getName());
	@Test
	public void chooseAndUploadFile() throws InterruptedException
	{
				log.info("*********************************************************************");
				log.info("Executing AC04: Test method to test the Upload a file");
				//Choosing a file and uploading it
				log.info("Executing the Test case for Acceptance Criteria 4: AC04_UploadFileTest ");
				Driver.driver.navigate().to(uploadFilePage_url);
				log.info("navigated to Upload File Page");
				UploadFilePage ufp=new UploadFilePage();
				ufp.chooseFile().sendKeys(uploadFile_path);
				ufp.uploadFile().click();
				
				// Doing validations 
				String expectedMessage = "File Uploaded!";
				String actualMessage = Driver.driver.findElement(By.cssSelector("h3")).getText();
				log.trace("actual Message: "+  actualMessage);
				log.trace("expected Message: "+  expectedMessage);
				
				//Adding Assertion
				SoftAssert assertion = new SoftAssert();
				//assertion.assertTrue(true, actualMessage);
				assertion.assertEquals(expectedMessage, actualMessage);
				log.info("**********Test case: AC04_UploadFileTest has been executed*********");
				assertion.assertAll();
				
				Thread.sleep(1000);
	}

}
