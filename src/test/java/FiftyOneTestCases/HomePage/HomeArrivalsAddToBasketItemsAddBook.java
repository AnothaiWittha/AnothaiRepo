package FiftyOneTestCases.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeArrivalsAddToBasketItemsAddBook {
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
	10) Click on the Add To Basket button which adds that book to your basket
	11) User can view that Book in the Menu item with price.
	12) Now click on Item link which navigates to proceed to check out page.
	13) Click on textbox value under quantity in Check out page to add or subtract books.
	14) Now after the above change ‘Update Basket’ button will turn into Clickable mode.
	15) Now click on Update Basket to reflect those changes
	16) User has the feasibility to Update Basket at the time of check out.*/
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
	public void clickOnAddBasket() throws InterruptedException {
		
		driver.navigate().to("https://practice.automationtesting.in/product/mastering-javascript/");
		
		driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).click(); //click add to basket
		System.out.println("user cliked ADD TO BASKET button");
	}
	
	@Test(priority = 5)
	public void clickItemLink() throws InterruptedException {
		
		driver.navigate().to("https://practice.automationtesting.in/product/mastering-javascript/");
	
		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]")).click(); //click item link
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]")).click(); 
		System.out.println("User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page");
		
	}
	@Test(priority = 6)
	public void addBook() throws InterruptedException {
		
		driver.navigate().to("https://practice.automationtesting.in/basket/");
		
		driver.findElement(By.xpath("//*[@class=\"input-text qty text\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"input-text qty text\"]")).clear();
		driver.findElement(By.xpath("//*[@class=\"input-text qty text\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@value=\"Update Basket\"]")).click();
		
		String sendText = "Basket updated.";
		String actualResultOnthePage =
                driver.findElement(By.cssSelector(".woocommerce-message")).getText();
		Assert.assertTrue(actualResultOnthePage.contains(sendText));
        
		System.out.println("User has the feasibility to Update Basket ");
	}
	
	@AfterSuite(enabled=false)
	public void afterTest() {
		driver.close();
	
	}
}
