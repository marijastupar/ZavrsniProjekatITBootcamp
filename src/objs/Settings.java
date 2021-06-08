package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import resources.Constants;

public class Settings {
	
	public static void settingsBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SETTINGS_XPATH)).click();
	}
	
	public static void changeLanguage(WebDriver driver, String language) {
		Select languages = new Select(driver.findElement(By.name("language")));
		languages.selectByVisibleText(language);
	}
	
	public static void saveSettingsBtn(WebDriver driver) {
		driver.findElement(By.id("act_primary")).click();
	}
	
	public static String wallMessageLanguage(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.WALL_MESSAGE_XPATH)).getText();
	}
	
	public static void checkNotifications(WebDriver driver, String id) {
		driver.findElement(By.id(id)).click();
	}
	
}
