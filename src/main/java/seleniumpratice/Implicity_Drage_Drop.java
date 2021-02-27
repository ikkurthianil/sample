package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicity_Drage_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://qa.sourcelead.com/login");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.findElement(By.id("usernameval")).sendKeys("co206admin@getnada.com");
		  driver.findElement(By.name("password")).sendKeys("Pwd@12345"); 
		  driver.findElement(By.className("sign_btn")).click();
		Thread.sleep(2000);  
		  driver.findElement(By.xpath("//*[@id=\"enrolledLocDiv\"]/div/div[2]/a[1]/div")).click();
		  Thread.sleep(1000);  
		  driver.findElement(By.linkText("Jobs")).click();
		  Thread.sleep(1000);  
		  driver.findElement(By.xpath("//a[@class='action newAdBtn mr5']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Job")).click();
		  Thread.sleep(1000);
		 // driver.findElement(By.linkText("Add")).click();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 */
		  JavascriptExecutor jse = (JavascriptExecutor)driver;

		  jse.executeScript("scroll(0, 500);");
		  Actions action =new Actions(driver);
		  Thread.sleep(1000);
		  action.clickAndHold(driver.findElement(By.xpath("//div[@class='clearfix mt10']//div[9]//a[1]")))
		  .moveToElement(driver.findElement(By.className("Editor-editor")))
		  .release()
		  .build()
		  .perform();
		  
		  
		
	}

}
