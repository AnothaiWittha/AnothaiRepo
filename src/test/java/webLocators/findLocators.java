package webLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findLocators {

	public static void main(String[] args) throws InterruptedException {
		
		//id = "twotabsearchtextbox" --> Amazon search Box element
        String url = "https://www.amazon.com/";
        
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get(url);
        
        
        //in order to find the single element we have to use the findElement method from driver and declare
        //the attribute type by using id, class name, etc and passing the element value from the UI.
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        
        Thread.sleep(3000);
        
        //this method will clear the search box , just in case if there is any value
        searchBox.clear();
        
        //this method will sendKeys (write some values in the box)
        searchBox.sendKeys("laptop");
        
        //id = nav-search-submit-button
        
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        
        searchButton.click();
        
        Thread.sleep(3000);
        
        
        driver.quit();
        
	}
}