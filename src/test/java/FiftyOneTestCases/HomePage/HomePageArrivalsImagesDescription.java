package FiftyOneTestCases.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageArrivalsImagesDescription {
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on Shop Menu
	4) Now click on Home menu button
	5) Test whether the Home page has Three Arrivals only
	6) The Home page must contains only three Arrivals
	7) Now click the image in the Arrivals
	8) Test whether it is navigating to next page where the user can add that book into his basket.
	9) Image should be clickable and should navigate to next page where user can add that book to his basket
	10) Click on Description tab for the book you clicked on.
	11) There should be a description regarding that book the user clicked on*/
	
WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test(priority = 1, enabled = false)
	public void clickOnShopMenu() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@id='menu-item-40']")).click();
		driver.navigate().to("https://practice.automationtesting.in/shop/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='content']//a")).click();
		System.out.println("user clicked on Home menu button");
		Thread.sleep(1000);
	}
	
	@Test(priority = 2, enabled = false)
	public void checkArrivals() {
		
		driver.navigate().to("https://practice.automationtesting.in/");
		
		List<WebElement> allArrival = driver.findElements(By.xpath("//*[@class=\"woocommerce\"]/ul/li"));
		
		for( WebElement eachArrival: allArrival) {
			String arrivalText = eachArrival.getText();
			System.out.println(arrivalText);
			System.out.println("The Home page contains only three Arrivals");
		}
	}
	
	
	@Test(priority = 3, enabled = false)
	public void clickImage() {
		
		driver.navigate().to("https://practice.automationtesting.in/");
	
		driver.findElement(By.xpath("//*[@title=\"Mastering JavaScript\"]")).click();
		System.out.println("user clicked the image in the Arrivals and navigate to next page");
		
	}
	
	@Test(priority = 4)
	public void clickReviewsAndDescription() throws InterruptedException {
		
		driver.navigate().to("https://practice.automationtesting.in/product/mastering-javascript/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,550)");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
       	driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]/a")).click();
       	Thread.sleep(2000);
       	System.out.println("user clicked on DESCRIPTION button");
	}
	
	
	@AfterSuite
	public void afterTest() {
		driver.close();
	}
	

}
