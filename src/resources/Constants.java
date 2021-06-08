package resources;

public class Constants {
	
	//home page
	public static final String HOME_URL = "https://www.humanity.com/";
	public static final String COOKIES_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button";
	public static final String ABOUT_US_MENU_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String ABOUT_US_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]";
	public static final String CLOSE_BUTTON_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	
	//main page
	//dasboard section
	public static final String DASHBOARD_PAGE_URL ="https://marijastupar.humanity.com/app/dashboard/";
	public static final String  DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	public static final String WALL_MESSAGE_XPATH = "*[@id=\"dash_messagewall_container\"]/div/div[1]/div/span";
	
	//shift planning section
	public static final String  SHIFT_PLANNING_XPATH  ="//*[@id=\"sn_schedule\"]/span";
	public static final String  SHIFT_PLANNING_URL ="https://marijastupar.humanity.com/app/staff/list/load/true/";
	// time clock section
	public static final String  TIME_CLOCK_XPATH  ="//*[@id=\"sn_timeclock\"]/span";
	public static final String  TIME_CLOCK_URL  = "https://marijastupar.humanity.com/app/timeclock/";
	
	//leave section
	public static final String  LEAVE_XPATH  ="//*[@id=\"sn_requests\"]/span";
	public static final String  LEAVE_URL  ="https://marijastupar.humanity.com/app/requests/vacation/";
	
	// training section
	public static final String  TRAINING_XPATH  = "//*[@id=\"sn_training\"]/span";
	public static final String  TRAINING_URL  = "https://marijastupar.humanity.com/app/training/";
	
	// staff section
	public static final String  STAFF_XPATH  = "//*[@id=\"sn_staff\"]/span";
	public static final String  STAFF_URL  = "https://marijastupar.humanity.com/app/staff/list/load/true/";
	public static final String NEW_EMPLOYEE_XPATH ="//*[@id=\"_cd_staff\"]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/div/table/tbody/tr[5]/td[1]/text()";
	// availability section
	public static final String  AVAILABILITY_XPATH  = "//*[@id=\"sn_availability\"]/span";
	public static final String VIEW_AVAILABILITY_XPATH = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div/div/div/div/div[2]/button/div/div";
	
	//payroll section
	public static final String  PAYROLL_XPATH  = "//*[@id=\"sn_payroll\"]/span";
	public static final String  PAYROLL_URL  = "https://marijastupar.humanity.com/app/payroll/scheduled-hours/";
	
	//reports section
		public static final String  REPORTS_XPATH  = "//*[@id=\"sn_reports\"]/span";
		public static final String  REPORTS_URL  = "https://marijastupar.humanity.com/app/reports/dashboard/";
	
		//settings 
		public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span";
		
		// profile settings
		public static final String SETTINGS_PROFILE_XPATH ="//*[@id=\"wrap_us_menu\"]/i";
}
