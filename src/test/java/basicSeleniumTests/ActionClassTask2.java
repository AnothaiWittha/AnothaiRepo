package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTask2 {
	
	WebDriver driver;
	Actions action;
	
	@Before
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	@Test
	public void moverOverMouse() {
		
		//div[@id='nav-tools']/a[2]
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		action.dragAndDrop(from, to).build().perform();
	

	}

}
