package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

public class OutletChangePassword {
	private WebDriver driver;

	public OutletChangePassword(WebDriver driver) {

		this.driver = driver;

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
	
	
	public void outletHeader() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().Headerdropdown(driver);
			Keywords.isElementPresent(element);
			Keywords.click(element);

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Outlet Header click successfully",
								"PASS", "Outlet Header should be clicked");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Outlet Header click Successfully</b>",
						"FAIL","Outlet Header should be clicked");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While clicking <b>Outlet Header/b>",
							"FAIL", "<b>Outlet Header</b> should be Clicked");
		}

	}
	
	
	public void changePasswordlink() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().changePasswordLink(driver);
			Keywords.isElementPresent(element);
			Keywords.click(element);

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Outlet Change Password click successfully",
								"PASS", "Outlet Change Passwordshould be clicked");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Outlet Change Password click Successfully</b>",
						"FAIL","Outlet Change Password should be clicked");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While clicking <b>Outlet Change Password/b>",
							"FAIL", "<b>Outlet Change Password</b> should be Clicked");
		}
	}
	
		public void outletOldPassword() {
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().OldPassword(driver);
				Keywords.typeText(element,
						DriverSession.getTestCaseData().get("OutletOldPassword"));

				if (DriverSession.getStepResult()){
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Old Password enter successfully",
									"PASS", "Old Password should be enter");
				} else
			DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Old Password enter successfully</b>",
							"FAIL","Old Password should be enter");
				
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Exception occurred. While entering old password <b>Outlet Old Password</b>",
								"FAIL", "<b>Outlet Old Password</b> should be Entered");
			}

		}

		public void outletNewPassword() {
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().NewPassword(driver);
				Keywords.typeText(element,
						DriverSession.getTestCaseData().get("OutletNewPassword"));

				if (DriverSession.getStepResult()){
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("New Password enter successfully",
									"PASS", "New Password should be enter");
				} else
			DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>New Password enter successfully</b>",
							"FAIL","New Password should be enter");
				
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Exception occurred. While entering new password <b>Outlet New Password</b>",
								"FAIL", "<b>Outlet New Password</b> should be Entered");
			}

		}
		
		
		public void outletConfirmPassword() {
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().ConfirmPassword(driver);
				Keywords.typeText(element,
						DriverSession.getTestCaseData().get("OutletConfirmPassword"));

				if (DriverSession.getStepResult()){
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Confirm Password enter successfully",
									"PASS", "Confirm Password should be enter");
				} else
			DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Confirm Password enter successfully</b>",
							"FAIL","Confirm Password should be enter");
				
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Exception occurred. While entering confirm password <b>Outlet Confirm Password</b>",
								"FAIL", "<b>Outlet Confirm Password</b> should be Entered");
			}

		}
		
		public void updatePasswordButton() {
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().UpdatePassword(driver);
				Keywords.isElementPresent(element);
				Keywords.click(element);
				Thread.sleep(3);

				if (DriverSession.getStepResult()){
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Update Password Button click successfully",
									"PASS", " Update Password Button should be clicked");
				} else
			DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Update Password Button click Successfully</b>",
							"FAIL","Update Password Button should be clicked");
				
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Exception occurred. While clicking <b>Update Password Button/b>",
								"FAIL", "<b>OUpdate Password Butto<n/b> should be Clicked");
			}

		}
		
		
	}
