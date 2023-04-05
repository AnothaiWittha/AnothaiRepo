package TestClassFor51TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyAccountPage.LoginAuthentication;
import UtilitiesFor51TestCases.BaseClassFor51TestCases;


public class LoginTestClass51 {
	
	LoginAuthentication lp;

	@BeforeMethod
	public void beforeTest() {
		BaseClassFor51TestCases.getDriver();
		lp = new LoginAuthentication();

	
	}

	
	@Test
	public void loginSucessfullly() throws InterruptedException {
		lp.loginMethod();
	}								
		
	
}
