package org.jvm.report.generate;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm_Report {
	
	// Json report came from Test Runner Class
	public static void jvmReportGeneration(String jsonReportPath) {

		// 1.Mention the target folder location - File
		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_10.30am\\target\\JvmReportsFolder");
		
		// 2.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook");
		c.addClassifications("Platoform", "Windows");
		c.addClassifications("Platform Version", "11");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Browser Version", "69");
		c.addClassifications("Sprint No", "2");
		
		// 3.Add json file paths into List<String>
		List<String> l = new ArrayList<String>();
		l.add(jsonReportPath);
		
		// 4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}
}
