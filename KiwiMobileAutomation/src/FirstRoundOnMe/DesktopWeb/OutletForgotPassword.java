package FirstRoundOnMe.DesktopWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.session.DriverSession;
import com.utilities.Keywords;

public class OutletForgotPassword {
	
	private WebDriver driver;
	
	public OutletForgotPassword(WebDriver driver) {

		this.driver=driver;
	}
		public void ForgotLink() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().OutletForgot(driver);
				System.out.println("Forgot link status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
			    Keywords.waitUntilPageFullyLoaded(driver);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Forgot Link</b> click successfully",
									"PASS", "<b>Forgot Link</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Forgot Link</b> successfully not click",
									"FAIL",
									"<b>Forgot Link</b> should be click");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Forgot Link</b>",
								"FAIL", "<b>Forgot Link</b> should be click");
	      }

		}
		
		public void forgotTitle() {
			WebElement element = null;
			String expectedTitle = "";
			String actualTitle = "";
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().ForgotTitle(driver);
				expectedTitle = "Forgot Password?";
				actualTitle = Keywords.getText(element).trim();
				System.out.println("Title is :" + actualTitle);

				if (DriverSession.getStepResult()) {
					DriverSession
							.getLastExecutionReportingInstance()
							.teststepreporting(
									"<b>Forgot Title</b> Forgot Tile is",
									"PASS",
									"<b>Forgot Title</b> Should show Forgot Title");

				} else
					DriverSession
							.getLastExecutionReportingInstance()
							.teststepreporting(
									"<b>Forgot Title/b>Forgot not found",
									"FAIL",
									"<b>Forgot Title</b>should get Forgot Title");

			} catch (Exception e) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"Exception occurred. While checking Forgot Title <b>Forgot Title</b>",
								"FAIL",
								"<b>Forgot Title</b> should show Forgot Title");

			}
		}
		
		
		public void forgotButton() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().forgotbutton(driver);
				System.out.println("Forgot button status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
			    Keywords.waitUntilPageFullyLoaded(driver);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Forgot Button</b> click successfully",
									"PASS", "<b>Forgot Butto</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Forgot Butto</b> successfully not click",
									"FAIL",
									"<b>Forgot Butto</b> should be click");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Forgot Button</b>",
								"FAIL", "<b>Forgot Button</b> should be click");
	      }

		}

		public void forgotError() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().emailError(driver);
				System.out.println("Email Error status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
			    Keywords.waitUntilPageFullyLoaded(driver);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Email Error</b> Found successfully",
									"PASS", "<b>Email Error</b> should be Found");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Email Error</b> successfully not Found",
									"FAIL",
									"<b>Email Error</b> should be Found");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Email Error</b>",
								"FAIL", "<b>Email Error</b> should be Found");
	      }

		}
		
		
		public void outletForgotEmail() {
			WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().outletEmail(driver);
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
		
		public void ForgotSuccessTitle() {
			WebElement element = null;
			String expectedTitle = "";
			String actualTitle = "";
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().forgotSuccess(driver);
				expectedTitle = "Email Sent Successfully";
				actualTitle = Keywords.getText(element).trim();
				System.out.println("Title is :" + actualTitle);

				if (DriverSession.getStepResult()) {
					DriverSession
							.getLastExecutionReportingInstance()
							.teststepreporting(
									"<b>Forgot Success</b> Forgot success Title is",
									"PASS",
									"<b>Forgot Success</b> Should show Forgot success Title");

				} else
					DriverSession
							.getLastExecutionReportingInstance()
							.teststepreporting(
									"<b>Forgot Success/b>Forgot success not found",
									"FAIL",
									"<b>Forgot Success</b>should get Forgot success Title");

			} catch (Exception e) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"Exception occurred. While checking Forgot success Title <b>Forgot success Title</b>",
								"FAIL",
								"<b>Forgot success Title</b> should show Forgot success Title");

			}
		}
		
		public void forgotOkay() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().forgotOkay(driver);
				System.out.println("Forgot Okay status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
			    Keywords.waitUntilPageFullyLoaded(driver);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Okay Button</b>Click successfully",
									"PASS", "<b>Okay Button</b> should be Clicked");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Okay Button</b> successfully not Clicked",
									"FAIL",
									"<b>Okay Button</b> should be Clicked");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Okay Button</b>",
								"FAIL", "<b>Okay button</b> should be Clicked");
	      }

			  driver.navigate().to("https://www.mailinator.com/");
			
			
			
		}
		
		
		public void mailinatorEmail(){
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().mailinatorId(driver);
				System.out.println("Mailinator status..."+Keywords.isElementEnable(element));
				Keywords.typeText(element,
						DriverSession.getTestCaseData().get("MailinatorEmail"));

				if (DriverSession.getStepResult()){
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Email Address enter successfully",
									"PASS", "Email Address should be enter");
				} else
			DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Email Address enter successfully</b>",
							"FAIL","Email Address should be enter");
				
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Exception occurred. While entering email <b>Mailinator Email</b>",
								"FAIL", "<b>Mailinator Email</b> should be Entered");
			}
			
			driver.navigate().to("https://www.mailinator.com/v2/inbox.jsp?zone=public&query=levis123");

		}
		

		public void mailinatorButton() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().mailinatorbutton(driver);
				System.out.println("Go button status..."+Keywords.isElementEnable(element));
			   // element.sendKeys(Keys.ENTER);
				Keywords.click(element);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Go Button</b>Click successfully",
									"PASS", "<b>Go Button</b> should be Clicked");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Go Button</b> successfully not Clicked",
									"FAIL",
									"<b>Go Button</b> should be Clicked");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Go Button</b>",
								"FAIL", "<b>Go button</b> should be Clicked");
	      }
			
			
			Keywords.waitForPageFullyLoaded(driver);
			
			
		}
		public void mailinatorInbox() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().mailinatorinbox(driver);
				System.out.println("inbox mail status..."+Keywords.isElementEnable(element));
				Keywords.click(element);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Inbox</b>Click successfully",
									"PASS", "<b>Inbox</b> should be Clicked");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Inbox</b> successfully not Clicked",
									"FAIL",
									"<b>Inbox</b> should be Clicked");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>Inbox</b>",
								"FAIL", "<b>Inbox</b> should be Clicked");
	      }
			
		}
		
		public void mailinatorReset() {
			WebElement iFrame = null;
			WebElement element=null;
			try {
				Keywords.waitForPage(driver);
				iFrame = Locators.getInstance().mailinatorReset(driver);
				System.out.println("Reset button status..."+Keywords.isElementEnable(iFrame));
				System.out.println("Reset button status..."+Keywords.isElementPresent(iFrame));
				Thread.sleep(2);
				driver.switchTo().frame(iFrame);
				element = driver.findElement(By.xpath("html/body/div/div[2]/p[3]/a"));
				Keywords.click(element);

				for (String winHandle : driver.getWindowHandles()) {
				    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
				}

				String URL = driver.getCurrentUrl();
				System.out.println("Url is :"+ URL);
				   Thread.sleep(4);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>Reset Button</b> click successfully",
									"PASS", "<b>Reset Button</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<bRESET BUTTON</b> successfully not click",
									"FAIL",
									"<b>RESET BUTTONy</b> should be click");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>RESET BUTTON</b>",
								"FAIL", "<b>RESET BUTTON</b> should be click");
	      }
		}	
			public void resetPasswordl(){
				WebElement element = null;
				try {
					Keywords.waitForPage(driver);
					element = Locators.getInstance().outletPassword(driver);
					System.out.println("New Password status..."+Keywords.isElementEnable(element));
					Keywords.typeText(element,
							DriverSession.getTestCaseData().get("OutletNewPassword"));

					if (DriverSession.getStepResult()){
						DriverSession.getLastExecutionReportingInstance()
								.teststepreporting("New Password enter successfully",
										"PASS", " New Password should be enter");
					} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>New Password not enter successfully</b>",
								"FAIL","New Password should be enter");
					
				} catch (Exception e) {
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Exception occurred. While entering New Password <b>New Password </b>",
									"FAIL", "<b>New Password </b> should be Entered");
				}
			
			}
				public void resetConfirmPasswordl(){
					WebElement element = null;
					try {
						Keywords.waitForPage(driver);
						element = Locators.getInstance().outletConfirmP(driver);
						System.out.println("Confirm Password status..."+Keywords.isElementEnable(element));
						Keywords.typeText(element,
								DriverSession.getTestCaseData().get("OutletConfirmPassword"));

						if (DriverSession.getStepResult()){
							DriverSession.getLastExecutionReportingInstance()
									.teststepreporting("Confirm Password enter successfully",
											"PASS", "Confirm Password should be enter");
						} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Confirm Password not  enter successfully</b>",
									"FAIL","Confirm Password should be enter");
						
					} catch (Exception e) {
						DriverSession.getLastExecutionReportingInstance()
								.teststepreporting("Exception occurred. While entering Confirm Password <b>Confirm Password </b>",
										"FAIL", "<b>Confirm Password </b> should be Entered");
					}
				
				}
					public void resetPasswordlButton(){
						WebElement element = null;
						try {
							Keywords.waitForPage(driver);
							element = Locators.getInstance().ResePassword(driver);
							System.out.println("Reset Button status..."+Keywords.isElementEnable(element));
							Keywords.click(element);

							if (DriverSession.getStepResult()){
								DriverSession.getLastExecutionReportingInstance()
										.teststepreporting("Reset Button click  successfully",
												"PASS", "Reset Button should be clicked");
							} else
						DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Reset Button not click  successfully</b>",
										"FAIL","Reset Button should be clicked");
							
						} catch (Exception e) {
							DriverSession.getLastExecutionReportingInstance()
									.teststepreporting("Exception occurred. While clicking <b>Reset BUtton </b>",
											"FAIL", "<b>Reset Button </b> should be Clicked");
						}
					
			
	
		
	}
}
	
	
