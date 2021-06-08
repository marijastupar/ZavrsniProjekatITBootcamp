package objs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class MainPage {
	
	public static void shiftPlanningPageBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SHIFT_PLANNING_XPATH)).click();
	}
	
	public static String getText(WebDriver driver) {
		return driver.findElement(By.id("_topnavLabel")).getText();
	}
	
	public static void dashboardBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.DASHBOARD_XPATH)).click();
	}
	
	public static void timeClockBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.TIME_CLOCK_XPATH)).click();
	}
	
	public static void leaveBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.LEAVE_XPATH)).click();
	}
    
	public static void trainingeBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.TRAINING_XPATH)).click();
	}
	
	public static void staffBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
	}
	

	public static void payrollBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.PAYROLL_XPATH)).click();
	}
	
	public static void reportsBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.REPORTS_XPATH)).click();
	}
	
	public static void availabilityBtn(WebDriver driver) {
		driver.findElement(By.xpath(Constants.AVAILABILITY_XPATH)).click();;
	}
	
	public static String viewAvblText(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.VIEW_AVAILABILITY_XPATH)).getText();
	}
}
