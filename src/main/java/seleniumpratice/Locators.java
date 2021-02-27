package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://qa.sourcelead.com/login");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("usernameval")).sendKeys("co206admin@getnada.com");
	  
	  driver.findElement(By.name("password")).sendKeys("Pwd@12345");
	  driver.findElement(By.linkText("Sign up")).click();
	  driver.findElement(By.cssSelector("#firstName")).sendKeys("Anil");
	  driver.findElement(By.partialLinkText("policy")).click();

	  // How to handel the drop down field
	  Select select =new Select(driver.findElement(By.id("")));
	  select.selectByVisibleText("anil");
	  select.selectByIndex(9);
	  select.selectByValue("ei");
	 // DynamicXpath:
		  
		  //input[@Contains,class='lohal']
		  
		// id=test_123;
		// id=test_465;
		 
		  //input[Contains,(@id='test_')]
	      //input[starts_With,(@id='test_')]
	  
	        // id=test_123_test_t;
	         // id=test_1983_test_t;
	  //input[Ends_With,(@id='test_t')]
	  
	 // for links  
	  //a[contains(text,'link')];
	  
	  
	}

}


	  

