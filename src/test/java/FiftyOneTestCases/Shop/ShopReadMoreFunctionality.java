package FiftyOneTestCases.Shop;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopReadMoreFunctionality {
	
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
		
		driver.navigate().to("https://practice.automationtesting.in/shop/");
		
		driver.findElement(By.xpath("//div[@id='content']/ul/li[1]/a[2]")).click();
		
	
		
	}
}


