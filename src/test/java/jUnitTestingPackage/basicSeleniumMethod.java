package jUnitTestingPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicSeleniumMethod {
	
	WebDriver driver;
	
	@Before
	public void openBrowser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testingWebApplication() {
		
		//gets the title of the page
		String title =driver.getTitle();
		
		// html dom
		driver.getPageSource();
		
		//current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("The title of the page is ---> " + title);
		System.out.println("The current url of the page is ---> " + currentURL);
	}
	
	@After
	public void afterMethod() {
		driver.close();
	}
	
	

}
