package vishwasaholidays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vishwasaholidays.com/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement SignUplink = driver.findElement(By.linkText("SignUp"));
		
		
		SignUplink.click();
		
		WebElement UserNametextBox = driver.findElement(By.name("username"));
		
		UserNametextBox.sendKeys("Chetna Karekar");
		
		WebElement Passsword =driver.findElement(By.name("Password"));
		
		Passsword.sendKeys("abc123");
		
		WebElement ConfirmPassword =driver.findElement(By.name("confirm-password"));
		
		ConfirmPassword.sendKeys("abc123");
		
		WebElement FirstNametextbox = driver.findElement(By.name("first_name"));
		
		FirstNametextbox.sendKeys("Chetna");
		
		WebElement LastNametextbox =driver.findElement (By.name("last_name"));
		
		LastNametextbox.sendKeys("Karekar");
		
		//// Select DOB
		
		
		WebElement emailtextbox = driver. findElement(By.name("email"));
		
		emailtextbox.sendKeys("chetnak83@gmail.com");
		
		WebElement phonetextbox =driver.findElement(By.name("phone"));
		
		phonetextbox.sendKeys("999999999");
		
		WebElement country = driver.findElement(By.xpath("//select [ @name='country']"));
		
		///Check Box 
		
		
		country.click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
