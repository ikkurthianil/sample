package seleniumpratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "E:\\Anil_Selenium_Work_Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://qa.sourcelead.com");
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  driver.navigate().to("https://www.facebook.com/");
			  
			  
			  
			  List<WebElement> link = driver.findElements(By.tagName("a"));
			  for(WebElement ele:link)
			  {
				System.out.println( ele.getAttribute("href"));
			  }
			  
			  
			List <WebElement> linktext=  driver.findElements(By.tagName("a"));
			List <WebElement> linktext1=  driver.findElements(By.tagName("input"));
			List <WebElement> linktext2=  driver.findElements(By.tagName("button"));
			List <WebElement> linktext3=  driver.findElements(By.tagName("img"));
			System.out.println("1.Links="+linktext.size());
			System.out.println("2.Inputs="+linktext1.size());
			System.out.println("3.Buttons="+linktext2.size());
			System.out.println("4.Images="+linktext3.size());
			
		//if using xpath also	//a[contains(text,'link')];
			
for(int i=0;i<linktext.size();i++)
{
	String list =linktext.get(i).getText();
	System.out.println(list);
	
}


for(int i=0;i<linktext1.size();i++)
{
	String list1 =linktext1.get(i).getText();
	System.out.println(list1);
	
}

for(int i=0;i<linktext2.size();i++)
{
	String list2 =linktext2.get(i).getText();
	System.out.println("button="+list2);
	
}
			
	}

}
