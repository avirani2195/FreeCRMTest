package com.crm.qa.pages;

import java.io.IOException;
import java.sql.Driver;

import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	//Page Factory - OR:
	@FindBy(name="email")
	WebElement name;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loignBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//img[contains(@class, 'img-responsive')]")
	WebElement crmLogo;
	
	
	
	/*WebElement passWord = driver.findElement(By.name("password"));
	passWord.sendKeys("123");*/
	
	//Initialization of page Object (Page factory)
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		name.sendKeys(un);
		password.sendKeys(pwd);
		loignBtn.click();
		
		return new HomePage();
	}
	
	 

	
}
