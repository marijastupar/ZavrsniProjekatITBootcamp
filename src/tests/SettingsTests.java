package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objs.Home;
import objs.LoginPage;
import objs.Settings;
import resources.Constants;

public class SettingsTests {
	
	private static WebDriver driver;
	
	@BeforeClass()
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" + "");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	 @AfterClass public void closeDriver() {
		  driver.close(); 
		  } 
	
	@Test(priority=1)
	 public void languageChangeTest() {
		 driver.get(Constants.HOME_URL);
			
			Home.closeCookiesBtn(driver);
			Home.closePopUpBtn(driver);
			
			driver.manage().window().maximize();
			LoginPage.loginBtn(driver);
			LoginPage.inputUsername(driver, "marija@gmail.com");
			LoginPage.inputPassword(driver,"megigile");
			LoginPage.loginToMainPageBtn(driver);
			
			//driver.navigate().refresh();
			
			Settings.settingsBtn(driver);
			
			
			Settings.changeLanguage(driver, "Serbian (machine)");
			Settings.saveSettingsBtn(driver);
			Select s = new Select(driver.findElement(By.name("language")));
			
			Assert.assertEquals(s.getFirstSelectedOption().getText(), "Serbian (machine)");
			
			driver.navigate().to(Constants.DASHBOARD_PAGE_URL);	
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 }
	
	@Test(priority=2)
	public void disableNotifications() {
		Settings.settingsBtn(driver);
		
		Settings.changeLanguage(driver, "American English");
		Settings.saveSettingsBtn(driver);
		driver.navigate().refresh();
		
		Settings.checkNotifications(driver, "pref_pref_email");
		Settings.checkNotifications(driver, "pref_pref_sms");
		Settings.checkNotifications(driver, "pref_pref_mobile_push");
		
		WebElement email = driver.findElement(By.name("pref_email"));
		WebElement sms = driver.findElement(By.name("pref_sms"));
		WebElement mobile = driver.findElement(By.name("pref_mobile_push"));
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(email.isSelected(), false);
		sa.assertEquals(sms.isSelected(), false);
		sa.assertEquals(mobile.isSelected(), false);
		
		sa.assertAll();
		
				
		
	}
	
	
	
	
}
