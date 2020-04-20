package ClassWorkMaven.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTestNG {

	// @before suite

//Configuration annotations or pre-conditions 
	@BeforeSuite
	public void beforeSuit() {
		// We can use this as pre-conditions suit
		// i.e. driver set-up

		System.out.println("Chrome set-up");
	}

	@BeforeTest
	public void BeforeTest() {
		// We can use this as pre-conditions suit
		// i.e open driver.d

		System.out.println("Open Chrome");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Open Application");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Signin");
	}

	@Test(priority = 2)
	public void testmethod() {
		System.out.println("2.Search for product");
	}

	@Test(priority = 1)
	public void testmethod1() {
		System.out.println("1.Search for product");
	}

	@Test(priority = 4)
	public void testmethod2() {
		System.out.println("4.Search for product");
	}

	@Test(priority = 3)
	public void testmethod3() {
		System.out.println("3.Search for product");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Signout");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("close application");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("Close browser");
	}

	@AfterSuite
	public void AfterSuit() {
		System.out.println("Clean up all cooklies");
	}

}
