package com.crm.qa.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	DealsPage createDealsPage;
	 
	public HomePageTest(){
		super();
		//calling super class constructor which is TestBase class constructor
	}
	
	//TestCase Should be separated --independent with each other.
	//Before every test launch the browser and login
	//After end every TestCase quit the browser.
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

	}
	
	@Test(priority = 1)
	public void verifyHomePageTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		//System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Cogmento CRM");		
	} 
	
	@Test(priority = 2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	
	@Test(priority = 3)
	public void verifyContactslinkTest() {
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test
	public void verifyeDealsLinkTest() throws IOException {
		createDealsPage = homePage.clickOnDealsPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
