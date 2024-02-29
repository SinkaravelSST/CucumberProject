package org.runner.cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.generate.Jvm_Report;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", 
				glue="org.stepdefinition", 
				monochrome=true,
				dryRun=false,
				strict=true,
				snippets=SnippetType.CAMELCASE,
				plugin= {"pretty","html:target\\HtmlReports", 
						"junit:target\\JUnitReports\\JUReport.xml", 
						"json:target\\JsonReports\\JsReport.json", 
						"rerun:src\\test\\resources\\FailedScenarios\\failed.txt"}) 
public class TestRunnerClass{
	
	@AfterClass
	public static void repGenerate () {
		
		Jvm_Report.jvmReportGeneration("C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_10.30am\\target\\JsonReports\\JsReport.json");
	}
	
	// To Run Cucumber --> 1.Hooks(@Before) -> 2.FeatureFile -> 3.StepdefinitionFile -> 4.Hooks(@After)
	
}


