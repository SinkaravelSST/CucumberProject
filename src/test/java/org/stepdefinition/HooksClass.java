package org.stepdefinition;

import org.base.classes.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before(order=15)
	public void preCondition1() {

		windowMax();
		System.out.println("Window Maximized");
	}
	
	@Before(order=4)
	public void preCondition2() {
 
		browserLaunch("Chrome");
		System.out.println("Browser Launched");
	}
	
	@Before(order=19, value="@Scenario3")
	public void preCondition3() {

		screenShot();
	}
	
	// Each Scenarios in all feature file
	
	@After(order=9)
	public void postCondition1() {

		closeBrowser();
		System.out.println("Close Browser");
	}
	
	@After(order=21)
	public void postCondition2(Scenario s) {

		if (s.isFailed()) { // returns true when scenario is getting failed
			
			System.out.println("Failed Scenario Name:" + s.getName());
			TakesScreenshot t = (TakesScreenshot)d;
			byte[] sc = t.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image/png"); 			
		}
		
	}
	

}
