package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

public class OutletLogin {

	private WebDriver driver;

	public OutletLogin(WebDriver driver) {

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
	
	public boolean loginStatus() {
		boolean status = false;
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletHeader(driver);
			Keywords.click(element);
			status = Keywords.isElementPresent(element) && Keywords.isTextPresent("COBRA");
			System.out.println("Outlet Profile Name is:"+status);
		} catch (Exception e) {
		}

		return status;
	}
	
	public void outletLogoutButton() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletLogout(driver);
			Keywords.click(element);
			System.out.println("Signed Out Successfully");

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Logout Button click successfully",
								"PASS", "Logout Button should be clicked");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Logout Button click Successfully</b>",
						"FAIL","Logout Button should be clicked");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While clicking <b>Log Out Button/b>",
							"FAIL", "<b>Outlet Logout Button</b> should be Clicked");
		}
	}
	
}
