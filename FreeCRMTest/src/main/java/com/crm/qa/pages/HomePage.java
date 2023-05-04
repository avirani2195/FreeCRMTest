package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[@class='user-display']")
	@CacheLookup 												//Improve you script process.
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]") 
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCorrectUsername() {
		return userNameLabel.isDisplayed();
		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
		
	}
	
	public DealsPage clickOnDealsPage() throws IOException {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksPage() {
		tasksLink.click();
		return new TasksPage();
	}
	
	
}
