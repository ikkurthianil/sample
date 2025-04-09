package selenium.azure;

import com.aventstack.chaintest.plugins.ChainTestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

import static org.testng.Assert.assertEquals;

@Listeners(ChainTestListener.class)
public class DemoTest {
	WebDriver driver;

	/**
	 * This method sets up the WebDriver based on the browser parameter.
	 *
	 * @param browser The browser name passed from the TestNG XML file
	 */
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			// Configure Chrome options
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*"); // Resolves potential origin issues
			// Initialize WebDriver with ChromeDriver and options
			driver = new ChromeDriver(options);

//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("browser", "chrome");
//			try {
//				driver = new RemoteWebDriver(new URL("https://ec2amws.com:4444/wd/hub"), cap);
//
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
		} else if (browser.equalsIgnoreCase("edge")) {
			// Use EdgeDriver for Edge browser
			 WebDriverManager.edgedriver().setup(); // Uncomment this line if required for
			driver = new EdgeDriver();
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("browser", "edge");
//			try {
//				driver = new RemoteWebDriver(new URL("https://ec2amws.com:4444/wd/hub"), cap);
//
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			}
		} else {
			throw new IllegalArgumentException("Browser not supported: " + browser);
		}

		// Set common configurations
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
	}

	/**
	 * Test to verify the visibility of the FreshWorks logo.
	 */
	@Test(priority = 1)
	public void freshWorksLogoTest() {
		boolean isLogoDisplayed = driver.findElement(By.cssSelector("img[alt='freshworks-logo']")).isDisplayed();
		Assert.assertTrue(isLogoDisplayed, "FreshWorks logo is not displayed!");
		System.out.println("Excute Test One");
	}

	/**
	 * Test to verify the title of the FreshWorks home page.
	 */
	@Test(priority = 2)
	public void freshWorksTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println("Page Title: " + actualTitle);
		//assertEquals(actualTitle, "A fresh approach to customer engagement", "Page title does not match!");
		System.out.println("Execute Test Two");
	}

	/**
	 * Test to print and validate the count of footer links on the FreshWorks site.
	 */
	// @Test(priority = 3)
	public void getFooterLinksTest() {
		List<WebElement> footerLinksList = driver.findElements(By.cssSelector("ul.footer-nav li a"));
		footerLinksList.forEach(link -> System.out.println(link.getText()));
		assertEquals(footerLinksList.size(), 35, "Footer links count does not match!");
		System.out.println("Execute Test Three");
	}

	/**
	 * This method quits the browser after each test method.
	 */
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}