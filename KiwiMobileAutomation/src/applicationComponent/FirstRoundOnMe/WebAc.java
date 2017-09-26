package applicationComponent.FirstRoundOnMe;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.session.DriverSession;
import com.utilities.GlobalParam;
import com.utilities.Keywords;

import action.FirstRoundOnMe.WebAction;
import applicationComponent.AppComponent;
import applicationComponent.ApplicationComponent;


@Test
public class WebAc extends AppComponent implements ApplicationComponent {
	private WebAction action = new WebAction(DriverSession.getLastExecutionDriver());

	@Override
	public void openApplication() throws Exception {
		GlobalParam.url = DriverSession.getTestCaseData().get("URL");
		action.openBrowser(GlobalParam.url);
	}

	@Override
	public void closeApplication() {
		action.closeBrowser();
	}

	@Override
	public void validateHomePage() {	
	}
		
	public void loginTest() {
		action.login();}
  
	public void signupTest() {
		action.signup();
	}
	
	public void BuyGiftCardTest() {
		action.giftcard();
	}
	
	public void MyOrders() {
		action.myorders();
	}
	
	public void Footerlinks() {
		System.out.println("dmasndaDKN");
		action.footerlinks();
	}
	
	public void OutletSignup() {
		action.outletSignup();
	}
	
	public void OutletLogin(){
	   action.outletLogin();
			
	}
	
	public void RedeemCard(){
		action.redeemCard();
		
	}
	
	public void EditOutlet(){
	    action.editOutlet();
	
	}
	
	public void ChangePassword(){
		action.changePassword();
	}
	
	
	public void OutletFooter(){
	    action.outletFooter();
		
	}
	
	public void OutletForgotPassword(){
	    action.outletForgotPassword();
		
	}
	
	public void CustomizeEmail(){
		action.customizeEmail();
		
		
	}
	
	}
	
	