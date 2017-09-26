package FirstRoundOnMe.DesktopWeb;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

import FirstRoundOnMe.DesktopWeb.Locators;

public class LoginScreen {

	private WebDriver driver;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignInLink() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().signInLink(driver);
			Keywords.click(element);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Sing In Link</b> click successfully",
								"PASS", "<b>Sing In Link</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Sing In Link</b> successfully not click",
								"FAIL", "<b>Sing In Link</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>Sing In Link</b>",
							"FAIL", "<b>Sing In Link</b> should be click");
		}
	}

	public boolean loginStatus() {
		boolean status = false;
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().signInLink(driver);
			status = Keywords.isElementPresent(element);
		} catch (Exception e) {
		}

		return status;
	}

	public void enterEmailAddress() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().userEmailAddress(driver);
			Keywords.typeText(element, DriverSession.getTestCaseData().get("Username"));

			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Email Address enter successfully",
								"PASS", "Email Address should be enter");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("Email Address not enter successfully",
					"FAIL", "Email Address should be enter");
		}
	}

	public void enterPass() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().loginPass(driver);
			Keywords.typeText(element, DriverSession.getTestCaseData().get("Password"));

			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Email Pass enter successfully",
								"PASS", "Email Pass should be enter");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("Email Pass not enter successfully",
					"FAIL", "Email Pass should be enter");
		}
	}

	public void submitSignIn() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().submitLogin(driver);
			Keywords.click(element);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>SingIn Button</b> click successfully",
								"PASS", "<b>SingIn Button</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>SingIn Button</b> successfully not click",
								"FAIL", "<b>SingIn Button</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>SingIn Button</b>",
							"FAIL", "<b>SingIn Button</b> should be click");
		}
	}

}