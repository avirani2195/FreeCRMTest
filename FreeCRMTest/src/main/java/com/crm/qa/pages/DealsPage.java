package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase {

	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement createBtn;

	@FindBy(name="title")
	WebElement title;

	@FindBy(xpath="//div[@class='ui fluid search selection dropdown']//input[@type='text']")
	WebElement company;

	@FindBy(name="amount")
	WebElement amount;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;

	//Initialization: of page Object (Page factory)
	public DealsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions: 
	public DealsPage createdeals(String ttl, String cmp, String amt) throws IOException {
		createBtn.click();
		title.sendKeys(ttl);
		company.sendKeys(cmp);
		amount.sendKeys(amt);
		saveBtn.click();
		
		return new DealsPage();
	} 
	
	
	
	
	
	
}
