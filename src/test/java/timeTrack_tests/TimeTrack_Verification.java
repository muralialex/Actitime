package timeTrack_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonTests.BaseTest;
import timeTrackPages.TimePack_commonPage;

//@Listeners(listeners_reports.Listener_Reporting.class)
public class TimeTrack_Verification extends BaseTest{


	TimePack_commonPage timePack_commonPage= null;
	
	@BeforeClass
	public void timeTrackBase() {
		timePack_commonPage= new TimePack_commonPage();
		timePack_commonPage.clickOnTimeTrack();
	}
	
	@Test
	public void applyTask() {
		timePack_commonPage.clickOnTimeTrack_Submodule("Enter Time-Track");
		timePack_commonPage.applyTask();
	}
}
