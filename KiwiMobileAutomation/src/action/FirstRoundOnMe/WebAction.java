package action.FirstRoundOnMe;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import FirstRoundOnMe.DesktopWeb.BuyGiftCardScreen;
import FirstRoundOnMe.DesktopWeb.CustomizeEmail;
import FirstRoundOnMe.DesktopWeb.EditOutlet;
import FirstRoundOnMe.DesktopWeb.Footerlinks;
import FirstRoundOnMe.DesktopWeb.LoginScreen;
import FirstRoundOnMe.DesktopWeb.MyOrders;
import FirstRoundOnMe.DesktopWeb.OutletChangePassword;
import FirstRoundOnMe.DesktopWeb.OutletFooter;
import FirstRoundOnMe.DesktopWeb.OutletForgotPassword;
import FirstRoundOnMe.DesktopWeb.OutletLogin;
import FirstRoundOnMe.DesktopWeb.OutletSignup;
import FirstRoundOnMe.DesktopWeb.RedeemCard;
import FirstRoundOnMe.DesktopWeb.Signupscreen;
import action.CommonAll;

import com.session.DriverSession;

public class WebAction extends CommonAll {
	private static final boolean True = false;
	HashMap<String, String> testData = new HashMap<String, String>();

	public WebAction(WebDriver driver) {
		super(DriverSession.getLastExecutionDriver());
		this.testData = DriverSession.getTestCaseData();
	}

	public void login() {
		LoginScreen login = new LoginScreen(
				DriverSession.getLastExecutionDriver());
		if (login.loginStatus()) {
			login.clickOnSignInLink();
			login.enterEmailAddress();
			login.enterPass();
			login.submitSignIn();
		}
	}

	public void signup() {
		Signupscreen signup = new Signupscreen(
				DriverSession.getLastExecutionDriver());
		if (signup.signupStatus()) {
			signup.ClickOnSignuplink();
			signup.enterfirst_name();
			signup.enterlast_name();
			signup.entersignup_email();
			signup.enterPassword();
			signup.enter_confirmpassword();
			signup.enter_contact();
			signup.enter_address();
			signup.select_country();
			signup.select_state();
			signup.enter_city();
			signup.enter_zipcode();
			signup.select_terms();
			signup.signup_button();
			signup.profileheader();

		}
	}

	public void giftcard() {
		BuyGiftCardScreen giftcard = new BuyGiftCardScreen(
				DriverSession.getLastExecutionDriver());
		if (giftcard.loginStatus()) {
			giftcard.clickOnSignInLink();
			giftcard.enterEmailAddress();
			giftcard.enterPass();
			giftcard.submitSignIn();
			giftcard.clickOnGiftCardLink();
			giftcard.proceedbutton();
			giftcard.chooseTheme();
			giftcard.selectOcassion();
			giftcard.clickProceedbutton();
			giftcard.checkCartButtonStatus();
			giftcard.clickAddToCartButton();
			giftcard.cartdropdown();
			giftcard.checkoutbutton();
			giftcard.itemsInCart();
			giftcard.paymentssummary();
			giftcard.clickpaymentbutton();
			giftcard.cardtype();
			giftcard.selectexpmonth();
			giftcard.selectexpyear();
			giftcard.entercvv();
			giftcard.clickpaybutton();
			giftcard.sharegiftcardbutton();
		}
	}

	public void myorders() {
		MyOrders myorders = new MyOrders(DriverSession.getLastExecutionDriver());
		if (myorders.loginStatus()) {
			myorders.clickOnSignInLink();
			myorders.enterEmailAddress();
			myorders.enterPass();
			myorders.submitSignIn();
			myorders.headerprofile();
			myorders.myorders();
			myorders.emailcheckbox();
			myorders.enteremail();
			myorders.entermessage();
			myorders.sendbutton();
		}
	}

	public void footerlinks() {
		Footerlinks footerlinks = new Footerlinks(DriverSession.getLastExecutionDriver());
		footerlinks.contactus();
		footerlinks.partners();
	}
	
