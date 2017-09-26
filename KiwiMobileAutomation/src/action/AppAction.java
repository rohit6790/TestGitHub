package action;

import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.session.DriverSession;
import com.utilities.GlobalParam;
import com.utilities.Utility;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import com.session.DriverFactory;
import testCaseReporting.TestCaseReporting;

public class AppAction extends CommonAll {

	Utility utilObj = new Utility();
	Properties pageProp;

	HashMap<String, String> testData = new HashMap<String, String>();
	TestCaseReporting testCaseReporting = null;
	String etPortfolioName = "";
	String productName = "";

	AppiumDriver<MobileElement> a_Driver;

	public AppAction(AppiumDriver<MobileElement> lastExecutionDriver) { // ##U
		super(lastExecutionDriver);
		this.driver = lastExecutionDriver;
		this.testData = DriverSession.getTestCaseData();
		setPageProp();
	}

	public void setPageProp() {
		if (GlobalParam.FEATURE_TYPE.equalsIgnoreCase("android"))
			pageProp = utilObj.loadPageProperties(GlobalParam.CURRENT_PROJECT_PATH + "/AndroidApp.properties");
		else if (GlobalParam.FEATURE_TYPE.equalsIgnoreCase("ios"))
			pageProp = utilObj.loadPageProperties(GlobalParam.CURRENT_PROJECT_PATH + "/iOSApp.properties");
	}

	public void setUp(WebDriver driver) throws Exception { // ##U
		try {
			this.driver = driver;
			this.testData = DriverSession.getTestCaseData();
			driver.manage().timeouts().implicitlyWait(Long.parseLong(pageProp.getProperty("defaultWaitTime")),
					TimeUnit.SECONDS);
			DriverSession.setLastExecutionDriver(driver);
		} catch (Exception e) {
			throw e;
		}
	}
	

	public void closeApp() {
		try {
			DriverSession.setReporting(true);
			driver.quit();
			DriverSession.getLastExecutionReportingInstance().teststepreporting("App is closed", "PASS",
					"App should be Closed");
		} catch (Exception ee) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting("App is not Closed", "FAIL",
					"App should be Closed");
		}
		DriverSession.getLastExecutionReportingInstance().footer();
	}

	@SuppressWarnings("unchecked")
	public void killApp() {
		try {
			a_Driver = (AppiumDriver<MobileElement>) DriverSession.getLastExecutionDriver();
			a_Driver.closeApp();
			DriverSession.getLastExecutionReportingInstance().teststepreporting("App forced kill", "PASS",
					"App should be killed");
		} catch (Exception ee) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting("App is not Closed", "FAIL",
					"App should be killed");
		}
	}


	@SuppressWarnings("unchecked")
	public void swipe() {
		try {
			IOSDriver<MobileElement> Driver = (IOSDriver<MobileElement>) DriverSession.getLastExecutionDriver();
			IOSElement element = (IOSElement) Driver
					.findElement(By.xpath("//UIAImage[@name='video_frame_bg']/following-sibling::UIAImage[1]"));
			int x = element.getLocation().getX();
			int y = element.getLocation().getY();
			TouchAction action = new TouchAction(Driver);
			action.moveTo(x + 200, y).longPress(element).perform();
			// action.moveTo(x+200,y).longPress(element).waitAction(10000).perform();
			action.release();
			// element.swipe(SwipeElementDirection.RIGHT,100,50, 2000);
			// Driver.swipe(100, 222, 150, 222, 1500);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

}