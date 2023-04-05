import org.junit.Assert;
import org.testng.annotations.Test;

import basicSeleniumTests.RetryAnalyzer;

public class TestRetryAnalyzer {

	
	
	@Test(retryAnalyzer =  RetryAnalyzer.class)
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
}
