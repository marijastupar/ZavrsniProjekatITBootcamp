package tests;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objs.Home;
import objs.LoginPage;
import objs.MainPage;
import objs.Staff;
import resources.Constants;

public class StaffTests {
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" + "");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	@Test(priority=1)
	public void AddEmployeeTest() {
	  driver.get(Constants.HOME_URL);
	  driver.manage().window().maximize();
	  Home.closeCookiesBtn(driver);
	  Home.closePopUpBtn(driver);
	  LoginPage.loginBtn(driver);
	  LoginPage.inputUsername(driver, "marija@gmail.com");
	  LoginPage.inputPassword(driver,"megigile");
	  LoginPage.loginToMainPageBtn(driver);
	  
	  
	 MainPage.staffBtn(driver);
	 
	 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 Staff.addEmployeesBtn(driver);
	 Staff.inputFirstName(driver, "Pera");
	 Staff.inputLastName(driver, "Petrovic");
	 Staff.inputEmail(driver, "perap389@gmail.com");
	 Staff.saveEmployeesBtn(driver);
	 
	 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 
	 MainPage.staffBtn(driver);
	 
	 
	/* List<WebElement> zaposleni = driver.findElements(By.className("Box Table-cell Name-cell wide "));
	 String actualResult = zaposleni.get(1).getText();  */
	 String actualResult = Staff.Employee(driver, "Pera Petrovic");
	 String expectedResult = "Pera Petrovic";
	 Assert.assertEquals(expectedResult, actualResult);
	 
	}
	
	@Test(priority=2)
	
	public void changeNameTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Staff.EmployeeBtn(driver, "Pera Petrovic");
	
	
	Staff.editDetails(driver);
	Staff.changeFirstName(driver, "Petar");
	//Staff.uploadPicture(driver, "neki path");
	Staff.updateBtn(driver);

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	MainPage.staffBtn(driver);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	String actualResult = Staff.Employee(driver, "Petar Petrovic");
	String expectedResult = "Petar Petrovic";
	Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority = 3)
	// zbog vezbe je koriscena drugacija metoda za proveru zaposlenih, mada je mogla je i ona iz prethodnog testa
	
	public void multipleEmployeesTest() {
		//Staff.addEmployeesBtn(driver);
		File f = new File("Zaposleni.xlsx");
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			SoftAssert sa = new SoftAssert();
			
			for(int i = 0; i<5; i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				Cell c1 = row.getCell(1);
				Cell c2 = row.getCell(2);
				
				String firstName = c0.toString();
				String lastName = c1.toString();
				String email = c2.toString();
				
				 Staff.addEmployeesBtn(driver);
				 Staff.inputFirstName(driver, firstName);
				 Staff.inputLastName(driver, lastName);
				 Staff.inputEmail(driver, email);
				 Staff.saveEmployeesBtn(driver);
				 
				 String expectedResult = firstName + " " + lastName;
				 String actualResult = Staff.newEmployee(driver, firstName, lastName);
				 
				 sa.assertEquals(expectedResult, actualResult);
				 
				 /* provera dodatih zaposlenih moze i jednostavnije:
				  * MainPage.staffBtn(driver);
				  * Assert.asertTrue(driver.getPageSource().contains(email);
				  * 
				  */
			}
			
			sa.assertAll();
			wb.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}

