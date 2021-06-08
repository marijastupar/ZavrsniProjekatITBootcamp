package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Home;
import objs.LoginPage;
import objs.MainPage;
import resources.Constants;

public class MainPageTests {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" + "");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/*
	@BeforeClass
	public void implicityWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} */

	
	  @AfterClass public void closeDriver() {
		  driver.close(); 
		  } 
 
	  @Test(priority=1)
	  public void shiftPlanningBthTest() {
		  driver.get(Constants.HOME_URL);
		  driver.manage().window().maximize();
		  Home.closeCookiesBtn(driver);
		  Home.closePopUpBtn(driver);
		  LoginPage.loginBtn(driver);
		  LoginPage.inputUsername(driver, "marija@gmail.com");
		  LoginPage.inputPassword(driver,"megigile");
		  LoginPage.loginToMainPageBtn(driver);
		  
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			MainPage.shiftPlanningPageBtn(driver);
			/* pomocu teksta na stranici
		     String actualresult =MainPage.getText(driver);
			String expectedText = "ShiftPlanning";
		    Assert.assertEquals(expectedText, actualresult);
		    */
			String expectedTitle ="ShiftPlanning - Humanity";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
	  }
			
			
	  @Test(priority=2)
	  public void dashboardBtnTest() {
		  MainPage.dashboardBtn(driver);
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = Constants.DASHBOARD_PAGE_URL;
			Assert.assertEquals(currentUrl, expectedUrl);
	  }
	  
	  @Test(priority=3)
	  public void timeClockBtnTest() {
		    MainPage.timeClockBtn(driver);
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = Constants.TIME_CLOCK_URL;
			Assert.assertEquals(currentUrl, expectedUrl);
	  }
	  
	  @Test(priority=4)
	  public void leaveBtnTest() {
		    MainPage.leaveBtn(driver);
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = Constants.LEAVE_URL;
			Assert.assertEquals(currentUrl, expectedUrl);
	  }
	  
	  @Test(priority=5)
	  public void trainingTest() {
		    MainPage.trainingeBtn(driver);
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = Constants.TRAINING_URL;
			Assert.assertEquals(currentUrl, expectedUrl);
	  }
	  
	  @Test(priority=6)
	  public void staffTest() {
		    MainPage.staffBtn(driver);
		    /* pomocu teksta na stranici
		    String actualResult =MainPage.getText(driver);
		    String expectedResult = "Staff";
		    Assert.assertEquals(expectedResult, actualResult);
		    */
		    
		    String expectedTitle ="Staff - Humanity";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
	  }
	  
	  @Test(priority=7)
	  public void payrollBtn() {
		    MainPage.payrollBtn(driver);
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = Constants.PAYROLL_URL;
			Assert.assertEquals(currentUrl, expectedUrl);
	  }
	  
	  @Test(priority=8)
	  public void reportsBtn() {
		    MainPage.reportsBtn(driver);
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = Constants.REPORTS_URL;
			Assert.assertEquals(currentUrl, expectedUrl);
	  }
	  @Test(priority=9)
	  public void availabilityTest() {
		    MainPage.availabilityBtn(driver);;
		    String actualResult =MainPage.viewAvblText(driver);
		    String expectedResult = "View Availability";
		    Assert.assertEquals(expectedResult, actualResult);
	  }
}
