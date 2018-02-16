
This readme.txt contains step by step instructions to setup the project and do the test execution.

Pre requisties:
--------------------
1) Java 1.8 should be installed
2) Maven<> should be installed 
3) JAVA_HOME and MAVEN_HOME env variables should be set. Path variable should be set to include Java bin and Maven bin folders path.
4) Go to command prompt and write the command -> maven -version
	It should show the maven version being installed and the Java version being installed.
	In case of any error (Maven is not recognized as an externa or internal command), check if above env variables and paths have been set correctly.
	In case you have installed Java and Maven just now, then please restart your machine. 


**************************************************
Project setup Instructions:
**************************************************
1) Go to below Github URL and pull the project (Project name: CodingChallenge) on your local machine:
   https://github.com/shilpiengr/SeleniumCodeChallengeShilpi
2) Open eclipse. Go to File -> Import existing maven projects -> Select above Project from your local machine
2) Open the imported project in eclipse.
3) Copy the Chrome and Firefox driver executables (chromedriver.exe and geco.exe) in your local machine and note the path.
4) Open the Configurations file (Configuration.java) at below path in the project:
		/CodingChallenge/src/main/java/resources/Configuration.java
		 Update the value of below variables as per the path on your local machine:
		 a) chromeBrowserPath - Take path from above step 3
		 b) firefoxBrowserPath - Take path form above step 3
		 c) uploadFilePath - Copy any .jpg or other file on your local machine and give that path here
5) Test cases can be executed either in Chrome or Firefox browsers. 
	Please set the value of the variable "browser" to either "chrome" or "firefox" in above Vonfiguration.java file.
		 
****************************************************		 
Test Cases execution Instructions:
****************************************************
1) Please check the project for any compilation errors (if some errors have been introduced during project setup).
2) Go to the above project (Project name: CodingChallenge) in eclipse.
3) Go to testng.xml, present at the root level.
4) Right click on testng.xml ->Run as -> Testng Suite
5) This will trigger the execution of the test cases in the selected browser.
6) All the 4 Acceptance Criterias would be executed as mentioned in testng.xml
7) Generated logs can be seen at the logs folder. This folder is present at the root level in the project.
8) Log level can be changed in log4j2.xml, currently its set as trace.
9) To execute any test cases independently, go to the src folder -> src/test/java/testCases.
   Here 4 java classes are present -> AC01_LoginSuccessTest.java, AC02_LoginFailureTest.java, AC03_ForgotPasswordTest.java and AC04_UploadFileTest.java.
   Right click on any of these files -> Run as -> TestNG.
   This will execute the independent test cases.
 10) Above test execution can also be done from command prompt.
     Go to the project folder on your local machine. pom.xml should be in this folder.
     Enter the command -> mvn test
     This will clean the project, compile it and run all the test cases.
 
