package selenium.azure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleSeleniumExample {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("web driver.log.level", "WARN");
        // Set DesiredCapabilities for Edge
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserName", "MicrosoftEdge");

        try {
            // Directly initialize WebDriver with RemoteWebDriver
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid URL for Selenium Grid Hub!", e);
        }

        try {
            // Navigate to Google and print the page title
            driver.get("https://www.google.com");
            System.out.println("Page title is: " + driver.getTitle());
        } finally {
            // Ensure the browser session is closed after execution
            if (driver != null) {
                driver.quit();
                System.out.println("Browser session terminated.");
            }
        }
    }
}