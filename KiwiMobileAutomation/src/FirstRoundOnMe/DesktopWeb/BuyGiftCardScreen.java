package FirstRoundOnMe.DesktopWeb;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.session.DriverSession;
import com.utilities.Keywords;

public class BuyGiftCardScreen {

	private WebDriver driver;

	public BuyGiftCardScreen(WebDriver driver) {
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

	public void clickOnGiftCardLink() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().giftcardlink(driver);
			Keywords.click(element);
			if (DriverSession.getStepResult()) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Gift Card Link</b> click successfully",
								"PASS", "<b>Gift Card Link</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>Gift Card Link Link</b> successfully not click",
								"FAIL",
								"<b>Gift Card Link Link</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on the <b>Sing In Link</b>",
							"FAIL", "<b>Gift Card Link</b> should be click");
		}

	}

	public void selectOcassion() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().occasion(driver);
			Keywords.selectByVisibleText(element, "Happy Holidays");
			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Occasion select successfully",
								"PASS", "Ocassion should be selected");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Ocassion not select successfully",
							"FAIL", "Ocassion should be selected");

		}
	}

	public void chooseTheme() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().cardtheme(driver);
			Keywords.click(element);
			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("CardTheme select successfully",
								"PASS", "CardTheme should be selected");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("CardTheme not select successfully",
							"FAIL", "CardTheme should be selected");

		}
	}

	public void proceedbutton() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().proceedbutton(driver);
			if (Keywords.isElementEnable(element) == false);
			System.out.println("Proceed Button is not enabled");

			if (DriverSession.getStepResult())
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Proceed button is not Enabled",
								"PASS", "Proceed button should not be Enabled");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance()
					.teststepreporting("Proceed button is Enabled", "FAIL",
							"Proceed button should not be Enabled");
		}
	}

	public void clickProceedbutton() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().proceedbutton(driver);
			Keywords.click(element);
			if (DriverSession.getStepResult()) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Procced to Buy Link</b> click successfully",
								"PASS",
								"<b>Procced to Buy Link</b> should be click");
			} else
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Procced to Buy Link</b> successfully not click",
								"FAIL",
								"<b>Procced to Buy Link</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on Proceed to Buy <b>Proceed Buy Button</b>",
							"FAIL", "<b>Proceed to Buy</b> should be click");
		}
	}

	public boolean checkCartButtonStatus() {
		boolean status = false;
		WebElement element;
		try {
			element = Locators.getInstance().addtocart(driver);
			status = Keywords.isElementEnable(element);
		} catch (Exception e) {
		}

		return status;
	}

	public void clickAddToCartButton() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().addtocart(driver);
			if (checkCartButtonStatus()) {
				for (int i = 0; i < 3; i++) {
					Keywords.click(element);
					Thread.sleep(4);
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("<b>Cart Button is enable</b>",
									"PASS",
									"<b>Cart Button should be enable.</b>");
				}
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("<b>Cart Button still disable</b>",
								"FAIL", "<b>Cart Button should be enable.</b>");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred while clicking on add to cart button",
							"FAIL", "<b>Cart Button should be enable.</b>");
		}
	}

	public void cartdropdown() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().cartdropdown(driver);
			Keywords.click(element);
			Thread.sleep(4);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Cart Dropdownk</b> click successfully",
								"PASS", "<b>Cart Dropdown</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Cart Dropdownk</b> successfully not click",
								"FAIL", "<b>Cart Dropdown</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on Cart dropdown <b>Cart Dropdown Button</b>",
							"FAIL", "<b>Cart Dropdown</b> should be click");
		}
	}

	public void checkoutbutton() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().checkoutbutton(driver);
			System.out.println("Checkbutton is enabled");
			Keywords.click(element);
			Thread.sleep(4);
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Checkout button</b> click successfully",
								"PASS",
								"<b>Checkout button</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Checkout button/b> successfully not click",
								"FAIL",
								"<b>Checkout button</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on Checkout button <b>Cart Dropdown Button</b>",
							"FAIL", "<b>Checkout button</b> should be click");
		}
	}

	public void itemsInCart() {
		WebElement element = null;
		String expectedTitle = "";
		String actualTitle = "";
		// ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().cartitems(driver);
			expectedTitle = "Nice! You have added 2 Items in your shopping cart.";
			actualTitle = Keywords.getText(element).trim();
			System.out.println("Items are : " + actualTitle);

			if (DriverSession.getStepResult()) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Items in Shoppping Cart</b> Total number of items present",
								"PASS",
								"<b>Items in shopping cart</b> should get the no of items in cart");

			} else
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Items in shopping cart/b>Total no of items not present",
								"FAIL",
								"<b>Items in shopping cart</b>No items are present");

		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While checking number of items present <b>Items in Shopping cart</b>",
							"FAIL",
							"<b>Items in shopping cart</b> should get the number of items in cart");
		}

	}

	public void paymentssummary() {
		WebElement element = null;
		String expectedTitle = "";
		String actualTitle = "";
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().paymentsummary(driver);
			expectedTitle = "Total Amount Payable $66.0";
			actualTitle = Keywords.getText(element).trim();
			System.out.println("Due amount is :" + actualTitle);

			if (DriverSession.getStepResult()) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Payment Summary</b> Total amount payable",
								"PASS",
								"<b>Payment summaryt</b> Should show total amount payable");

			} else
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"<b>Payment summary/b>Total amount not found",
								"FAIL",
								"<b>Payment summary</b>should get total amount payable");

		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While checking total amount payable <b>Payment Summary</b>",
							"FAIL",
							"<b>Payment Summary</b> should show total amount payable");

		}
	}

	public void clickpaymentbutton() {
		WebElement element = null;
		try {
			Thread.sleep(5000);
			Keywords.waitForPage(driver);
			element = Locators.getInstance().paymentbutton(driver);
			System.out.println("Payment Button status..."+Keywords.isElementPresent(element));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
			
			
			Actions action = new Actions(driver);
			action.moveToElement(element).click().perform();
			
			//Keywords.clickByJS(element);
//			if (Keywords.isElementEnable(element) && Keywords.isElementPresent(element))
//				Keywords.click(element);
			Thread.sleep(3);
			if (DriverSession.getStepResult()) {
				DriverSession
						.getLastExecutionReportingInstance().teststepreporting("<b>Payment button</b> click successfully",
								"PASS", "<b>Payment button</b> should be click");
			} else
				DriverSession
						.getLastExecutionReportingInstance().teststepreporting("<b>Payment button/b> successfully not click",
								"FAIL", "<b>Payment button</b> should be click");
		} catch (Exception e) {
			DriverSession
					.getLastExecutionReportingInstance()
					.teststepreporting(
							"Exception occurred. While clicking on Payment button <b>Proceed Payment Button</b>",
							"FAIL", "<b>Payment button</b> should be click");
		}
	}
		
		public void cardtype() {
		WebElement element;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().cardtype(driver);
				System.out.println("enter card type status..."+Keywords.isElementPresent(element));
				Keywords.typeText(element,DriverSession.getTestCaseData().get("Cardnumber"));
				Thread.sleep(4);
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Enter Card Number</b> Card number enter successfull",
									"PASS","<b>Card Number</b>Should enter Card Number");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting("<b>Card Number/b> Card number not enter sucessdully",
									"FAIL","<b>Card Number</b>Should enter Card Number");
			} catch (Exception e) {
				DriverSession
						.getLastExecutionReportingInstance()
						.teststepreporting(
								"Exception occurred. While entering credit card number<b>Card number</b>",
								"FAIL", "<b>Card Number</b>Should enter Card Number");
			}
		}
   
		public void selectexpmonth() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().expirationmonth(driver);
				Keywords.selectByVisibleText(element, "Jul");
				if (DriverSession.getStepResult())
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Month select successfully",
									"PASS", "Month should be selected");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance()
						.teststepreporting("Month not select successfully",
								"FAIL", "Month should be selected");
				
			}
		}
		
		    public void selectexpyear() {
				WebElement element = null;
				try {
					Keywords.waitForPage(driver);
					element = Locators.getInstance().expirationyear(driver);
					Keywords.selectByVisibleText(element, "2020");
					if (DriverSession.getStepResult())
						DriverSession.getLastExecutionReportingInstance()
								.teststepreporting("Year select successfully",
										"PASS", "Year should be selected");
				} catch (Exception e) {
					DriverSession.getLastExecutionReportingInstance()
							.teststepreporting("Year not select successfully",
									"FAIL", "Year should be selected");
				}
			}	
			
			   public void entercvv() {
					WebElement element = null;
					try {
						Keywords.waitForPage(driver);
						element = Locators.getInstance().cvvnumber(driver);
						Keywords.typeText(element,DriverSession.getTestCaseData().get("Cvvnumber"));
						Thread.sleep(4);
						if (DriverSession.getStepResult()) {
							DriverSession.getLastExecutionReportingInstance().teststepreporting(
											"<b>Enter Cvv Number</b> Cvv number enter successfull",
											"PASS",
											"<b>Enter Cvv Number</b> Cvv number should be entered successfully");
						} else
							DriverSession.getLastExecutionReportingInstance().teststepreporting(
											"<b>Enter Cvv Number/b> Cvv number not enter sucessdully",
											"FAIL",
											"<b>Enter Cvv Number</b> Cvv number should be entered successfully");
					} catch (Exception e) {
						DriverSession.getLastExecutionReportingInstance().teststepreporting(
										"Exception occurred. While entering credit card number<b>Card number textbox</b>",
										"FAIL", "<b>Card Number</b> should be Entered");
	   }
   }	
					public void clickpaybutton() {
						WebElement element = null;
						try {
							Keywords.waitForPage(driver);
							element = Locators.getInstance().clickpaybutton(driver);
							System.out.println("Payment Button status..."+Keywords.isElementPresent(element));
							Keywords.click(element);
							Thread.sleep(4);
							if (DriverSession.getStepResult()) {
								DriverSession.getLastExecutionReportingInstance().teststepreporting(
												"<b>Payment button</b> click successfully",
												"PASS", "<b>Payment button Payment</b> should be click");
							} else
								DriverSession
										.getLastExecutionReportingInstance().teststepreporting(
												"<b>Pay button Paymen</b> successfully not click",
												"FAIL",
												"<b>Payment button Paymen</b> should be click");
						} catch (Exception e) {
							DriverSession.getLastExecutionReportingInstance().teststepreporting(
											"Exception occurred. While clicking on the Pay button <b>Payment button</b>",
											"FAIL", "<b>Payment button</b> should be click");
		}	
	}	
						public void paymentsuccessful() {
							WebElement element = null;
							String expectedTitle = "";
							String actualTitle = "";
							try {
								Keywords.waitForPage(driver);
								element = Locators.getInstance().paymentsuccessful(driver);
								expectedTitle = "Congratulations! You have successfully purchased gift cards from 1stRoundOnMe.";
								actualTitle = Keywords.getText(element).trim();
								System.out.println("Payment successful:" + actualTitle);

								if (DriverSession.getStepResult()) {
									DriverSession
											.getLastExecutionReportingInstance()
											.teststepreporting(
													"<b>Payment Successful</b> Success message is",
													"PASS",
													"<b>Payment Successful</b> Should show sucess message");

								} else
									DriverSession
											.getLastExecutionReportingInstance()
											.teststepreporting(
													"<b>Payment Successful/b>Success message not found",
													"FAIL",
													"<b>Payment Successful</b>should get payment success messsage");

							} catch (Exception e) {
								DriverSession
										.getLastExecutionReportingInstance()
										.teststepreporting(
												"Exception occurred. While clicking on paybutton <b>Payment Success</b>",
												"FAIL",
												"<b>Payment Success</b> should show payment success message");
	
							}
						}

							public void sharegiftcardbutton() {
								WebElement element = null;
								try {
									Keywords.waitForPage(driver);
									element = Locators.getInstance().sharegiftcardbutton(driver);
									Keywords.click(element);
									Thread.sleep(3);
									if (DriverSession.getStepResult()) {
										DriverSession.getLastExecutionReportingInstance().teststepreporting(
														"<b>Payment button</b> click successfully",
														"PASS", "<b>Payment button Payment</b> should be click");
									} else
										DriverSession
												.getLastExecutionReportingInstance().teststepreporting(
														"<b>Pay button Paymen</b> successfully not click",
														"FAIL",
														"<b>Payment button Paymen</b> should be click");
								} catch (Exception e) {
									DriverSession.getLastExecutionReportingInstance().teststepreporting(
													"Exception occurred. While clicking on the Pay button <b>Payment button</b>",
													"FAIL", "<b>Payment button</b> should be click");
				}	
			}
	}