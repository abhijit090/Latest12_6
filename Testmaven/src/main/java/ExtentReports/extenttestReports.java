package ExtentReports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extenttestReports {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void extenttest() {
        String path = System.getProperty("user.dir") + "//reports//index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("CTT WebApplication Report");
        reporter.config().setDocumentTitle("CTT Test Result");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("TESTER", "Abhijit Jadhav");
        extent.createTest(path);
    }


    @SuppressWarnings("deprecation")
    @Test(priority = 0, description = "App Launch Test")
    public void appLaunch() throws InterruptedException {
        test = extent.createTest("App Launch Test");
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://staging.d36z6oo50ky8dh.amplifyapp.com/login");
        Thread.sleep(6000);
    }

    @Test(priority = 1, description = "Page Title Test", groups = "Page Title")
    public void cttProject() throws InterruptedException {
        test = extent.createTest("Page Title Test");
        System.out.println("Page title: " + driver.getTitle());
        Thread.sleep(4000);
    }

    @Test(priority = 2, description = "Login Test", groups = "Login Page", dependsOnMethods = "cttProject")
    public void logincredentials() throws InterruptedException, IOException {
        test = extent.createTest("Login Test");
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

        // Capture screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = System.getProperty("user.dir") + "/screenshots/screenshot.png";
        FileUtils.copyFile(src, new File(screenshotPath));

        // Add screenshot to extent report
        test.addScreenCaptureFromPath(screenshotPath);
    }

    @AfterSuite
    public void closeBrowser() {
        // Close the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
        // Flush the report
        extent.flush();
    }
}
