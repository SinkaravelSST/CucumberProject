package org.base.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) throws IOException {
		
		
		Properties p = new Properties();
		p.setProperty("username", "King");
		p.setProperty("pass", "38ueu39");
		
		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_10.30am\\SampleDatas.properties");
		FileOutputStream fos = new FileOutputStream(f);
		p.store(fos, "User Datas");
		fos.close();

	}

}
