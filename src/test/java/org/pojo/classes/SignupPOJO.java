package org.pojo.classes;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPOJO extends BaseClass{

	// Non parametrized constructor
	public SignupPOJO() {

		PageFactory.initElements(d, this);		
	}
	
	
	// Private WebElements   
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement creNewAcc;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileOrEmail;
	
	@FindBy(name="birthday_day")
	private WebElement date;
	
	
	
	public WebElement getDate() {
		return date;
	}

	// Getters to access those private WebElements outside the class
	public WebElement getCreNewAcc() {
		return creNewAcc;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileOrEmail() {
		return mobileOrEmail;
	}
	
	
	
	
}
