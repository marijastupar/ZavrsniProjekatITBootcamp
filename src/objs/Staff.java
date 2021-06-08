package objs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Constants;

public class Staff {
	
	public static void addEmployeesBtn(WebDriver driver) {
		driver.findElement(By.id("act_primary")).click();
	}

	public static void inputFirstName(WebDriver driver, String firstName) {
		driver.findElement(By.className("_ns_fname")).sendKeys(firstName);
	}
	
	public static void inputLastName(WebDriver driver, String Lastname) {
		driver.findElement(By.className("_ns_lname")).sendKeys(Lastname);
	}
	
	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.className("_ns_email")).sendKeys(email);
	}
	
	public static void saveEmployeesBtn(WebDriver driver) {
		driver.findElement(By.id("_as_save_multiple")).click();
	}
	
	
	public static String  Employee(WebDriver driver, String name) {
		return driver.findElement(By.linkText(name)).getText();
	} 
	
	public static void  EmployeeBtn(WebDriver driver, String name) {
	 driver.findElement(By.linkText(name)).click();
	} 
	
	public static void editDetails(WebDriver driver) {
		driver.findElement(By.linkText("Edit Details")).click();
	}
	
	public static void changeFirstName(WebDriver driver, String firstname) {
	WebElement name = driver.findElement(By.id("first_name"));
	name.clear();
	name.sendKeys(firstname);
	}
	
	public static void uploadPicture(WebDriver driver, String path) {
		WebElement photo = driver.findElement(By.id("fileupload"));
		photo.sendKeys(path);
		
	}
	
	public static void updateBtn(WebDriver driver) {
		driver.findElement(By.name("update")).click();
	}
	
	public static String newEmployee(WebDriver driver, String firstName, String lastName) {
		return driver.findElement(By.linkText(firstName + " " + lastName)).getText();
	}
}

