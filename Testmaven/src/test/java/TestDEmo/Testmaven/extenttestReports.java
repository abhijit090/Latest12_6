package TestDEmo.Testmaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


	
public class extenttestReports {
	WebDriver driver;
	ExtentReports extent;

	@BeforeSuite
	public void extenttest() {

		String path = System.getProperty("user,dir") + "\\reports\\index.html";
		ExtentSparkReporter repoter = new ExtentSparkReporter(path);
		repoter.config().setReportName("CTT WebApplication Report");
		repoter.config().setDocumentTitle("CTT Test Result");

		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("TESTER", "Abhijit Jadhav");

	}
	@SuppressWarnings("deprecation")
	@Test
	public void appLaunch() throws InterruptedException {
		
		extent.createTest("CTT Demo");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://staging.d36z6oo50ky8dh.amplifyapp.com/login");
		Thread.sleep(6000);
	}

	@Test(priority = 1, groups = "Page Title")
	public void cttProject() throws InterruptedException {
		// CTT Login Page
		System.out.println("Page title: " + driver.getTitle());
		Thread.sleep(4000);
		// int a = 9/0;

	}

	@Test(priority = 2, groups = "Login Page", dependsOnMethods = "cttProject")
	public void logincredentials() throws InterruptedException {
		extent.createTest("CTT Demo");
		// Login credentials Data
		driver.findElement(By.id("username")).sendKeys("aarushwagh133@gmail.com");// Enter Gmail
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys("hiFHM4As");// Password
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='button']")).click();// Login
		Thread.sleep(12000);
		System.out.println("Page title: " + driver.getTitle());
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath(
				"(//div[@class='MuiTypography-root MuiTypography-subtitle2 MuiTypography-noWrap css-1dqgwp4'])[1]"));
		String displayName = element.getText();
		System.out.println("Login Person Name: " + displayName);
		Thread.sleep(10000);
		extent.flush();
	}
	@AfterSuite
    public void closeBrowser() {
        // Close the WebDriver instance
        driver.quit();
    }
}