package org.stepdefinition;

import org.base.classes.BaseClass;

import org.pojo.classes.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveAndNegativeTestCase extends BaseClass {
	
	LoginPOJO l;
	
	@Given("To launch the browser and max widnow")
	public void to_launch_the_browser_and_max_widnow() {
	    
		browserLaunch("Chrome"); 
	}

	@When("To launch url of the application")
	public void to_launch_url_of_the_application() {
	    
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass positive and negative {string} data to email field")
	public void to_pass_positive_and_negative_data_to_email_field(String em) {
	    
		l = new LoginPOJO();
		passText(l.getEmailTxt(), em);
		
	}

	@When("To pass positive {string} and negative data to password field")
	public void to_pass_positive_and_negative_data_to_password_field(String password) {
	   
		passText(l.getPasswordTxt(), password);
	}

	@When("Click login button")
	public void click_login_button() {
	    
		clickWebelement(l.getLoginFindAll());
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    
		//
	}
	

}
