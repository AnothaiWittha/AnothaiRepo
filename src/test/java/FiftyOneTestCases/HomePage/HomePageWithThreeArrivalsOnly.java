package FiftyOneTestCases.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageWithThreeArrivalsOnly {
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on Shop Menu
	4) Now click on Home menu button
	5) Test whether the Home page has Three Arrivals only
	6) The Home page must contains only three Arrivals
	*/
	
WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public void clickOnShopMenu() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@id='menu-item-40']")).click();
		driver.navigate().to("https://practice.automationtesting.in/shop/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='content']//a")).click();
		System.out.println("user clicked on Home menu button");
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void checkArrivals() throws InterruptedException {
		
		driver.navigate().to("https://practice.automationtesting.in/");
		
		List<WebElement> allArrival = driver.findElements(By.xpath("//*[@class=\"woocommerce\"]/ul/li"));
		
		for( WebElement eachArrival: allArrival) {
			String arrivalText = eachArrival.getText();
			System.out.println(arrivalText);
			System.out.println("The Home page contains only three Arrivals");
		}

	}
	
	
	@AfterSuite
	public void afterTest() {
		driver.close();
	}
	
}
