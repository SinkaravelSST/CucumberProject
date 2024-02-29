package org.stepdefinition;

import java.util.List;

import org.base.classes.BaseClass;

import org.pojo.classes.SignupPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AccountCreation extends BaseClass {
	
	SignupPOJO s;
	
	@Given("To launch browser")
	public void to_launch_browser() {
	    
		browserLaunch("Chrome");
	}

	@When("To launch Url in browser")
	public void to_launch_Url_in_browser() {
	    
		launchUrl("https://www.facebook.com/");
	}

	@When("To click Create New Account Button")
	public void to_click_Create_New_Account_Button() {
	    
		s = new SignupPOJO();
		clickWebelement(s.getCreNewAcc());
	}

	@When("To pass first name in Firstname field")
	public void to_pass_first_name_in_Firstname_field(DataTable d) throws InterruptedException {
	    
		Thread.sleep(2000); 
		List<String> l = d.asList();
		passText(s.getFirstName(), l.get(1));
	}

	@When("To pass last name in Surname field")
	public void to_pass_last_name_in_Surname_field(DataTable d) {
	    
		List<List<String>> a = d.asLists();
		passText(s.getLastName(), a.get(1).get(1));
	}

	@When("To pass email in email or mobile field")
	public void to_pass_email_in_email_or_mobile_field() {
	    
		passText(s.getMobileOrEmail(), "selenium@gmail.com");
	}
	
	@When("To Select your Date of bearth")
	public void to_Select_your_Date_of_bearth() {
	    
		selectDate(s.getDate(), 4);
	}

	@Then("Close Browser")
	public void close_Browser() {
	    
	}

}
