package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxes {

	WebDriver driver;
	
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}	
		
	@Test
	public void test1() {
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
		
		Boolean isTrueOrFalse = checkbox.isSelected();
				
			if (isTrueOrFalse) {
				System.out.println("it is selected");
			}else {
				checkbox.click();
				
			}
	}
		
	@Test
	public void test2() {
		
		 WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
         WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
           
           Boolean isTrueOrFALSE = checkBox1.isSelected();
           
           if(isTrueOrFALSE) {
               System.out.println("It is selected");
           }else {
               checkBox1.click();
               checkBox2.click();
           
				
			}
	}
		
	
}
