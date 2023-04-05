package FiftyOneTestCases.MyAccountRegistration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationWithEmptyEmail {

	WebDriver driver;
	
	@Before
	public void openBroser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}

	@Test
	public void registeration() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		
		driver.navigate().to("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='reg_password']")).sendKeys("anotestcase51");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='woocommerce-register-nonce']//following::input[2]")).click();
		
	}
}