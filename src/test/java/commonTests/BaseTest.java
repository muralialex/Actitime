package commonTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import commonPages.BasePage;
//@Listeners(listeners_reports.Listener_Reporting.class)
public class BaseTest extends BasePage{
	BasePage basePage= null;
	WebDriver driver;
	
	
	@BeforeSuite 
	public void loginToApp() {
		basePage = new BasePage();
		basePage.openBrowser("Chrome");
		basePage.launchApp("https://online.actitime.com/cisco7/login.do");
		basePage.loginToApp("unique.muralistl@gmail.com", "QMMgaPp#");
		basePage.getWebDriverWait();
	}
	
	@AfterSuite 
	public void logOutToApp() {
		basePage.logoutFromApp();
		basePage.closeBrowser();
	}
	
}
