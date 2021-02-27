package seleniumpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadmanual {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://my.naukri.com/account/register/basicdetails");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.findElement(By.name("userType")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\admin\\Desktop\\Anil_Automation_Engineer 4  Years Exp.doc");
	}

}
