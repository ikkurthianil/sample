  package selenium.azure;

  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunChromeExample {


      public static WebDriver driver;

      public static void main(String[] args) {
          // Set up WebDriver for Chrome using WebDriverManager
          WebDriverManager.chromedriver().setup();
          
          // Configure Chrome options
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--remote-allow-origins=*"); // Resolves potential origin issues
          
          // Initialize WebDriver with ChromeDriver and options
          driver = new ChromeDriver(options);

          try {
              // Navigate to a website and print the title
              driver.get("https://www.google.com");
              System.out.println("Page title is: " + driver.getTitle());
          } finally {
              // Ensure the browser closes after execution
              driver.quit();
          }
      }

}
