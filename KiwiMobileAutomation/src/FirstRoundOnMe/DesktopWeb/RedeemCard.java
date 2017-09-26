package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

public class RedeemCard {

	private WebDriver driver;
	
	public RedeemCard(WebDriver driver){
		
	   this.driver= driver;
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
			status = Keywords.isElementPresent(element) && Keywords.isTextPresent("COBRA");
			//Keywords.click(element);
			System.out.println("Outlet Profile Name is:"+status);
		} catch (Exception e) {
		}

		return status;
	}
	
	
	public void enterRedeemCode() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().redeemCode(driver);
			Keywords.typeText(element, DriverSession.getTestCaseData().get("RedeemCode"));

			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Redeem Code enter successfully",
								"PASS", "Redeem Code should be enter");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("Redeem Code not enter successfully",
					"FAIL", "Redeem Code should be enter");
		}
	
	}
	
	
	public void redeemButton() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().redeembutton(driver);
			Keywords.isElementEnable(element);
			System.out.println("Redeem code is enabled");
			Keywords.click(element);
			
			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Redeem Code clicked successfully",
								"PASS", "Redeem Code should be Clicked");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("Redeem Code not clicked successfully",
					"FAIL", "Redeem Code should be clicked");
		}
	
	}
	
	
	public void redeemSuccess() {
		WebElement element;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().redeemsuccess(driver);
			Keywords.isElementEnable(element);
			System.out.println(" Ok redeemed successfuly");
			Keywords.click(element);
			
			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Redeem Code ok successfully",
								"PASS", "Redeem ok should be Clicked");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
			.teststepreporting("Redeem Ok not clicked successfully",
					"FAIL", "Redeem Ok should be clicked");
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
