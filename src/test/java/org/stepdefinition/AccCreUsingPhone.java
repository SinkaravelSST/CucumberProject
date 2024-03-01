package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.classes.BaseClass;
import org.junit.Assert;
import org.pojo.classes.SignupPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AccCreUsingPhone extends BaseClass {
	
	SignupPOJO s;
	
	@Given("To launch Chrome")
	public void to_launch_Chrome() {
	    
		browserLaunch("Chrome");
	}

	@When("To launch Fb url in Chrome")
	public void to_launch_Fb_url_in_Chrome() {
	    
		launchUrl("https://www.facebook.com/");
	}

	@When("To click Cre New Acc Button")
	public void to_click_Cre_New_Acc_Button() {
	    
		s = new SignupPOJO();
		clickWebelement(s.getCreNewAcc());
	}

	@When("To pass first name in Firstname text box")
	public void to_pass_first_name_in_Firstname_text_box(DataTable d) throws InterruptedException {
	    
		Thread.sleep(2000); 
		Map<String, String> m = d.asMap(String.class, String.class);
		passText(s.getFirstName(), m.get("Firstname Two")); 
		Assert.assertTrue(false);  
	}

	@When("To pass last name in Surname text box")
	public void to_pass_last_name_in_Surname_text_box(DataTable d) {
	    
		List<Map<String, String>> m = d.asMaps();
		passText(s.getLastName(),m.get(1).get("Lastname Three"));
	}

	@When("To pass phone number in email or mobile field")
	public void to_pass_phone_number_in_email_or_mobile_field() {
	    
		passText(s.getMobileOrEmail(), "9876543210");
	}
	
	@Then("Close Chrome Browser")
	public void closeChromeBrowser() {
	    
	}

}
