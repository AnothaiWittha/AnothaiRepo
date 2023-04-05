package FiftyOneTestCases.MyAccountLogin;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithValidUsernameAndPassword {
	WebDriver driver;
	
	@Before
	public void openBroser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}

	@Test
	public void clickOnMyAccount() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='menu-item-50']/a")).click();
		
		driver.navigate().to("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Anooo@hotmail.co.th");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("anotestcase51");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		
	}

}
