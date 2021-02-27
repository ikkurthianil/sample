package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.sourcelead.com/login");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  Actions action = new Actions(driver);
	  
	  action.moveToElement(driver.findElement(By.linkText("Features"))).build().perform();
	  
	  Thread.sleep(3000);
	 driver.findElement(By.linkText("IMS")).click();
	}

}
