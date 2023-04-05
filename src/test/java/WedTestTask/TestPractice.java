package WedTestTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPractice {

	public static void main(String[] args) {
		
		String url;

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        // it will make your browser full screen
        driver.manage().window().maximize();

        /*
         * open google.com
         */
        url = "https://www.crateandbarrel.com/";

        // this will nagivate you to the url you have passed
        driver.get(url);
        
        // driver.getTitle() --> this will return you the title of the page
       System.out.println(driver.getTitle());
       String actualTitle = driver.getTitle();
       String expectedTitle = "Modern Furniture Store, Home Decor & Wedding Registry | Crate & Barrel";
       
       if(actualTitle.equals(expectedTitle)) {
    	   System.out.println("you're right");
       }else {
    	   System.out.println("your're wrong");
       }
       
       url ="https://www.google.com/";
       
       // This will navigate you to the url you have pass, it is different than the
       // driver.get !!!
       driver.navigate().to(url);
       
       if(driver.getCurrentUrl().equals("https://www.google.com/")){
    	   
       }
       
	}

}
