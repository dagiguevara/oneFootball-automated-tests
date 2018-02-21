package searchPageTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Pages.searchPage;
import Resources.extentFactory;
import junit.framework.Assert;
import testBase.localTestBase;

public class TC002_invalid_Search  extends localTestBase{
	
	searchPage search;
	
	
	
  @Test
  public void Invalid() throws InterruptedException {
	  report = extentFactory.getInstance(); // extent reports is a maven dependecy to generate reports
	  test = report.startTest("TC#002 Invalid Search");
	  search = new searchPage(driver); // page factory as a good practice
	  search.selectSuggestedTeam(); // page factory as a good practice
	  test.log(LogStatus.PASS, "getting started to the search page");
	  search.searchPlayer("xabi"); // page factory as a good practice
	  test.log(LogStatus.PASS, "sending an empty query");
  }
}
