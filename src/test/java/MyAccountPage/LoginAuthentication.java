package MyAccountPage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilitiesFor51TestCases.BaseClassFor51TestCases;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAuthentication {

	WebDriver driver;

	public LoginAuthentication() {
		PageFactory.initElements(BaseClassFor51TestCases.getDriver(), this);
	}

	@FindBy(linkText = "My Account")
	public WebElement myAccountClick;

	@FindBy(id = "username")
	public WebElement clickUserNameBox;

	@FindBy(name = "usernameValid")
	public WebElement userTextBox;

	@FindBy(id = "password")
	public WebElement clickPasswordBox;

	@FindBy(name = "passwordValid")
	public WebElement paawordTextBox;

	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")
	public WebElement loginButton;

	public void loginMethod() throws InterruptedException {
		
		try {
			

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://practice.automationtesting.in/");
			
			myAccountClick.click();
			Thread.sleep(5000);
			WebElement frame1 = driver.findElement(By.id("aswift_3_host"));
			driver.switchTo().frame(frame1);
			WebElement frame2 = driver.findElement(By.id("ad_iframe"));
			driver.switchTo().frame(frame2);
			driver.findElement(By.id("//div[@id='dismiss-button']/div/span")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		clickUserNameBox.click();

		userTextBox.sendKeys(BaseClassFor51TestCases.getProperty("usernameValid"));

		clickPasswordBox.click();
		paawordTextBox.sendKeys(BaseClassFor51TestCases.getProperty("passwordValid"));
		loginButton.click();

	}

}
