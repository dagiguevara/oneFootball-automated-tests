package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Resources.extentFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import testBase.localTestBase;

 

public class searchPage {
	
	AndroidDriver driver;
	
	/* favorite Team  and get Started elements are not part of search Page, it's added to simplify the assignment,
	 *  as a good practice it should be in separate page model
	
	 * this is a implementation of Page Factory, following the best practices of test automation, for easy maintaining and have a clean code
	 */
  
	@FindBy (id = "de.motain.iliga:id/onboarding_no_favorite_team") 
	WebElement favoriteTeam;
	
	@FindBy (id = "de.motain.iliga:id/onboarding_follow_competitions_button_get_started")
	WebElement getStarted;
	
	@FindBy (id = "de.motain.iliga:id/action_search")
	WebElement searchButton;
	
	@FindBy (id = "android:id/button2")
	WebElement dismissUpdate;
	
	@FindBy (id = "de.motain.iliga:id/search_src_text")
	WebElement searchInput;
	
	/*
	 this is a constructor to init PageFactory
	 */
	
	public searchPage(AndroidDriver<AndroidElement> driver2){
        this.driver = driver2;
        PageFactory.initElements(driver2, this);
    }
	
	
	public void selectSuggestedTeam() throws InterruptedException {	
		try{
			favoriteTeam.click();
			   
	 
		}catch (Exception e){
			dismissUpdate.click();
			favoriteTeam.click();
	        }
		
		getStarted.click();
			
	}
  
	public void searchPlayer(String playerName) {
		dismissUpdate.click();
		searchButton.click();
		dismissUpdate.click();
		searchInput.sendKeys(playerName);
		
	  
  }
	
	public void searchTeam(String teamName) {
		dismissUpdate.click();
		searchButton.click();
		dismissUpdate.click();
		searchInput.sendKeys(teamName);
	  
  }
	public void searchCompetition(String competitionName) {
		dismissUpdate.click();
		searchButton.click();
		dismissUpdate.click();
		searchInput.sendKeys(competitionName);
	  
  }
}
