package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.findElement(By.name("proceed")).click();
		  Thread.sleep(5000);
		  
		  //Alert API using
		  
		  Alert alert = driver.switchTo().alert();
		  
		  System.out.println(alert.getText());
		  
		  String text =alert.getText();
		  
		  if
		  (text.equals("Please enter a valid user name"))
			  
		  {
			  System.out.println("Correct alert message is displayed");
		  }
			  else
			  {
				  System.out.println("In_Correct alert message is displayed");
			  }
			  
		
		  
		  alert.accept(); // using ok button
		 // alert.dismiss(); // using cancel button
	}

}


