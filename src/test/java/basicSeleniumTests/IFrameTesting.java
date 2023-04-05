package basicSeleniumTests;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameTesting {

	WebDriver driver;
    Actions action; 

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    
    
    @Test
    public void dragAndDropTest() {
        clickTab("Droppable");
        
        driver.switchTo().frame(0);
        
        WebElement dragable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        
        action.dragAndDrop(dragable, droppable).build().perform();
        
        driver.switchTo().defaultContent();
//        driver.switchTo().parentFrame();
        
    }

    	
    	public void clickTab(String tabName) {
        
        List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]/ul/li"));

        for (WebElement eachTab : tabs) {
            String eachTabText = eachTab.getText();
            System.out.println(eachTabText);

            if (eachTab.getText().contains(tabName)) {
                eachTab.click();
                break;
            }
        }
    }
    
    @After
    public void aftertest() {
    	
    	driver.close();
    }


    }

