package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Home;
import objs.LoginPage;
import resources.Constants;

public class LoginTest {

	private static WebDriver driver;

	@BeforeClass()
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" + "");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	  @AfterClass public void closeDriver() {
		  driver.close(); }
	  
	 @Test(priority=1)
	 public void Screnshoot() {
		 driver.get(Constants.HOME_URL);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Home.closeCookiesBtn(driver);
			Home.closePopUpBtn(driver);
			
			driver.manage().window().maximize();
			
			Home.aboutUsMenu(driver);
			Home.aboutUsBtn(driver);
			Home.takeScreenshoot(driver);
	 }  

	
	@Test(priority=2)
	public void LoginTest() {
		driver.get(Constants.HOME_URL);
		
		/*
		driver.manage().window().maximize();
		Home.closeCookiesBtn(driver);
		Home.closePopUpBtn(driver);
		*/
		
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
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.DASHBOARD_PAGE_URL;
		Assert.assertEquals(currentUrl, expectedUrl);
		
	}

}
