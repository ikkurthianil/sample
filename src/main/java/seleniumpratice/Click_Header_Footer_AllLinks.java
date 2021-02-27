package seleniumpratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Header_Footer_AllLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Anil_Selenium_Work_Drivers\\geckodriver.exe");
		WebDriver driver = new  FirefoxDriver();
		driver.get("https://www.sourcelead.com/");
		driver.manage().window().maximize();
		

		
		WebElement option1 = driver.findElement(By.xpath("//nav[@id='navHeader-scroll']//div[@class='container-fluid']"));
		System.out.println(option1.findElements(By.tagName("a")).size());
		
		for( int i=0;i<option1.findElements(By.tagName("a")).size();i++)
		{
			String opentabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
			option1.findElements(By.tagName("a")).get(i).sendKeys(opentabs);
		}
		
		
		driver.close();
		
	}

} 
