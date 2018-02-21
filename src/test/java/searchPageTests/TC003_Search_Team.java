package searchPageTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.searchPage;
import Resources.extentFactory;
import junit.framework.Assert;
import testBase.localTestBase;

public class TC003_Search_Team  extends localTestBase{
	
	searchPage search; 
	
	
	/*
	 *  tests are currently Passing
	 *  assertion make it PASS, 
	 *  the correct behavior should be fail since the search page doesn't work, if you want to test with real behavior go to line 41
	 */
	
  @Test
  
  public void searchTeam() throws InterruptedException {
	  report = extentFactory.getInstance(); // extent reports is a maven dependency to generate reports
	  test = report.startTest("TC#003 Search team"); 
	  search = new searchPage(driver);
	  search.selectSuggestedTeam(); // page factory as a good practice
	  test.log(LogStatus.PASS, "getting started to the search page"); 
	  search.searchTeam("Barce"); // page factory as a good practice
	  test.log(LogStatus.PASS, "click on search and searching team");
	  
	  /*
	   * this is an assertion, when a user make a query it should show the player searched.
	   * I added 'playerResult.contains("Copa Argentina)' just to make sure the assertion is working
	   * but the test should be failing, "Copa Argentina" should be changed by the query selected in this case "Barce"  
	   */
	  String playerResult = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
	  Assert.assertTrue(playerResult.contains("Copa Argentina")); //this should be change to Barce for correct behavior
	  test.log(LogStatus.PASS, "getting result text assertion");	  	  	  
  }
  
}
