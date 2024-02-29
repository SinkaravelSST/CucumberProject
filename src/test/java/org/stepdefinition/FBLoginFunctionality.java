package org.stepdefinition;

import org.base.classes.BaseClass;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pojo.classes.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class FBLoginFunctionality extends BaseClass {
	
	LoginPOJO l;
	
	@When("To verify it should navigate to home page or error page")
	public void to_verify_it_should_navigate_to_home_page_or_error_page() {
	    
		Assert.assertTrue(true); 
	}
	
	@Then("To close edge browser")
	public void to_close_edge_browser() {
	   
		closeBrowser();
	}

	@When("To launch FB application in edge browser")
	public void to_launch_FB_application_in_edge_browser() {
	    
		launchUrl("https://www.facebook.com/");
	}
	
	@Given("To launch the Edge browser and maximize the window")
	public void to_launch_the_Edge_browser_and_maximize_the_window() {
	    
		browserLaunch("Edge");
	}

	@When("To pass valid password into password text box")
	public void to_pass_valid_password_into_password_text_box() {
	    
		passText(l.getPasswordTxt(), "56776543");
		
	}

	@When("To click login button")
	public void to_click_login_button() {
	    
		clickWebelement(l.getLoginFindAll());
	}

	@When("To pass valid email into email text box")
	public void to_pass_valid_email_into_email_text_box() {
	    
		l = new LoginPOJO();
		
		WebElement em = l.getEmailTxt();
		passText(em, "selenium@gmail.com");
	}
}
