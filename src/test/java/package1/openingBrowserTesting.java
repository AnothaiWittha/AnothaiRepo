package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingBrowserTesting {

	public static void main(String[] args) {
		
		//declared and initialized webdriver to chromedriver
		System.setProperty("webdriver.chrome.driver", "/Users/annohwitt/Downloads/chromedriver_mac64/chromedriver");
		
		WebDriver driver = new ChromeDriver();

		
		String url = "https://www.techcircleschool.com/";
		driver.get(url);
	}

}
