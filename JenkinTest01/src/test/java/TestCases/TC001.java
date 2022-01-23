package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\clare\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
  }
}
