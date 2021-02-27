package seleniumpratice;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProperties 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException 
	{
		Properties pro = new Properties();
		
		FileInputStream in= new  FileInputStream("E:\\sample\\src\\main\\java\\seleniumpratice\\config.properties");
		 pro.load(in);
System.out.println(pro.getProperty("name"));
System.out.println(pro.getProperty("age"));

String url =pro.getProperty("url");
String browserName =pro.getProperty("browserName");

if(browserName.equals("chrome")) 
{
System.setProperty("webdriver.chrome.driver", "E:\\Anil_Selenium_Work_Drivers\\chromedriver.exe");
driver=new ChromeDriver();
}
else if (browserName.equals("firefox")) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\firefoxdriver.exe");
	driver=new FirefoxDriver();
}

else if (browserName.equals("IE")) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\iedriver.exe");
	driver=new InternetExplorerDriver();
}
driver.get(url);

driver.findElement(By.xpath(pro.getProperty("firstnamexpath"))).sendKeys(pro.getProperty("firstname"));


}

	}


