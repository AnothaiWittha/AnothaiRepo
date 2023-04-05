import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tryForProject {

WebDriver driver;
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://blog.artsper.com/en/lifestyle/best-art-movies-streaming-now/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
	}	
	
	@Test
	public void click() {
		
	/*	driver.findElement(By.xpath("//ul[@class='navigation__list navigation__list--row']//a")).click();
		driver.findElement(By.xpath("//*[@name='app_customer_registration']//a")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("anooo@hotmail.co.th");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ano1253617*");
	//sign up	//driver.findElement(By.xpath("//*[@id='app_customer_registration_email']")).sendKeys("Anooo@hotmail.co.th");
	//sign up	//driver.findElement(By.xpath("//*[@id='app_customer_registration_plainPassword']")).sendKeys("Ano1253617*");
	//sign up	//driver.findElement(By.xpath("//div[@id='register']//form[@name='app_customer_registration']/button[@value='Log in']")).click();
		driver.findElement(By.xpath("//button[@id='_submit']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'My account')]")).click();
		
	 */
		
		driver.findElement(By.xpath("//*[@class=\"single-content\"]")).getText();
		
		String text = driver.findElement(By.xpath("//*[@class=\"single-content\"]")).getText();
		System.out.println(text);
		
		
		/*List<WebElement> images = driver.findElements(By.tagName("img"));

        // Loop through each image and verify that it is displayed
        for (WebElement image : images) {
            if (image.isDisplayed()) {
                System.out.println("Image is displayed: " + image.getAttribute("src"));
            } else {
                System.out.println("Image is not displayed: " + image.getAttribute("src"));
            }
        }*/
        
      /*  
        WebElement youtubeVideo = driver.findElement(By.cssSelector(".youtube-iframe"));

        // Switch to the YouTube video iframe
        driver.switchTo().frame(youtubeVideo);

        // Find the YouTube video player element
        WebElement youtubePlayer = driver.findElement(By.cssSelector("#movie_player"));

        // Verify that the YouTube video player is displayed
        if (youtubePlayer.isDisplayed()) {
            System.out.println("YouTube video is displayed.");
        } else {
            System.out.println("YouTube video is not displayed.");
        }

        // Switch back to the main frame
        driver.switchTo().defaultContent();
*/
 
   // driver.findElement(By.xpath("//*[@class=\"block-more link-underline\"]")).click();
    

		
	}
}

