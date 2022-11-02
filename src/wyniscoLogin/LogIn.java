package wyniscoLogin;


public class LogIn {

	public static void main(String[] args) {
		
		// Start Server 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		// This code starts the browser
		
		Webriver driver = new Chromedriver();
		
		driver.get("https://www.wynisco.com");
		
	
	    driver.manage().window().maximize();
	
		
		webElement Loginkinkbutton = driver.findElement(By.linktext("Login"));
		
		Loginlinkbutton.click();
		
		
		WebElement fullnameTextBox =  driver.findElement(By.id("userEmail"));
		
		fullnameTextBox.sendKeys();
		
		
	    WebElement emailTextBox	= driver.findElement(By.id("password"));	
		
	    emailTextBox.sendKeys();
	    
        WebElement Loginbutton = driver.findElement(By.id("Login"));
	    
	    button.click();
	        
			
		
		
		
		
		
				

	}

}
