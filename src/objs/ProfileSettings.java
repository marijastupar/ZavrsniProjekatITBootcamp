package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Constants;

public class ProfileSettings {
	
	public static void profileMenuBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SETTINGS_PROFILE_XPATH)).click();
	}
	
	public static void settingsBtn(WebDriver driver) {
		driver.findElement(By.linkText("Settings")).click();
	}
	
	public static void changeFirstName(WebDriver driver, String firstName) {
		WebElement name = driver.findElement(By.id("first_name"));
		name.clear();
		name.sendKeys(firstName);
		}
	
	public static void changeLastName(WebDriver driver, String lastName) {
		WebElement name = driver.findElement(By.id("last_name"));
		name.clear();
		name.sendKeys(lastName);
		}
	
	public static void address(WebDriver driver, String addressEmp) {
		WebElement address = driver.findElement(By.id("address"));
		if(address != null) {
			address.clear();
		}
		address.sendKeys(addressEmp);
		
	}
	
	public static void saveEmployeeBtn(WebDriver driver) {
		driver.findElement(By.name("update")).click();
	}

}
