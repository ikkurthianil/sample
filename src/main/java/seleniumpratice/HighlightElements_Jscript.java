package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class HighlightElements_Jscript {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.sourcelead.com/login");
		
 WebElement singnbutton =driver.findElement(By.xpath("//input[@class='sign_btn']"));

	}

	public static void flash(WebElement element,WebDriver driver)
	{
		JavaScriptExecutor js = ((JavaScriptExecutor)(driver));
		String bgcolor=element.getCssValue("backgroundcolour");
		for(int i=0;i<100;i++)
		{
			changecolor("rgb(0,200,0)",element,driver);
			changecolor(bgcolor,element,driver);
		}
	}
	
	public static void changecolor(String color,WebElement element,WebDriver driver)
	{
	JavaScriptExecutor js=((JavaScriptExecutor)(driver));
	//js.executeScript("arguments[0].style.backgroundColor" =  '"+color+"'", element);
	try	{
		Thread.sleep(1000);	
		}catch(InterruptedException e)
	{
			
	}
	}
}
