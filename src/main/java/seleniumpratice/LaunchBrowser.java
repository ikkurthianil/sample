package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Anil_Selenium_Work_Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.navigate().to("https://www.sourcelead.com/register");
		
		
		
		 
		
		String tittle= driver.getTitle(); 
		System.out.println(tittle);
		 if(tittle.equals("::. Sign In .::"))
		 {
			 System.out.println("correct");
		 }
		 
		 else {
			 System.out.println("In_correct");
		 }
		 
		WebElement op = driver.findElement(By.id("usernameval"));
		String i=op.getText();
		System.out.println(i);
		 
		 driver.navigate().refresh();
		try {
			 op.sendKeys("Anil");		
		}
				 catch(StaleElementReferenceException e)
				 {
					 op = driver.findElement(By.id("usernameval"));
					 op.sendKeys("Anil");
				 }
		
		
		String s1=driver.findElement(By.id("usernameval")).getAttribute("value");
		System.out.println(s1);
		
		driver.close();
			 }
	
	
	
			
		
		 
		
		//driver.quit();
	}

