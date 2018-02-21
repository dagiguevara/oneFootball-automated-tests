package searchPageTests;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Pages.searchPage;
import junit.framework.Assert;
import testBase.localTestBase;

public class Valid_Search extends localTestBase {
	
	searchPage search;
	
	/*
	 *  tests are currently failing because the search page doesn't work
	 *  assertion make it fail, since the search page doesn't get the text Messi
	 *  the test will pass when search page will be fixed
	 */
  @Test
  public void validSearch() throws InterruptedException {
	  search = new searchPage(driver);
	  search.selectSuggestedTeam();
	  search.searchPlayer("Messi");
	  String playerResult = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
	  Assert.assertTrue(playerResult.contains("Copa Argentina"));
	  //Assert.assertTrue(playerResult.contains("Messi"));	
	  
  }
  
}
