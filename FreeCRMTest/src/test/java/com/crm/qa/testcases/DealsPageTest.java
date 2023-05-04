package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class DealsPageTest extends TestBase {

	DealsPage dealsPage;
	LoginPage loginPage;
	HomePage homePage;
	
	//calling super class constructor which is TestBase class constructor
	public DealsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		dealsPage = new DealsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		homePage.clickOnDealsPage();
	}
	
	@Test
	public void createDealsPageTest() throws IOException {
		dealsPage.createdeals("Shoppable Basics", "OL4U", "7200");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
