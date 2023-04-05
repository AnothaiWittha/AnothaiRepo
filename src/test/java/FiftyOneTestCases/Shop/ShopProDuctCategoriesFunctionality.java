package FiftyOneTestCases.Shop;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopProDuctCategoriesFunctionality {

		WebDriver driver;
			
			@Before
			public void openBroser() {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("http://practice.automationtesting.in/");
				driver.manage().window().maximize();
				
			}
			@Test
			public void clickOnShop() {
				driver.findElement(By.xpath("//*[@id='menu-item-40']/a")).click();
				
				driver.navigate().to("https://practice.automationtesting.in/shop/?min_price=150&max_price=450");
				
				driver.findElement(By.xpath("//*[@id='woocommerce_product_categories-2']/ul/li/a[1]")).click();
			}

}
