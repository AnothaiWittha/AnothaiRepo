package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicOptionsTesting {
	

	WebDriver driver;

@Before
public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("http://the-internet.herokuapp.com/dropdown");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
}	

}
