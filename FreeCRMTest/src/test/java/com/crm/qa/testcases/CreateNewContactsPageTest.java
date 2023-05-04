package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreateNewContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class CreateNewContactsPageTest extends TestBase {

	public CreateNewContactsPageTest() {
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	CreateNewContactsPage createNewContactsPage;
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		createNewContactsPage = new CreateNewContactsPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		homePage.clickOnContactsLink();
		contactsPage.createContacts();
		createNewContactsPage.verifyCreateNewContactsLabel();
	}
	
	@Test(priority = 1)
	public void verifyCreateNewContactsLabelTest() {
		boolean flag = createNewContactsPage.verifyCreateNewContactsLabel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void createContactsTest() {
		contactsPage = createNewContactsPage.saveContacts("Shah", "rukh");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
