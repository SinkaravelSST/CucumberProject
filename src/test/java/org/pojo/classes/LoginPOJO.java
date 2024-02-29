package org.pojo.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.base.classes.BaseClass;

public class LoginPOJO extends BaseClass{

	// 1. Non parametrized constructor
	public LoginPOJO() {

		PageFactory.initElements(d, this); 
	}
	
	// 2. Private WebElements   
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement emailTxt;
	
	@CacheLookup
	@FindBy(name="pass")
	private WebElement passwordTxt; 
	
	@CacheLookup
	@FindBy(id="u_0_5_AZ")
	private WebElement loginBtn;
	
	// AND
	@CacheLookup
	@FindBys({
		
		@FindBy(xpath="//button[@id='u_0_5_AZ']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@data-testid='royal_login_button']")
	})
	private WebElement loginFindBys;
	
	// OR
	@CacheLookup 
	@FindAll({
		
		@FindBy(xpath="//button[@id='u_0_5_AZ']"),
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@data-testid='royal_login_button']")
	})
	private WebElement loginFindAll;

 	
	
	// 3. Getters to access those private WebElements outside the class
	
	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLoginFindBys() {
		return loginFindBys;
	}

	public WebElement getLoginFindAll() {
		return loginFindAll;
	}

}
