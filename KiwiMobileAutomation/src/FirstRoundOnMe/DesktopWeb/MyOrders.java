package FirstRoundOnMe.DesktopWeb;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.session.DriverSession;
import com.utilities.Keywords;

public class MyOrders {
	private WebDriver driver;

	public MyOrders(WebDriver driver) {
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
			Keywords.typeText(element,DriverSession.getTestCaseData().get("Username"));

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
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("Password"));

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
			Thread.sleep(4);
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
	
	
	public void headerprofile() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().headerLink(driver);
			Keywords.click(element);
			Thread.sleep(4);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Header Link</b> click successfully",
								"PASS", "<b>Header Link</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Header Link</b> successfully not click",
								"FAIL", "<b>Header Link</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>Header Link</b>",
							"FAIL", "<b>Header Link</b> should be click");
		}
	}
	

	 public void myorders() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().myOrders(driver);
			Keywords.click(element);
			Thread.sleep(4);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>My Orders</b> click successfully",
								"PASS", "<b>My Orders</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>My Orders</b> successfully not click",
								"FAIL", "<b>My Orders</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>My Orders</b>",
							"FAIL", "<b>My Orders</b> should be click");
		}
	}
	
	

	 public void emailcheckbox() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().emailcheckbox(driver);
			Keywords.click(element);
			Thread.sleep(2);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Email Checkbox</b> click successfully",
								"PASS", "<b>Email checkbox</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Email checkbox</b> successfully not click",
								"FAIL", "<b>Email checkbox</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>Email checkbox</b>",
							"FAIL", "<b>Email checkbox</b> should be click");
		}
	}

	 public void enteremail() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().enteremail(driver);
			Keywords.typeText(element,DriverSession.getTestCaseData().get("SenderEmail"));
			Thread.sleep(2);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Email Textbox</b> Enter successfully",
								"PASS", "<b>Email Textbox</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Email Textbox</b> successfully not entered",
								"FAIL", "<b>Email Textbox</b> should be entered");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>Email textbox</b>",
							"FAIL", "<b>Email Textbox</b> should be entered");
		}
	}
	

	 public void entermessage() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().entermessage(driver);
			Keywords.typeText(element,DriverSession.getTestCaseData().get("Sendermessage"));
			Thread.sleep(2);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Message Textbox</b> Enter successfully",
								"PASS", "<b>Message Textbox</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Message Textbox</b> successfully not entered",
								"FAIL", "<b>Message Textbox</b> should be entered");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>Message textbox</b>",
							"FAIL", "<b>Message Textbox</b> should be entered");
		}
	}

	 public void sendbutton() {
		 List<WebElement> elementList;
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				elementList = Locators.getInstance().clicksend(driver);
				Keywords.click(elementList.get(0));
				Thread.sleep(5000);
				/*Keywords.acceptAlert();
				Thread.sleep(3);*/
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting(
									"<b>Send button</b> click successfully",
									"PASS", "<b>Send button</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting(
							"<b>Send button</b> successfully not click",								"FAIL", "<b>Send button</b> should be click");
			    } catch (Exception e) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"Exception occurred. While clicking on the <b>Send button</b>",
								"FAIL", "<b>Send button</b> should be click");
				
			}
		}
}