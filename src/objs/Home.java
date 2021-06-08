package objs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.Constants;

public class Home {
	
	public static void takeScreenshoot(WebDriver driver) {
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Stupar\\eclipse-workspace\\zavrsniProjekat\\screenshots\\\\HomePage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closePopUpBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.CLOSE_BUTTON_XPATH)).click();
	}
	
	public static void closeCookiesBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.COOKIES_XPATH)).click();
	}
	
	public static void aboutUsMenu(WebDriver driver) {
		driver.findElement(By.xpath(Constants.ABOUT_US_MENU_XPATH)).click();
	}
	
	public static void aboutUsBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.ABOUT_US_XPATH)).click();
	}
	
	/*
	public static void loginBtn(WebDriver driver) {
		driver.findElement(By.linkText("LOGIN")).click();
	}
	
	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.name("fullname")).sendKeys(username);
	}
	
	public static void inputPassword(WebDriver driver, String email) {
		driver.findElement(By.name("workemail")).sendKeys(email);
	}  */
	
	}


