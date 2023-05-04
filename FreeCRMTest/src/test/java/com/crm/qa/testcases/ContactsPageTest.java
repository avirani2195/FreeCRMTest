package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	/*public ContactsPageTest(){
		super();
		//calling super class constructor which is TestBase class constructor
	}*/
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		homePage.clickOnContactsLink();
	}
	
	//@Test(priority = 1)
	public void verifyContactsLableTest() {
		Assert.assertTrue(contactsPage.verifyContactsLabel());
	}
	
	@Test(priority = 2)
	public void  verifyCreateNewContactsPageTest() {
		 contactsPage.createContacts();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
