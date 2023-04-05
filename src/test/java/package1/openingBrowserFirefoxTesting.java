package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class openingBrowserFirefoxTesting {

public static void main(String[] args) {
		
		//declared and initialized webdriver to chromedriver
		System.setProperty("webdriver.gecko.driver", "/Users/annohwitt/Downloads/firefoxgecko/geckodriver");
		
		WebDriver driver = new FirefoxDriver();

		
		String url = "https://google.com";
		driver.get(url);
	}

}
