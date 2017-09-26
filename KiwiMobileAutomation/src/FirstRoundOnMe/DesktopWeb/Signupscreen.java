package FirstRoundOnMe.DesktopWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.session.DriverSession;
import com.utilities.Keywords;

public class Signupscreen {


	private WebDriver driver;

	public Signupscreen(WebDriver driver) {
		this.driver = driver;
}

public void ClickOnSignuplink() {
	WebElement element = null;
	try {
		Keywords.waitForPage(driver);
		element = Locators.getInstance().signuplink(driver);
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
   }	public boolean signupStatus() {
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
   
       public void enterfirst_name() {
    	   WebElement element = null;
    		try {
    			Keywords.waitForPage(driver);
    			element = Locators.getInstance().first_name(driver);
    			Keywords.typeText(element, DriverSession.getTestCaseData().get("firstname"));
    			if (DriverSession.getStepResult())
    				DriverSession.getLastExecutionReportingInstance()
    						.teststepreporting("Firstname enter successfully",
    								"PASS", "Firstname should be enter");
    		} catch (Exception e) {
    			DriverSession.getLastExecutionReportingInstance()
    			.teststepreporting("Firstname not enter successfully",
    					"FAIL", "Firstname should be enter");

    		}
       }
       
       public void enterlast_name() {
    	   WebElement element = null;
    		try {
    			Keywords.waitForPage(driver);
    			element = Locators.getInstance().last_name(driver);
    			Keywords.typeText(element, DriverSession.getTestCaseData().get("lastname"));
    			if (DriverSession.getStepResult())
    				DriverSession.getLastExecutionReportingInstance()
    						.teststepreporting("Lastname enter successfully",
    								"PASS", "Lastname should be enter");
    		} catch (Exception e) {
    			DriverSession.getLastExecutionReportingInstance()
    			.teststepreporting("Lastname not enter successfully",
    					"FAIL", "Lastname should be enter");

    		}
         
       }
       public void entersignup_email() {
    	   WebElement element = null;
    		try {
    			Keywords.waitForPage(driver);
    			element = Locators.getInstance().signup_email(driver);
    			Keywords.typeText(element, DriverSession.getTestCaseData().get("signupemail"));
    			if (DriverSession.getStepResult())
    				DriverSession.getLastExecutionReportingInstance()
    						.teststepreporting("email enter successfully",
    								"PASS", "email should be enter");
    		} catch (Exception e) {
    			DriverSession.getLastExecutionReportingInstance()
    			.teststepreporting("Email not enter successfully",
    					"FAIL", "Email should be enter");

    		}
       }
       
       public void enterPassword() {
    	   WebElement element = null;
    		try {
    			Keywords.waitForPage(driver);
    			element = Locators.getInstance().signup_password(driver);
    			Keywords.typeText(element, DriverSession.getTestCaseData().get("password"));
    			if (DriverSession.getStepResult())
    				DriverSession.getLastExecutionReportingInstance()
    						.teststepreporting("Password enter successfully",
    								"PASS", "Password should be enter");
    		} catch (Exception e) {
    			DriverSession.getLastExecutionReportingInstance()
    			.teststepreporting("Password not enter successfully",
    					"FAIL", "Password should be ente");

    		}
       }
       
       public void enter_confirmpassword() {
    	   WebElement element = null;
    		try {
    			Keywords.waitForPage(driver);
    			element = Locators.getInstance().signup_cpassword(driver);
    			Keywords.typeText(element, DriverSession.getTestCaseData().get("cpassword"));
    			if (DriverSession.getStepResult())
    				DriverSession.getLastExecutionReportingInstance()
    						.teststepreporting("Confirm Password enter successfully",
    								"PASS", "Confirm Password should be enter");
    		} catch (Exception e) {
    			DriverSession.getLastExecutionReportingInstance()
    			.teststepreporting("Confirm Password not enter successfully",
    					"FAIL", "Confirm Password should be enter");

    		}
       }
       
       public void enter_contact() {
    	   WebElement element = null;
    		try {
    			Keywords.waitForPage(driver);
    			element = Locators.getInstance().signup_contact(driver);
    			Keywords.typeText(element, DriverSession.getTestCaseData().get("contact"));
    			if (DriverSession.getStepResult())
    				DriverSession.getLastExecutionReportingInstance()
    						.teststepreporting("Contact enter successfully",
    								"PASS", "Contact should be enter");
    		} catch (Exception e) {
    			DriverSession.getLastExecutionReportingInstance()
    			.teststepreporting("Contact not enter successfully",
    					"FAIL", "Contact should be enter");

    		}
       } 
    		  public void enter_address() {
    	    	   WebElement element = null;
    	    		try {
    	    			Keywords.waitForPage(driver);
    	    			element = Locators.getInstance().signup_address(driver);
    	    			Keywords.typeText(element, DriverSession.getTestCaseData().get("address"));
    	    			if (DriverSession.getStepResult())
    	    				DriverSession.getLastExecutionReportingInstance()
    	    						.teststepreporting("Address enter successfully",
    	    								"PASS", "Address should be enter");
    	    		} catch (Exception e) {
    	    			DriverSession.getLastExecutionReportingInstance()
    	    			.teststepreporting("Address not enter successfully",
    	    					"FAIL", "Address should be enter");

    	    		}
    		  }	       
       
    		  public void select_country() {
   	    	   WebElement element = null;
   	    		try {
   	    			Keywords.waitForPage(driver);
   	    			element = Locators.getInstance().country(driver);
   	    			Keywords.selectByVisibleText(element, "United Kingdom");
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
    		  public void select_state() {
      	    	   WebElement element = null;
      	    		try {
      	    			Keywords.waitForPage(driver);
      	    			element = Locators.getInstance().statenew(driver);
      	    			Keywords.selectByVisibleText(element, "Belfast");
      	    			if (DriverSession.getStepResult())
      	    				DriverSession.getLastExecutionReportingInstance()
      	    						.teststepreporting("State selected successfully",
      	    								"PASS", "State should be selected");
      	    		} catch (Exception e) {
      	    			DriverSession.getLastExecutionReportingInstance()
      	    			.teststepreporting("State not selected successfully",
      	    					"FAIL", "State should be selected");

      	    		}
      		  }	       
    		  public void enter_city() {
     	    	   WebElement element = null;
     	    		try {
     	    			Keywords.waitForPage(driver);
     	    			element = Locators.getInstance().city(driver);
     	    		   Keywords.typeText(element, DriverSession.getTestCaseData().get("city"));
     	    			if (DriverSession.getStepResult())
     	    				DriverSession.getLastExecutionReportingInstance()
     	    						.teststepreporting("City enter successfully",
     	    								"PASS", "City should be enter");
     	    		} catch (Exception e) {
     	    			DriverSession.getLastExecutionReportingInstance()
     	    			.teststepreporting("City not enter successfully",
     	    					"FAIL", "City should be enter");

     	    		}
     		  }	  
       
    		  public void enter_zipcode() {
    	    	   WebElement element = null;
    	    		try {
    	    			Keywords.waitForPage(driver);
    	    			element = Locators.getInstance().zip(driver);
    	    		   Keywords.typeText(element, DriverSession.getTestCaseData().get("zip"));
    	    			if (DriverSession.getStepResult())
    	    				DriverSession.getLastExecutionReportingInstance()
    	    						.teststepreporting("Zip enter successfully",
    	    								"PASS", "Zip should be enter");
    	    		} catch (Exception e) {
    	    			DriverSession.getLastExecutionReportingInstance()
    	    			.teststepreporting("Zip not enter successfully",
    	    					"FAIL", "Zip should be enter");

    	    		}
    		  }	 
       

    		  public void select_terms() {
    	    	   WebElement element = null;
    	    		try {
    	    			Keywords.waitForPage(driver);
    	    			element = Locators.getInstance().terms(driver);
    	    		   Keywords.click(element);
    	    			if (DriverSession.getStepResult())
    	    				DriverSession.getLastExecutionReportingInstance()
    	    						.teststepreporting("Terms select successfully",
    	    								"PASS", "Terms should be selected");
    	    		} catch (Exception e) {
    	    			DriverSession.getLastExecutionReportingInstance()
    	    			.teststepreporting("Terms not selected successfully",
    	    					"FAIL", "Terms should be selected");

    	    		}
    		  }	 
       

    			public void signup_button() {
    				WebElement element;
    				try {
    					Keywords.waitForPage(driver);
    					element = Locators.getInstance().signup_button(driver);
    					Keywords.moveToElement(element, driver);
    					element.click();
    					if (DriverSession.getStepResult()) {
    						DriverSession.getLastExecutionReportingInstance()
    								.teststepreporting(
    										"<b>SignUp Button</b> click successfully",
    										"PASS", "<b>SignUp Button</b> should be click");
    					} else
    						DriverSession.getLastExecutionReportingInstance()
    								.teststepreporting(
    										"<b>Signup Button</b> successfully not click",
    										"FAIL", "<b>Signup Button</b> should be click");
    				} catch (Exception e) {
    					DriverSession
    							.getLastExecutionReportingInstance()
    							.teststepreporting(
    									"Exception occurred. While clicking on the <b>Signup Button</b>",
    									"FAIL", "<b>Signup Button</b> should be click");
    				}
    			}
       
    			public void profileheader() {
    				WebElement element;
    				try {
    	    			Keywords.waitForPage(driver);
    	    			element = Locators.getInstance().profileHeader(driver);
    	    			// Find element is visible and Verify Headername Text
    	    			if (Keywords.isElementPresent(element) && Keywords.getText(element).equalsIgnoreCase("rohit sharma"))
    	    			Thread.sleep(5);
    	    				if (DriverSession.getStepResult())
        	    				DriverSession.getLastExecutionReportingInstance()
        	    						.teststepreporting(" Profile Header name Present",
        	    								"PASS", "Profile Header name should be Present");
    	    		} catch (Exception e) {
    	    			DriverSession.getLastExecutionReportingInstance()
    	    			.teststepreporting("Profile Header name not present",
    	    					"FAIL", "Profile Header name should be Present");

    	    		}
    			}
    			
      
}





