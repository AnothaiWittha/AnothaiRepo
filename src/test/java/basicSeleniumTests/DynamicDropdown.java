package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {
	
	WebDriver driver;

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void dynamicDropDown() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iad");

        wait.until(ExpectedConditions
                .textToBePresentInElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0")), "IAD"));

 
        
        // zolbo
//        WebElement fromBox = driver.findElement(By.xpath("//*[@type='text' and @id='fromCity']"));
//        fromBox.click();
//        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
//        searchBox.sendKeys("iad");
//        WebElement iad = driver.findElement(By.xpath("//*[contains(text(),'Washington-Dulles Apt, United States')]"));
//        iad.click();
//        
        // bahar
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IAD");
//          driver.findElement(By.xpath("//div[text()='IAD']")).click();
    }
}
