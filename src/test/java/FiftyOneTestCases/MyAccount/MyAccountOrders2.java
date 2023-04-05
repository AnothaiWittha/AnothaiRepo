package FiftyOneTestCases.MyAccount;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountOrders2 {
	WebDriver driver;
	
	@Before
	public void openBroser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void AccountOrders() {
		
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		driver.navigate().to("https://practice.automationtesting.in/my-account/");
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Anooo@hotmail.co.th");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("anotestcase51");
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a")).click();
	}
}
