package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

public class CustomizeEmail {
private WebDriver driver;
	
	public CustomizeEmail(WebDriver driver) {

		this.driver=driver;
	}
	

	public void outletEmail() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletLoginid(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletEmail"));

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Email Address enter successfully",
								"PASS", "Email Address should be enter");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Email Address enter successfully</b>",
						"FAIL","Email Address should be enter");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While entering email <b>Outlet Email</b>",
							"FAIL", "<b>Outlet Email</b> should be Entered");
		}

	}

	public void outletPassword() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletLoginPass(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletPassword"));

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Password enter successfully",
								"PASS", "Outlet Password should be enter");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Password enter successfully</b>",
						"FAIL","Password should be enter");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While entering password <b>Outlet Password</b>",
							"FAIL", "<b>Outlet Password</b> should be Entered");
		}

	}
	
	
	public void outletSignInButton() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletSignInbutton(driver);
			Keywords.isElementPresent(element);
			Keywords.click(element);

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Sign In Button click successfully",
								"PASS", "SignIn Button should be clicked");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Sign In Button click Successfully</b>",
						"FAIL","SignIn Button should be clicked");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While clicking <b>Sign In Button/b>",
							"FAIL", "<b>Outlet SignIn Button</b> should be Clicked");
		}

	}
	
	public boolean loginStatus() {
		boolean status = false;
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletHeader(driver);
			Keywords.click(element);
			status = Keywords.isElementPresent(element) && Keywords.isTextPresent("Levis");
			System.out.println("Outlet Profile Name is:"+status);
		} catch (Exception e) {
		}

		return status;
	}
	
	
	
		public void customizeEmail() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().CustomizeEmail(driver);
				System.out.println("Customize email link status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
			    Keywords.waitUntilPageFullyLoaded(driver);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Customize Email Link</b> click successfully",
									"PASS", "<b>Customize Email Link</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Customize Email Link</b> successfully not click",
									"FAIL",
									"<b>Customize Email Link</b> should be click");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Customize Email Link</b>",
								"FAIL", "<b>Customize Link</b> should be click");
	      }

		}
		

		public void editEmail() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().EditEmail(driver);
				System.out.println("Edit button status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
			    Keywords.waitUntilPageFullyLoaded(driver);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Edit button</b> click successfully",
									"PASS", "<b>Edit button</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Edit button</b> successfully not click",
									"FAIL",
									"<b>Edit button</b> should be click");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Edit button</b>",
								"FAIL", "<b>Edit button</b> should be click");
	      }

		}
		
		public void textEditor() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().Editor(driver);
				System.out.println("ENter Text status..."+Keywords.isElementEnable(element));
				Keywords.typeText(element,
						DriverSession.getTestCaseData().get("OutletMessage"));

				if (DriverSession.getStepResult()){
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Password enter successfully",
									"PASS", "Outlet Password should be enter");
				} else
			DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Password enter successfully</b>",
							"FAIL","Password should be enter");
				
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Exception occurred. While entering password <b>Outlet Password</b>",
								"FAIL", "<b>Outlet Password</b> should be Entered");
			}

		}
		

		public void customizeOutletImage() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				// element =
				// Locators.getInstance().outletImage(driver).sendKeys("/Users/kiwi/Desktop/download.png");
				driver.findElement(By.id("mceu_10")).sendKeys(
						"/Users/kiwi/Desktop/download.png");
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance()
					.teststepreporting(
							"<b>Outlet Editor Image</b> Upload successfully",
							"PASS",
							"<b>Outlet Editor Image</b> should be Uploaded");
				} else
					DriverSession.getLastExecutionReportingInstance()
					.teststepreporting(
							"<b>Outlet Editor Image</b> Upload successfully",
							"FAIL",
							"<b>Outlet Editor Image</b> should be Uploaded");

			} catch (Exception e) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"Exception occurred. While clicking on the <b>Upload button</b>",
						"FAIL", "<b>Upload button</b> should be click");
				
			}

		}
		
		
}
