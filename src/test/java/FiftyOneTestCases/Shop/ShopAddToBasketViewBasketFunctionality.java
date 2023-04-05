package FiftyOneTestCases.Shop;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopAddToBasketViewBasketFunctionality {
	
	
	
	WebDriver driver;

	@Before
	public void openBroser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test
	public void clickOnShop() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='menu-item-40']/a")).click();
		
		driver.navigate().to("https://practice.automationtesting.in/shop/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".add_to_cart_button")).click();

		driver.navigate().to("https://practice.automationtesting.in/shop/");
		
		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();	
		driver.findElement(By.xpath("//*[@id='billing_first_name']")).sendKeys("Anna");
		driver.findElement(By.xpath("//*[@id='billing_last_name']")).sendKeys("Wittha");
		driver.findElement(By.xpath("//*[@id='billing_company']")).sendKeys("papayasalad INC");
		driver.findElement(By.xpath("//*[@id='billing_email']")).sendKeys("Anna@hotmail.com");
		driver.findElement(By.xpath("//*[@id='billing_phone']")).sendKeys("9166600022");
		
		driver.findElement(By.xpath("//*[@id=\"select2-chosen-1\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1_search\"]")).sendKeys("united states");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"select2-results-1\"]/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='billing_address_1']")).sendKeys("123 skillman St");
		driver.findElement(By.xpath("//*[@id='billing_address_2']")).sendKeys("A12");
		driver.findElement(By.xpath("//*[@id='billing_city']")).sendKeys("Queens");
		
		
		driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]")).sendKeys("new york");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"select2-results-2\"]/li")).click();
		
		driver.findElement(By.xpath("//*[@id='billing_postcode']")).sendKeys("11111");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='payment_method_cod']")).click();
		driver.findElement(By.xpath("//*[@id='place_order']")).click();
	}

}
