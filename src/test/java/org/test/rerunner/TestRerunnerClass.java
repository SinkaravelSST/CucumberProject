package org.test.rerunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_10.30am\\src\\test\\resources\\FailedScenarios\\failed.txt",
                  glue="org.stepdefinition",
                  monochrome=true)
public class TestRerunnerClass {

	
	
}
