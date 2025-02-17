package com.ctt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ctt.qa.pages.HomePage;
import com.ctt.qa.pages.LoginPage;

public class HomePageTest extends HomePage {
	
	LoginPage loginPage;
	HomePage homepage;
	private String expectedUser = "aarushp123098@gmail.com";
	
	@BeforeSuite
    public void setup() throws InterruptedException{
        initialization();
        loginPage = new LoginPage();
    }
	
	@Test(priority = 1)
    public void loginData() {
     homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

	
	@Test(priority = 2)
    public void testUserName() throws InterruptedException {
		Thread.sleep(8000);
        Assert.assertEquals(expectedUser, getUserNameText());
    }
	
	@AfterSuite
    public void closeBrowser() {
        driver.quit();
    }

}
