package objs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.Constants;

public class ProfilesSettingsMain {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"
				+ "");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(Constants.HOME_URL);
		Home.closeCookiesBtn(driver);
		Home.closePopUpBtn(driver);
		
		driver.manage().window().maximize();
		
		LoginPage.loginBtn(driver);
		LoginPage.inputUsername(driver, "marija@gmail.com");
		LoginPage.inputPassword(driver,"megigile");
		LoginPage.loginToMainPageBtn(driver);
		
		ProfileSettings.profileMenuBtn(driver);
		ProfileSettings.settingsBtn(driver);
		ProfileSettings.changeFirstName(driver, "Maja");
		ProfileSettings.changeLastName(driver, "Stupar");
		ProfileSettings.address(driver, "adresa druga");
		ProfileSettings.saveEmployeeBtn(driver);
		
		driver.close();

	}

}
