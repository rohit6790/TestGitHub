package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.session.DriverSession;
import com.utilities.Keywords;

public class OutletFooter {

	private WebDriver driver;


	public OutletFooter(WebDriver driver){
		
	 this.driver=driver;
		
	}
	

	public void aboutUs() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().OutletAboutUs(driver);
			System.out.println("About us status..."+Keywords.isElementEnable(element));
			Thread.sleep(4);
			System.out.println("About us status..."+Keywords.isElementPresent(element));
			Keywords.click(element);
		    Keywords.waitUntilPageFullyLoaded(driver);
			String URL = driver.getCurrentUrl();
			System.out.println("Url is :"+ URL);
			Assert.assertEquals(URL, "http://staging.1stroundonme.com/outlet/about-us" );
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>About Us</b> click successfully",
								"PASS", "<b>About Us</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>About Us</b> successfully not click",
								"FAIL",
								"<b>About Us</b> should be click");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting(
							"Exception occurred. While clicking on the <b>About Us</b>",
							"FAIL", "<b>About us</b> should be click");
      }

	}
	
	

	public void howItWorks() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().OutletHowitworks(driver);
			System.out.println("How it Works status..."+Keywords.isElementEnable(element));
			Thread.sleep(4);
			System.out.println("How it Works status..."+Keywords.isElementPresent(element));
			Keywords.click(element);
			Keywords.waitUntilPageFullyLoaded(driver);
			String URL = driver.getCurrentUrl();
			System.out.println("Url is :"+ URL);
			Assert.assertEquals(URL, "http://staging.1stroundonme.com/outlet/how-it-works" );
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>How it Works</b> click successfully",
								"PASS", "<b>How it Works</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>How it Works</b> successfully not click",
								"FAIL",
								"<b>How it Works</b> should be click");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting(
							"Exception occurred. While clicking on the <b>How it Works</b>",
							"FAIL", "<b>How it Works</b> should be click");
      }

	}
	
	
	public void privacyPolicy() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().PrivacyPolicy(driver);
			System.out.println("Reset status..."+Keywords.isElementEnable(element));
			Thread.sleep(4);
			System.out.println("Reset button status..."+Keywords.isElementPresent(element));
			driver.getWindowHandle();
			Keywords.click(element);

			for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}
   
			String URL = driver.getCurrentUrl();
			System.out.println("Url is :"+ URL);
			Assert.assertEquals(URL, "http://staging.1stroundonme.com/outlet/privacy-policy" );
			   Thread.sleep(4);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>Privacy Policy</b> click successfully",
								"PASS", "<b>Privacy Policy</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<bPrivacy Policy</b> successfully not click",
								"FAIL",
								"<b>Privacy Policy</b> should be click");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting(
							"Exception occurred. While clicking on the <b>TPrivacy Policy</b>",
							"FAIL", "<b>Privacy Policy</b> should be click");
      }

			String parentHandle = null;
			driver.switchTo().window(parentHandle); // switch back to the original window

	}
	
	
	public void termsConditions() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().TermsConditions(driver);
			System.out.println("terms conditions status..."+Keywords.isElementEnable(element));
			Thread.sleep(4);
			System.out.println("terms conditions status..."+Keywords.isElementPresent(element));
			driver.getWindowHandle();
			Keywords.click(element);

			for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}

			String URL = driver.getCurrentUrl();
			System.out.println("Url is :"+ URL);
			Assert.assertEquals(URL, "http://staging.1stroundonme.com/outlet/terms-conditions" );
			 Thread.sleep(3);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>Terms and Conditions</b> click successfully",
								"PASS", "<b>Terms and Conditions</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>Terms and Conditionsy</b> successfully not click",
								"FAIL",
								"<b>Terms and Conditions</b> should be click");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting(
							"Exception occurred. While clicking on the <b>Terms and Conditions</b>",
							"FAIL", "<b>Terms and Conditions</b> should be click");
      }

			String parentHandle = null;
			driver.switchTo().window(parentHandle); // switch back to the original window
	}
}
	
	