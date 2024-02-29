package org.base.classes;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	// Base class contains only reusable methods

	// No main method

	public static WebDriver d;
	public static Select s;

	public static void browserLaunch(String browserName) {

		// Edge.equals("Chrome")
		if (browserName.equals("Chrome")) {

//			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		}
		// Edge.equals("Firefox")
		else if (browserName.equals("Firefox")) {

//			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}
		// Edge.equals("Edge")
		else if (browserName.equals("Edge")) {

//			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
		}

	}
	
	public static void windowMax() {

		d.manage().window().maximize();
	}
	
	public static void screenShot() {

		System.out.println("Take Screenthot");
	}

	public static void launchUrl(String url) {

		d.get(url);
	}
	
	public static String getUrl() { 

		String url = d.getCurrentUrl();
		return url; 
	}
	
	public static String getTheTitle() {

		String title = d.getTitle();
		return title;
	}

	public static void passText(WebElement element, String txt) {

		element.sendKeys(txt);
	}

	public static void clickWebelement(WebElement element) {

		element.click();
	}

	public static void screenshot(String imgName) throws IOException {

		TakesScreenshot t = (TakesScreenshot) d;
		File img = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_10am\\Screenshots\\" + imgName);
		FileUtils.copyFile(img, des);
	}

	public static String readDataFromExcel(int rowNum, int cellNum) throws IOException {
 
		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\NewProjectMaven\\Excel Files\\Datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fis); 

		Sheet s = book.getSheetAt(1);

		Row r = s.getRow(rowNum);

		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		String value;
		
		if (cellType == 1) {

			value = c.getStringCellValue();
		} 
		else if (DateUtil.isCellDateFormatted(c)) {

			Date date = c.getDateCellValue(); // Sat Mar 10 00:00:00 IST 1990
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			value = sdf.format(date); // 10-03-1990			
		} 
		else {

			double num = c.getNumericCellValue(); // 456765.0
			long l = (long) num;
			value = String.valueOf(l); // 456765
		}
		
		return value;  
	}

	
	
	public static void createNewExcel(String data) throws IOException {

		// To Create and write the data to excel sheet
		
		//1. To mention path location
		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\NewProjectMaven\\Excel Files\\NewExcel.xlsx");
		
		//2. create file
		Workbook w = new XSSFWorkbook();
		
		// 3. Create sheet in workbook
		Sheet newSheet = w.createSheet("courses");
		
		// 4. Create row in sheet
		Row newRow = newSheet.createRow(0);
		
		// 5. Create Cell in row
		Cell newCell = newRow.createCell(0);
		
		newCell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		System.out.println("Writed...");
		
	}
	
	
	
	
	
	public static void createCell(int getRowNum, int creCellNum, String data) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\NewProjectMaven\\Excel Files\\NewExcel.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
 
		Sheet newSheet = w.getSheet("courses");

		Row newRow = newSheet.getRow(getRowNum);

		Cell newCell = newRow.createCell(creCellNum);

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

		System.out.println("Writed...");
	}
	
	
	
	
	
	
	public static void createRow(int creRowNum, int creCellNum, String data) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\NewProjectMaven\\Excel Files\\NewExcel.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
 
		Sheet newSheet = w.getSheet("courses");

		Row newRow = newSheet.createRow(creRowNum);

		Cell newCell = newRow.createCell(creCellNum); 

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

		System.out.println("Writed...");
	}
	
	
	public static void closeBrowser() {

		d.quit();
	}
	
	
	public static void selectDate(WebElement targetDropDown, int index) {

		s = new Select(targetDropDown);
		s.selectByIndex(index);
	}
	
	public static void selectMonth(WebElement targetDropDown, int index) {

		s = new Select(targetDropDown);
		s.selectByIndex(index);
	}
	
	public static void selectYear(WebElement targetDropDown, int index) {

		s = new Select(targetDropDown);
		s.selectByIndex(index);
	}
	
	
}
