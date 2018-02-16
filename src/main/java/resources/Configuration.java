package resources;

public class Configuration {
	
	public static class Browser{
		public static String browser="chrome"; 	
		public static String chromeBrowserPath="C:\\Users\\kamal\\drivers\\chromedriver.exe" ;
		public static String firefoxBrowserPath="C:\\Users\\kamal\\drivers\\geckodriver.exe" ;
	}

	public static class urls{
		public static String home_url="http://the-internet.herokuapp.com/";	
	    public static String uploadFilePage_url="uploadFilePageUrl=http://the-internet.herokuapp.com/upload";
	}
	
	public static class users{
	    	public static String username="tomsmith";
	}
	
	public static class pwd{
		public static String password="SuperSecretPassword!";
		public static String wrongPassword="wrongpassword";
	}

	public static class email{
		public static String emailId="abc@test.com";
	}
	
	public static class uploadFile{
		public static String uploadFilePageUrl="http://the-internet.herokuapp.com/upload";
		public static String uploadFilePath="C:\\Users\\kamal\\CodeChallengeSelenium\\TestImage.jpg";
	}
	
	
}
