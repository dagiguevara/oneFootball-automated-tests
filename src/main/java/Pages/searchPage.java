package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class searchPage {
	
	AndroidDriver driver;
	
	/* favorite Team  and get Started elements are not part of search Page, it's added to simplify the assigment,
	 as a good practice it should in separate page model
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
		favoriteTeam.click();
		getStarted.click();
	
		
	}
  
	public void searchPlayer(String playerName) {
		dismissUpdate.click();
		searchButton.click();
		dismissUpdate.click();
		searchInput.sendKeys(playerName);
	  
  }
	
	public void searchTeam(String teamName) {
		searchButton.click();
		searchInput.sendKeys(teamName);
	  
  }
	public void searchCompetition(String competitionName) {
		searchButton.click();
		searchInput.sendKeys(competitionName);
	  
  }
}
