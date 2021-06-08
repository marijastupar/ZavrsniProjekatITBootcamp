package objs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.Constants;

public class Screenshoot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"
				+ "");
		WebDriver driver = new ChromeDriver();
		
		driver.get(Constants.HOME_URL);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Home.closeCookiesBtn(driver);
		Home.closePopUpBtn(driver);
		
		driver.manage().window().maximize();
		
		Home.aboutUsMenu(driver);
		Home.aboutUsBtn(driver);
		Home.takeScreenshoot(driver);
		
		driver.close();

	}

}
