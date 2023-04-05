package MyAccountPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	WebDriver driver;

	@BeforeSuite
	public  void loginMethod() throws InterruptedException {
		
		
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://practice.automationtesting.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			}
			
			
			
			@Test
			public void clickAccount() {
			
			try {
			driver.findElement(By.linkText("My Account")).click();
			Thread.sleep(5000);
			WebElement frame1 = driver.findElement(By.tagName("ad_iframe"));
			driver.switchTo().frame(frame1);
			WebElement frame2 = driver.findElement(By.id("ad_iframe"));
			driver.switchTo().frame(frame2);
			driver.findElement(By.id("//div[@id='dismiss-button']/div/span")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
	
}
