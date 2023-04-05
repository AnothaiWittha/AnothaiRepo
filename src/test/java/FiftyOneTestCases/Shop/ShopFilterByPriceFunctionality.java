package FiftyOneTestCases.Shop;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopFilterByPriceFunctionality {
WebDriver driver;
	
	@Before
	public void openBroser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void clickAndAdjust() {
		driver.findElement(By.xpath("//*[@id='menu-item-40']/a")).click();
		
		driver.findElement(By.xpath("//*[@id="woocommerce_price_filter-2"]/form/div/div[1]/span[2]")).
	}

}
