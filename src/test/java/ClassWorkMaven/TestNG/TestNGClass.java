package ClassWorkMaven.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGClass {

	// @before suite

//Configuration annotations or pre-conditions 
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("1. @before Suit");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("2. @Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("3. @Before Method");
	}

	@Test
	public void testmethod() {
		System.out.println("4. @Test");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("5. @After Method");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("6. @After Class");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("7. After Suite");
	}

}
