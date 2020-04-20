package ClassWorkMaven.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Groups {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("\n************Testing Groups Functionality*********");
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

	@Test(groups = "smoketesting", priority = 3) // Test1
	public void smoketesting1() {
		System.out.println("4.1. Smoke Testing1");
	}

	@Test(groups = "smoketesting", priority = 2) // Test1
	public void smoketesting2() {
		System.out.println("4.1. Smoke Testing2");
	}

	@Test(groups = { "smoketesting", "Functionaltesting" }) // Test1
	public void smoketesting3() {
		System.out.println("4.1. Smoke Testing3");
	}

	@Test(groups = "Functionaltesting", priority = 1) // Test1
	public void zFunctionaltesting1() {
		System.out.println("4.3. Functional Testing");
	}

	@Test(groups = "sanitytesting") // Test2
	public void sanitytesting1() {
		System.out.println("4.2. sanity Testing");
	}

	// Dependence on method
	@Test(groups = "IntegrationTesting", dependsOnGroups = "sanitytesting") // Test1
	public void IntegrationTesting1() {
		System.out.println("4.4. Integration Testing");
	}

	@Test(groups = "RegressionTesting") // Test1
	public void RegressionTesting1() {
		System.out.println("4.5. Regression Testing");
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
