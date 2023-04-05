package webLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String username = "Admin";
		String password = "admin123";
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement userNameBox = driver.findElement(By.xpath("//*[@name='username']"));
		
		WebElement passwordBox = driver.findElement(By.xpath("//*[@name='password']"));
		
		WebElement loginButton = driver.findElement(By.xpath("//*[contains(@class,'oxd-button')]"));

		
		userNameBox.clear();
		userNameBox.sendKeys(username);
		
		passwordBox.clear();
		passwordBox.sendKeys(password);
		loginButton.click();
		

		
		

	}

}
