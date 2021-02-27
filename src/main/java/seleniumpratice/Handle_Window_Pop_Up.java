package seleniumpratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Window_Pop_Up {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[4]")).click();
		Thread.sleep(2000);
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String childwindowId = it.next();
		System.out.println("Childwindowid:"+ childwindowId);
		
		
		  String paretwindowId =it.next(); System.out.println("ParentWindow:"+
		 paretwindowId);
		
		driver.switchTo().window(childwindowId);
		Thread.sleep(2000);
		System.out.println("Child window popup tittle"+driver.getTitle()); 
		
		driver.close();
		driver.switchTo().window(paretwindowId);
		Thread.sleep(2000);
		System.out.println("parent window popup tittle"+driver.getTitle()); 
		
		
		
		
		
		
	}

}
