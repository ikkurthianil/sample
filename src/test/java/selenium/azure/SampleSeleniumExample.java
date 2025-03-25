package selenium.azure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SampleSeleniumExample {
    public static WebDriver driver;

    public static void main(String[] args) {
        // Set up WebDriver for Chrome
        //WebDriverManager.chromedriver().setup();
        
        // Configure Chrome options to handle potential cross-origin issues
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
        // Initialize the WebDriver with ChromeDriver and options
        driver = new ChromeDriver(options);

        try {
            // Navigate to Google and print the page title
            driver.get("https://www.google.com");
            System.out.println("Page title is: " + driver.getTitle());
        } finally {
            // Ensure the browser is closed after execution
            driver.quit();
        }
    }
}