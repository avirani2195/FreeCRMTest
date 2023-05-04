package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CreateNewContactsPage extends TestBase {

	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement createContactsLable;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(name="category")
	WebElement categoryDropDown;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	public CreateNewContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyCreateNewContactsLabel() {
		return createContactsLable.isDisplayed();
	}
	
	public ContactsPage saveContacts(String fName, String lName) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		//Select category = new Select(categoryDropDown);
		//category.selectByVisibleText(catName);
		saveBtn.click();
		
		return new ContactsPage();
		
	}
	
	
}
