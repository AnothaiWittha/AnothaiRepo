package basicSeleniumTests;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestNG {

	@Test
    public void softAssertions() {
        
        SoftAssert softAssertion = new SoftAssert();
        System.out.println("Soft assert start");
        softAssertion.assertTrue(false);
        System.out.println("Soft assert ends");

    }
}
