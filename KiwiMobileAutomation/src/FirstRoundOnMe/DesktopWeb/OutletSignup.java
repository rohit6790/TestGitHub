package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.session.DriverSession;
import com.utilities.Keywords;

public class OutletSignup {

	private WebDriver driver;

	public OutletSignup(WebDriver driver) {
		this.driver = driver;

	}

	public void clicksignuplink() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletsignuplink(driver);
			Keywords.click(element);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Sing up Link</b> click successfully",
						"PASS", "<b>Sing Up Link</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Sing up Link</b> successfully not click",
						"FAIL", "<b>Sing up Link</b> should be click");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While clicking on the <b>Sing In Link</b>",
					"FAIL", "<b>Sing up Link</b> should be click");
		}

	}

	public boolean signupStatus() {
		boolean status = false;
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().signuplink(driver);
			status = Keywords.isElementPresent(element);
		} catch (Exception e) {
		}

		return status;

	}

	@SuppressWarnings("unused")
	
	public void outletImage() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			// element =
			// Locators.getInstance().outletImage(driver).sendKeys("/Users/kiwi/Desktop/download.png");
			driver.findElement(By.id("file_upload")).sendKeys(
					"/Users/kiwi/Desktop/download.png");
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Image</b> Upload successfully",
						"PASS",
						"<b>Outlet Image</b> should be Uploaded");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Image</b> Upload successfully",
						"FAIL",
						"<b>Outlet Image</b> should be Uploaded");

		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While clicking on the <b>Upload button</b>",
					"FAIL", "<b>Upload button</b> should be click");
			;
		}

	}

	public void outletName() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletName(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletName"));

			if (DriverSession.getStepResult()) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Name</b> Outlet Name entered successfully",
						"PASS", "<b>Outlet Name</b> should be Entered");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Name</b> Outlet Name entered successfully",
						"FAIL", "<b>Outlet Name</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While clicking on Outlet Name <b>Outlet NAME</b>",
					"FAIL", "<b>Outlet Name</b> should be Entered");
			;
		}

	}

	public void outletEmail() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletEmail(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletEmail"));

			if (DriverSession.getStepResult()) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Email</b> Enter successfully",
						"PASS", "<b>Outlet Email</b> should be Entered");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Email</b> successfully not Enter",
						"FAIL", "<b>Outlet Email</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Email</b>",
					"FAIL", "<b>Outlet Email</b> should be Entered");
			;
		}

	}

	public void outletPassword() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletPassword(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletPassword"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Password</b> Enter successfully",
						"PASS",
						"<b>Outlet Password</b> should be Entered");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Password</b> successfully not Enter",
						"FAIL",
						"<b>Outlet Password</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Password</b>",
					"FAIL", "<b>Outlet Password</b> should be Entered");
			;
		}

	}

	public void outletConfirmPassword() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletConfirmP(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData()
					.get("OutletConfirmPassword"));

			if (DriverSession.getStepResult()) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet ConfirmPassword</b> Enter successfully",
						"PASS",
						"<b>Outlet ConfirmPassword</b> should be Entered");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Email</b> successfully not Enter",
						"FAIL",
						"<b>Outlet ConfirmPassword</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet ConfirmPassword</b>",
					"FAIL",
					"<b>Outlet ConfirmPassword</b> should be Entered");
			;
		}

	}

	public void outletContact() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletContact(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletContact"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Contact</b> Enter successfully",
						"PASS",
						"<b>Outlet Contact</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Contact</b> successfully not Enter",
						"FAIL",
						"<b>Outlet Contact</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Contact</b>",
					"FAIL", "<b>Outlet Contact</b> should be Entered");
			;
		}

	}

	public void ownerName() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().ownerName(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OwnerName"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Owner Name</b> Enter successfully", "PASS",
						"<b>Owner Name</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Owner Name</b> successfully not Enter",
						"FAIL", "<b>Owner Name</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Owner Name</b>",
					"FAIL", "<b>Owner Name</b> should be Entered");
			
		}

	}

	public void responsibleName() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().responsiblePerson(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("ResponsiblePerson"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting("<b>Responsible Person</b> Enter successfully","PASS",
						"<b>Responsible Person</b> should be Entered");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Responsible Person</b> successfully not Enter",
						"FAIL",
						"<b>Responsible Person</b> should be Entered");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Res</b>",
					"FAIL", "<b>Owner Name</b> should be Entered");
		
		}

	}

	public void outletAddress() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletAddress(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletAddress"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Address</b> Enter successfully",
						"PASS",
						"<b>Outlet Address</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Address</b> successfully not Enter",
						"FAIL",
						"<b>Outlet Address</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Address</b>",
					"FAIL", "<b>Outlet Address</b> should be Entered");
			;
		}

	}

	public void outletCountry() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletCountry(driver);
			Keywords.selectByVisibleText(element, "Australia");
			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting("Country select successfully",
						"PASS", "Country should be selected");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("Country not select successfully",
					"FAIL", "Country should be selected");

		}
	}

	public void outletState() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletState(driver);
			Keywords.selectByVisibleText(element, "Castle Hill");
			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting("State select successfully", "PASS",
						"State should be selected");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("State not select successfully", "FAIL",
					"State should be selected");

		}
	}

	public void outletCity() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletCity(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletCity"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet City</b> Enter successfully", "PASS",
						"<b>Outlet City</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet City</b> successfully not Enter",
						"FAIL", "<b>Outlet City</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet City</b>",
					"FAIL", "<b>Outlet City</b> should be Entered");

		}
	}

	public void outletZip() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletZip(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletZip"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Zip</b> Enter successfully", "PASS",
						"<b>Outlet Zip</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Zip</b> successfully not Enter",
						"FAIL", "<b>Outlet Zip</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Zip</b>",
					"FAIL", "<b>Outlet Zip</b> should be Entered");

		}
	}

	public void outletWebsite() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletWebsite(driver);
			Keywords.typeText(element,
					DriverSession.getTestCaseData().get("OutletWebsite"));

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Website/b> Enter successfully",
						"PASS",
						"<b>Outlet Website</b> should be Entered");
			} else
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Website</b> successfully not Enter",
						"FAIL",
						"<b>Outlet Website</b> should be Entered");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Website</b>",
					"FAIL", "<b>Outlet Website</b> should be Entered");

		}
	}

	public void outletTerms() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletTerms(driver);
			Keywords.click(element);

			if (DriverSession.getStepResult()) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Terms/b> Checked successfully",
						"PASS", "<b>Outlet Terms</b> should be Checked");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Outlet Terms</b> successfully not Checked",
						"FAIL", "<b>Outlet Terms</b> should be Checked");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Outlet Terms</b>",
					"FAIL", "<b>Outlet Website</b> should be Checked");

		}
	}

	public void outletSignupbutton() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletSignupbutton(driver);
			Keywords.click(element);

			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Signup Button/b> Checked successfully",
						"PASS",
						"<b>Signup Button</b> should be Checked");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Signup Button</b> successfully not Checked",
						"FAIL",
						"<b>Signup button</b> should be Checked");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. While Entering <b>Signup Button</b>",
					"FAIL", "<b>Signup Button</b> should be Checked");

		}

	}
	
	public void outletSuccess() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			Thread.sleep(4);
			element = Locators.getInstance().outletSuccess(driver);
			//Success message for successful Signup
			if(Keywords.isElementPresent(element) && Keywords.getText(element).equalsIgnoreCase("Congratulation! Your account has been created successfully and waiting for admin approval."));
			System.out.println("Message is:"+"Congratulation! Your account has been created successfully and waiting for admin approval.");
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Signup Success</b> Signed up successfully",
						"PASS",
						"<b>Signup Success</b> Signup should be checked");
			} else
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"<b>Signup Success</b> Signned up not successful",
						"FAIL",
						"<b>Signup Success</b> Signup should be checked");
		} catch (Exception e) {
			DriverSession
			.getLastExecutionReportingInstance()
			.teststepreporting(
					"Exception occurred. After Signup <b>Signup success</b>",
					"FAIL", "<b>Signup Success</b> should be Signed Up");

		}
	
	
	}
	

}