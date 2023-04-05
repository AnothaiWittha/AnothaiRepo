package basicSeleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfElementsTask {
WebDriver driver;
	
	@Before
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}


	@Test
    public void clickSelectable() {
        
        List<WebElement> tabs= 
                driver.findElements(By.xpath("//*[@class='widget']/ul/li/a"));
        
        for (WebElement eachTab : tabs) {
           String eachTabText = eachTab.getText();
           System.out.println(eachTabText);
            
            if(eachTab.getText().contains("Selectable")) {
                eachTab.click();
                break;
            }
        }
	}

}
