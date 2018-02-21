package testBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class localTestBase {
	
	 public AndroidDriver<AndroidElement> driver;
	
	/*
	 * this class will init all the tests for new users
	 */
	  @BeforeMethod (alwaysRun=true)
         public void localTestBase() throws MalformedURLException, InterruptedException {
	     File appDir = new File("/Users/donaldguevara/Desktop"); //set the path of the apk file 
	     File app = new File(appDir, "app-qa-rc-test.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("device","Android");
	     capabilities.setCapability("deviceName","Galaxy A5 (2016)");
	     capabilities.setCapability("platformName","Android");
	     capabilities.setCapability("platformVersion", "7.0");
	     capabilities.setCapability("appPackage", "de.motain.iliga");
	     capabilities.setCapability("appActivity", "de.motain.iliga.activity.FastLaunchSplashScreenActivity");
	     capabilities.setCapability("app", app.getAbsolutePath()); 
	     driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	          
	     
  }
	  @AfterMethod(alwaysRun=true)
	  public void tearDown() throws Exception {
	  driver.quit();

	  }
}
