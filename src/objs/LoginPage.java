package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static void loginBtn(WebDriver driver) {
		driver.findElement(By.linkText("LOGIN")).click();
	}
	
	public static void inputUsername(WebDriver driver, String email) {
		driver.findElement(By.name("email")).sendKeys(email);
	}

	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	} 
	
	public static void loginToMainPageBtn(WebDriver driver) {
		driver.findElement(By.name("login")).click();
	}

}
