package com.crm.qa.testcases;

import java.io.IOException;

import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws Throwable{
		super();

		//calling super class constructor which is TestBase class constructor
	}

	@BeforeMethod
	public void setUp() throws Throwable {
		intialization();
		loginPage = new LoginPage();
	}

	//@Test
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	//@Test
	public void crmLogoImageTest() {
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}


	@Test
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}




}
