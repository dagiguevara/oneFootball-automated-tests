package searchPageTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Pages.searchPage;
import junit.framework.Assert;
import testBase.localTestBase;

public class Search_Player extends localTestBase{
	
	searchPage search;
	
	/*
	 *  tests are currently failing because the search page doesn't work
	 *  assertion make it fail, since the search page doesn't get the text Messi
	 *  the test will pass when search page will be fixed
	 */
	
  @Test
  public void searchPlayer() {
	  search = new searchPage(driver);
	  search.selectSuggestedTeam();
	  search.searchPlayer("Messi");
	  String playerResult = driver.findElement(By.id("id")).getText();
	  Assert.assertTrue(playerResult.contains("Messi"));	
  }
}