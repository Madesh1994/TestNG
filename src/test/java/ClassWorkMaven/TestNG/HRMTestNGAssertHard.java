package ClassWorkMaven.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMTestNGAssertHard {

	WebDriver driver;

	@BeforeClass
	public void setUp()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("1. Open Chrome & Application");
	}

	// Timeout
	@Test(timeOut = 5000)
	public void signIn()

	{
		WebElement textUsername = driver.findElement(By.id("txtUsername"));
		textUsername.sendKeys("Admin");
		WebElement textPassword = driver.findElement(By.id("txtPassword"));
		textPassword.sendKeys("admin123");
		WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
		buttonLogin.click();
		System.out.println("2. Sign In");

		WebElement gettingUserName = driver.findElement(By.id("welcome"));
		String storeGetValue = gettingUserName.getText();
		System.out.println("getting User Name is " + storeGetValue);
		String inputTextValue = "Welcome Admin";

		Assert.assertEquals(storeGetValue, inputTextValue, "True-Welcome Admin logged in");
		System.out.println("Admin user is logged in");
		WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		menuAdmin.click();
		WebElement textUserName = driver.findElement(By.id("searchSystemUser_userName"));
		textUserName.sendKeys("Admin");
		WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
		buttonSearch.click();
		System.out.println("3. Search For User under Asseert!");

	}

	// Some test always fail and dosn't want to report.
	@Test()
	public void userSearch() {

		WebElement Dashboard = driver.findElement(By.xpath("//b[.='Dashboard']"));
		Dashboard.click();
		System.out.println("Dashboard Clicked!");

	}

	// Annotation - Depending on signin, if not signin then also runs
	@Test(dependsOnMethods = { "signIn" }, alwaysRun = true)
	public void userSignOut() throws InterruptedException {
		WebElement linkWelcome = driver.findElement(By.id("welcome"));
		linkWelcome.click();
		Thread.sleep(3000);
		WebElement linkLogout = driver
				.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
		linkLogout.click();
		System.out.println("4. Sign Out");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("5. Close Chrome & Application");
		driver.quit();
	}
}
