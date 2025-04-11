package selenium.azure;

import com.aventstack.chaintest.plugins.ChainTestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Listeners(ChainTestListener.class)
public class DemoTest {
	private WebDriver driver;

	/**
	 * Sets up WebDriver based on the browser and execution mode parameters.
	 *
	 * @param browser       The browser name passed from TestNG XML file.
	 * @param executionMode The mode of execution (local or remote) passed from TestNG XML file.
	 * @param gridUrl       The Selenium Grid URL passed as a parameter for remote execution.
	 */
	@BeforeMethod
	@Parameters({"browser", "executionMode", "gridUrl"})
	public void setup(String browser, String executionMode, String gridUrl) {
		if ("local".equalsIgnoreCase(executionMode)) {
			// Local execution setup
			switch (browser.toLowerCase()) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--disable-notifications");
					driver = new ChromeDriver(chromeOptions);
					break;

				case "edge":
					WebDriverManager.edgedriver().setup();
					EdgeOptions edgeOptions = new EdgeOptions();
					driver = new EdgeDriver(edgeOptions);
					break;

				default:
					throw new IllegalArgumentException("Unsupported browser for local execution: " + browser);
			}
		} else if ("remote".equalsIgnoreCase(executionMode)) {
			// Remote execution setup
			DesiredCapabilities capabilities = new DesiredCapabilities();
			switch (browser.toLowerCase()) {
				case "chrome":
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--remote-allow-origins=*");
					chromeOptions.addArguments("--disable-notifications");
					capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
					capabilities.setCapability("browserName", "chrome");
					break;

				case "edge":
					capabilities.setCapability("browserName", "MicrosoftEdge");
					break;

				default:
					throw new IllegalArgumentException("Unsupported browser for remote execution: " + browser);
			}

			try {
				driver = new RemoteWebDriver(new URL(gridUrl), capabilities);
			} catch (MalformedURLException e) {
				e.printStackTrace();
				throw new RuntimeException("Invalid Selenium Grid URL: " + gridUrl, e);
			}
		} else {
			throw new IllegalArgumentException("Invalid execution mode specified: " + executionMode);
		}

		// Common configurations
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
	}

	/**
	 * Test to verify the visibility of the FreshWorks logo.
	 */
	@Test(priority = 1)
	public void freshWorksLogoTest() {
		WebElement logo = driver.findElement(By.cssSelector("img[alt='freshworks-logo']"));
		Assert.assertTrue(logo.isDisplayed(), "FreshWorks logo is not displayed!");
		System.out.println("Test One: Verified FreshWorks logo visibility.");
	}

	/**
	 * Test to verify the title of the FreshWorks home page.
	 */
	@Test(priority = 2)
	public void freshWorksTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println("Page Title: " + actualTitle);
		Assert.assertTrue(actualTitle.contains("Freshworks"), "Title does not contain 'Freshworks'!");
		System.out.println("Test Two executed: Verified FreshWorks page title.");
	}

	/**
	 * Test to validate the count of footer links on the FreshWorks site.
	 */
	@Test(priority = 3)
	public void getFooterLinksTest() {
		List<WebElement> footerLinksList = driver.findElements(By.cssSelector("ul.footer-nav li a"));
		footerLinksList.forEach(link -> System.out.println(link.getText()));
		assertEquals(footerLinksList.size(), 35, "Footer links count does not match!");
		System.out.println("Test Three: Validated footer links count.");
	}

	/**
	 * Cleans up WebDriver after each test method.
	 */
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}