package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

public class EditOutlet {

	private WebDriver driver;

	public EditOutlet(WebDriver driver) {

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
	
	
	public void EditLink() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().EditProfile(driver);
			Keywords.isElementPresent(element);
			Keywords.click(element);

			if (DriverSession.getStepResult()){
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Outlet Edit click successfully",
								"PASS", "Outlet Edit should be clicked");
			} else
		DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Outlet Edit click Successfully</b>",
						"FAIL","Outlet Edit should be clicked");
			
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Exception occurred. While clicking <b>Outlet Edit/b>",
							"FAIL", "<b>Outlet Edit</b> should be Clicked");
		}

	}
	
	public void editName() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().outletName(driver);
			Keywords.clearEditField(element);
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
		}
	
	}
		public void editemail() {
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().outletEmail(driver);
                if (Keywords.isElementEnable(element) == false);
                System.out.println("Outlet email is not enabled");

				if (DriverSession.getStepResult()) {
					DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"<b>Outlet Email</b> Outlet Email is Disabled",
							"PASS", "<b>Outlet Email</b> should be Disabled");
				} else
					DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"<b>Outlet Email</b> Outlet Name is not Disbaled",
							"FAIL", "<b>Outlet Email</b> should be Disbaled");
			} catch (Exception e) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"Exception occurred. While clicking on Outlet Email <b>Outlet Email</b>",
						"FAIL", "<b>Outlet Email</b> should be Disbaled");
			}

		}
	
		public void outletEditContact() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().outletContact(driver);
				Keywords.clearEditField(element);
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
			
			}
	
		}
	
		public void editOutletImage() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				driver.findElement(By.id("file_upload")).sendKeys("/Users/kiwi/Test_Development/Wallpapers/bmwlogo.jpg");
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
			
			}

	
		}
		
		public void editOwnerName() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().ownerName(driver);
				Keywords.clearEditField(element);
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
		
		public void editResponsibleName() {
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
				;
			}

		}
		
		public void editOutletAddress() {	
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
				
			}

		}
		
		public void editOutletCountry() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().outletCountry(driver);
				Keywords.selectByVisibleText(element, "Czech Republic");
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

		public void editOutletState() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().outletState(driver);
				Keywords.selectByVisibleText(element, "Praha");
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

		public void editOutletCity() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().outletCity(driver);
				Keywords.clearEditField(element);
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
		
		public void editOutletZip() {
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
		
		public void editOutletWebsite() {
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
		
		public void editUpdateButton() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().OutletUpdatebutton(driver);
				Keywords.click(element);

				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance()
					.teststepreporting(
							"<b>Update Button/b> Clicked successfully",
							"PASS",
							"<b>Update Button</b> should be Clicked");
				} else
					DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"<b>Update Button</b> successfully not Clicked",
							"FAIL",
							"<b>Update button</b> should be Clciked");
			} catch (Exception e) {
				DriverSession
				.getLastExecutionReportingInstance()
				.teststepreporting(
						"Exception occurred. While Clicking <b>Update Button</b>",
						"FAIL", "<b>Update Button</b> should be Clicked");

			}

		}
		

	
}
