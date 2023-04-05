package jUnitTestingPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

public class AnnotationTesting {
	

	@BeforeClass
	public static void beforeclass() {
		System.out.println("Executing beforeclass first and only one time");
	}
	@BeforeMethod
	public void beforeClass() {
		System.out.println("Executing Before test");
		
	}
	
	@Test
	public void test1() {
		System.out.println("Executing Test1");
		
	}
	@Test
	public void test2() {
		System.out.println("Executing Test2");
	}
	
	@AfterMethod
	public void afterClass() {
		System.out.println("Executing After test");
		
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("Executing afterclass last and only one time");
	}
	

}
