package FirstRoundOnMe.DesktopWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static Locators getInstance() {
		Locators mHeader = null;
		try {
			mHeader = new Locators();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mHeader;
	}

	// for login
	public WebElement opentab(WebDriver driver) {
		return driver.findElement(By.cssSelector("body"));
	}

	public WebElement signInLink(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Sign In']"));
	}

	public WebElement userEmailAddress(WebDriver driver) {
		return driver.findElement(By.id("login_email"));
	}

	public WebElement loginPass(WebDriver driver) {
		return driver.findElement(By.id("login_password"));
	}

	public WebElement submitLogin(WebDriver driver) {
		return driver.findElement(By
				.xpath("(//input[@class='btn sign-in-btn'])[1]"));
	}

	// for Sign Up

	public WebElement opensignuptab(WebDriver driver) {
		return driver.findElement(By.cssSelector("body"));
	}

	public WebElement signuplink(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='navbar-top']/ul[2]/li[3]/a"));
	}

	public WebElement first_name(WebDriver driver) {
		return driver.findElement(By.id("first_name"));
	}

	public WebElement last_name(WebDriver driver) {
		return driver.findElement(By.id("last_name"));
	}

	public WebElement signup_email(WebDriver driver) {
		return driver.findElement(By.id("signup_email"));
	}

	public WebElement signup_password(WebDriver driver) {
		return driver.findElement(By.id("signup_password"));
	}

	public WebElement signup_cpassword(WebDriver driver) {
		return driver.findElement(By.id("signup_cpassword"));

	}

	public WebElement signup_contact(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='signup_contact']"));
	}

	public WebElement signup_address(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='signup_address']"));
	}

	public WebElement country(WebDriver driver) {
		return driver.findElement(By.id("country"));
	}

	public WebElement statenew(WebDriver driver) {
		return driver.findElement(By.id("statenew"));
	}

	public WebElement city(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='city']"));
	}

	public WebElement zip(WebDriver driver) {
		return driver.findElement(By.id("zip"));
	}

	public WebElement terms(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='signup_form']/div[18]/div/label"));
	}

	public WebElement signup_button(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='signup_form']/div[20]/div/input"));
	}

	// Profile Header Name is visible

	public WebElement profileHeader(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='navbar-top']/ul[2]/li[2]/a"));
	}

	// Buy Gift Card

	public WebElement giftcardlink(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='navbar-top']/ul[1]/li[1]/a"));
	}

	public WebElement cardtheme(WebDriver driver) {
		return driver.findElement(By.id("theme_1"));
	}

	public WebElement occasion(WebDriver driver) {
		return driver.findElement(By.id("occasions"));
	}

	public WebElement proceedbutton(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='main-content']/div/div/div[2]/div/div[2]/div[2]/a"));
	}

	public WebElement addtocart(WebDriver driver) {
		return driver.findElement(By.id("addto_cart"));
	}

	public WebElement cartdropdown(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='dropdowncart']/a/span[3]"));
	}

	public WebElement checkoutbutton(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='minicart']/ul/li/a"));
	}

	public WebElement paymentsummary(WebDriver driver) {
		return driver.findElement(By
				.xpath("//p[text()='Total Amount Payable']"));
	}

	public WebElement cartitems(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='body-wrapper']/section/div/div/div/p"));
	}

	public WebElement paymentbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Proceed to Payment']")); // (By.xpath(".//*[@id='body-wrapper']/section/div/div/div/div[5]/a[2]"));
	}

	public WebElement cardtype(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='creditCardNumber']"));
	}

	public WebElement expirationmonth(WebDriver driver) {
		return driver.findElement(By.id("expdatemonth"));
	}

	public WebElement expirationyear(WebDriver driver) {
		return driver.findElement(By.id("expdateyear"));
	}

	public WebElement cvvnumber(WebDriver driver) {
		return driver.findElement(By.id("cvv2number"));
	}

	public WebElement clickpaybutton(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='billing_form']/div[3]/div[11]/div/input"));
	}

	public WebElement paymentsuccessful(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='body-wrapper']/section/div/div/div/p[2]"));
	}

	public WebElement sharegiftcardbutton(WebDriver driver) {
		return driver
				.findElement(By
						.xpath("//*[@id='body-wrapper']/section/div/div/div/form/div[1]/a"));
	}

	// My Orders

	public WebElement headerLink(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='navbar-top']/ul[2]/li[2]/a"));
	}

	public WebElement myOrders(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='navbar-top']/ul[2]/li[2]/ul/li[2]/a"));
	}

	public WebElement emailcheckbox(WebDriver driver) {
		return driver.findElement(By
				.xpath("//label[contains(@class,'chek checkfont')]"));
	}

	public WebElement enteremail(WebDriver driver) {
		return driver.findElement(By
				.xpath("//input[starts-with(@id,'email_')]"));
	}

	public WebElement entermessage(WebDriver driver) {
		return driver.findElement(By.id("message"));
	}

	public List<WebElement> clicksend(WebDriver driver) {
		return driver.findElements(By.xpath("(//input[@value='Send'])[1]"));
	}

	// Footer Links

	public WebElement aboutus(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(@href,'/cards')]"));
	}

	public WebElement giftcardslink(WebDriver driver) {
		// return
		// driver.findElement(By.xpath(".//*[@id='body-wrapper']/div[1]/div/div/div[3]/div/ul/li[1]/a"));
		return driver.findElement(By
				.xpath("//a[contains(@href,'/how-it-works')][1]"));
	}

	public List<WebElement> contactus(WebDriver driver) {
		return driver
				.findElements(By
						.xpath("//h3[text()='Company Links']/following::ul[1]/li/a[text()='CONTACT US']"));
	}

	public WebElement partners(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='navbar-top']/ul[1]/li[3]/a"));

		// Outlet Portal

	}

	public WebElement outletsignuplink(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='outletSignin']/div[2]/div[8]/p/a"));
	}

	public WebElement outletImage(WebDriver driver) {
		return driver.findElement(By.id("file_upload"));
	}

	public WebElement outletName(WebDriver driver) {
		return driver.findElement(By.id("name"));

	}

	public WebElement outletEmail(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}

	public WebElement outletPassword(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}

	public WebElement outletConfirmP(WebDriver driver) {
		return driver.findElement(By.id("confirm_password"));
	}

	public WebElement outletContact(WebDriver driver) {
		return driver.findElement(By.id("contact_outlet"));
	}

	public WebElement ownerName(WebDriver driver) {
		return driver.findElement(By.id("owner_name"));
	}

	public WebElement responsiblePerson(WebDriver driver) {
		return driver.findElement(By.id("responsible_person"));
	}

	public WebElement outletAddress(WebDriver driver) {
		return driver.findElement(By.id("address"));

	}

	public WebElement outletCountry(WebDriver driver) {
		return driver.findElement(By.id("country"));
	}

	public WebElement outletState(WebDriver driver) {
		return driver.findElement(By.id("statenew"));
	}

	public WebElement outletCity(WebDriver driver) {
		return driver.findElement(By.id("city"));
	}

	public WebElement outletZip(WebDriver driver) {
		return driver.findElement(By.id("zip"));
	}

	public WebElement outletWebsite(WebDriver driver) {
		return driver.findElement(By.id("website"));
	}

	public WebElement outletTerms(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='outletSignUp']/div[2]/div[23]/label"));
	}

	public WebElement outletSignupbutton(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='outletSignUp']/div[2]/div[24]/div/input"));
	}

	public WebElement outletSuccess(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='body-wrapper']/section/div/div/div/p[2]"));
	}

	// Outlet Login

	public WebElement outletLoginid(WebDriver driver) {
		return driver.findElement(By.id("email"));

	}

	public WebElement outletLoginPass(WebDriver driver) {
		return driver.findElement(By.id("password"));

	}

	public WebElement outletSignInbutton(WebDriver driver) {
		return driver.findElement(By
				.xpath(".//*[@id='outletSignin']/div[2]/div[7]/button"));

	}

	public WebElement outletHeader(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='navbar-top']/ul[2]/li[2]/a"));

	}

	public WebElement outletLogout(WebDriver driver) {
		return driver.findElement(By
				.xpath("//*[@id='navbar-top']/ul[2]/li[2]/ul/li[3]/a"));

	}

	public WebElement redeemCode(WebDriver driver) {
		return driver.findElement(By.id("card_number"));

	}

	public WebElement redeembutton(WebDriver driver) {
		return driver.findElement(By.id("card_submit"));

	}

	public WebElement redeemsuccess(WebDriver driver) {
		return driver.findElement(By.id("card_success"));
	}

	// Outlet Edit Profile

	public WebElement EditProfile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='navbar-top']/ul[2]/li[2]/ul/li[1]/a"));
	}

	public WebElement Headerdropdown(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='navbar-top']/ul[2]/li[2]/a"));
	}
	public WebElement OutletUpdatebutton(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='editProfile']/div[2]/div[20]/div/input"));
	}
	// Change Password
	public WebElement changePasswordLink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='navbar-top']/ul[2]/li[2]/ul/li[2]/a"));
	}	
	public WebElement OldPassword(WebDriver driver) {
		return driver.findElement(By.id("old_password"));

	}
	public WebElement NewPassword(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}			
	public WebElement ConfirmPassword(WebDriver driver) {
		return driver.findElement(By.id("confirm_password"));
	}			

	public WebElement UpdatePassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='changePwd']/div[5]/div/input"));				

	}

	//Outlet Links

	public WebElement OutletAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='body-wrapper']/div[2]/div/ul/li[1]/a"));	

	}


	public WebElement OutletHowitworks(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='body-wrapper']/div[2]/div/ul/li[3]/a"));	

	}

	public WebElement PrivacyPolicy(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='body-wrapper']/div[2]/div/ul/li[5]/a"));	

	}

	public WebElement TermsConditions(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='body-wrapper']/div[2]/div/ul/li[7]/a"));	

	}


	//Forgot Password 


	public WebElement OutletForgot(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='outletSignin']/div[2]/div[5]/a"));	
	}

	public WebElement ForgotTitle(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='body-wrapper']/section/div/div/div/h3"));	
	}	
	public WebElement emailError(WebDriver driver) {
		return driver.findElement(By.id("emailError"));
	}   		
	public WebElement forgotbutton(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='ForgetPassword']/div[4]/input"));		

	}

	public WebElement forgotSuccess(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='body-wrapper']/section/div/div/div/h3"));	
	}

	public WebElement forgotOkay(WebDriver driver) {
		return driver.findElement(By.xpath(".//*[@id='body-wrapper']/section/div/div/div/div[1]/a"));
	}		

	public WebElement mailinatorId(WebDriver driver) {
		return driver.findElement(By.id("inboxfield"));
	}       		
	public WebElement mailinatorbutton(WebDriver driver) {
		return driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	}

	public WebElement mailinatorinbox(WebDriver driver) {
		return driver.findElement(By.xpath("(//div[@class='all_message-min_text all_message-min_text-3'])[1]"));
	}
	public WebElement mailinatorReset(WebDriver driver) {
		return driver.findElement(By.id("msg_body"));
	}	
		public WebElement ResePassword(WebDriver driver) {
			return driver.findElement(By.xpath(".//*[@id='resetPassword']/div[5]/input"));
   }
		
		
		//Customize Email
		
		public WebElement CustomizeEmail(WebDriver driver) {
			return driver.findElement(By.xpath(".//*[@id='navbar-top']/ul[1]/li[2]/a"));
   }
		
		public WebElement  EditEmail(WebDriver driver) {
			return driver.findElement(By.xpath(".//*[@id='body-wrapper']/section/div/div/div/div/div[2]/a"));
   }
		public WebElement  Editor(WebDriver driver) {
			return driver.findElement(By.id("tinymce'"));
   }
		public WebElement  InsertImage(WebDriver driver) {
			return driver.findElement(By.xpath(".//*[@id='mceu_10']/button"));
   }
		
}