	public void outletSignup() {
		OutletSignup outletSignup = new OutletSignup(DriverSession.getLastExecutionDriver());
		if (outletSignup.signupStatus());
		    outletSignup.clicksignuplink();
		    outletSignup.outletImage();
		    outletSignup.outletName();
		    outletSignup.outletEmail();
		    outletSignup.outletPassword();
		    outletSignup.outletConfirmPassword();
		    outletSignup.outletContact();
		    outletSignup.ownerName();
		    outletSignup.responsibleName();
		    outletSignup.outletAddress();
		    outletSignup.outletCountry();
		    outletSignup.outletState();
		    outletSignup.outletCity();
		    outletSignup.outletZip();
		    outletSignup.outletAddress();
		    outletSignup.outletWebsite();
		    outletSignup.outletTerms();
		    outletSignup.outletSignupbutton();
		    outletSignup.outletSuccess();
		    
	}

	public void outletLogin() {
		OutletLogin outletLogin= new OutletLogin(DriverSession.getLastExecutionDriver());
		outletLogin.outletEmail();
		outletLogin.outletPassword();
		outletLogin.outletSignInButton();
		outletLogin.loginStatus();
	    outletLogin.outletLogoutButton();
		
	}
		
	public void redeemCard(){
		RedeemCard redeemCard= new RedeemCard(DriverSession.getLastExecutionDriver());
		redeemCard.outletEmail();
		redeemCard.outletPassword();
		redeemCard.outletSignInButton();
		redeemCard.loginStatus();
		redeemCard.enterRedeemCode();
		redeemCard.redeemButton();
		redeemCard.redeemSuccess();
		
	}
	
	public void editOutlet(){
		EditOutlet editOutlet= new EditOutlet(DriverSession.getLastExecutionDriver());
		editOutlet.outletEmail();
		editOutlet.outletPassword();
		editOutlet.outletSignInButton();
		editOutlet.outletHeader();
		editOutlet.EditLink();
		editOutlet.editName();
		editOutlet.editemail();
		editOutlet.editOutletImage();
		editOutlet.editOwnerName();
		editOutlet.editResponsibleName();
		editOutlet.editOutletAddress();
		editOutlet.editOutletCountry();
		editOutlet.editOutletState();
		editOutlet.editOutletCity();
		editOutlet.editOutletZip();
		editOutlet.editOutletWebsite();
		editOutlet.editUpdateButton();
		
	}
	 public void changePassword(){
		 OutletChangePassword changePassword= new OutletChangePassword(DriverSession.getLastExecutionDriver());
		 changePassword.outletEmail();
		 changePassword.outletPassword();
		 changePassword.outletSignInButton();
		 changePassword.outletHeader();
		 changePassword.changePasswordlink();
		 changePassword.outletOldPassword();
		 changePassword.outletNewPassword();
		 changePassword.outletConfirmPassword();
		 changePassword.updatePasswordButton();
	 }
	 
	 public void outletFooter(){
		 OutletFooter outletFooter= new  OutletFooter(DriverSession.getLastExecutionDriver());
	       outletFooter.aboutUs();
	       outletFooter.howItWorks();
	       outletFooter.privacyPolicy();
	       outletFooter.termsConditions();
		 
	 }
	 
	 public void outletForgotPassword(){
		 OutletForgotPassword outletForgotPassword= new OutletForgotPassword(DriverSession.getLastExecutionDriver());
		   outletForgotPassword.ForgotLink();
		   outletForgotPassword.forgotTitle();
		   outletForgotPassword.forgotButton();
		   outletForgotPassword.forgotError();
		   outletForgotPassword.outletForgotEmail();
		   outletForgotPassword.forgotButton();
		   outletForgotPassword.forgotOkay();
		   outletForgotPassword.mailinatorEmail();
		   outletForgotPassword.mailinatorButton();
		   outletForgotPassword.mailinatorInbox();
		   outletForgotPassword.mailinatorReset();
		   outletForgotPassword.resetPasswordl();
		   outletForgotPassword.resetConfirmPasswordl();
		   outletForgotPassword.resetPasswordlButton();
		 
	    }
		 
	  public void customizeEmail(){
		  CustomizeEmail customizeEmail= new CustomizeEmail(DriverSession.getLastExecutionDriver());
		  customizeEmail.outletEmail();
		  customizeEmail.outletPassword();
		  customizeEmail.outletSignInButton();
		  customizeEmail.loginStatus();
		  customizeEmail.customizeEmail();
		  customizeEmail.editEmail();
		  customizeEmail.textEditor();
		  customizeEmail.customizeOutletImage();
		  
	  }
	 
	 }	
	
	

