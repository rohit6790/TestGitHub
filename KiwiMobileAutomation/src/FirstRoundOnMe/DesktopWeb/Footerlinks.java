package FirstRoundOnMe.DesktopWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.session.DriverSession;
import com.utilities.Keywords;

public class Footerlinks {

	private WebDriver driver;

	public Footerlinks(WebDriver lastExecutionDriver) {
		// TODO Auto-generated constructor stub
	}

	public void clickaboutus() {
		WebElement element = null;
		try {
			Keywords.waitForPage(driver);
			element = Locators.getInstance().aboutus(driver);
			System.out.println("About us status..."+Keywords.isElementEnable(element));
			Thread.sleep(4);
			System.out.println("About us status..."+Keywords.isElementPresent(element));
			Keywords.clickByJS(element);
			String URL = driver.getCurrentUrl();
			System.out.println("Url is :"+ URL);
			Assert.assertEquals(URL, "http://staging.1stroundonme.com/about-us" );
			if (DriverSession.getStepResult()) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>About Us</b> click successfully",
								"PASS", "<b>About Us</b> should be click");
			} else
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"<b>About Us</b> successfully not click",
								"FAIL",
								"<b>About Us</b> should be click");
		} catch (Exception e) {
			DriverSession.getLastExecutionReportingInstance().teststepreporting(
							"Exception occurred. While clicking on the <b>About Us</b>",
							"FAIL", "<b>About us</b> should be click");
		}
	}
		public void clickgiftcards() {
			WebElement element = null;
			try {
				Keywords.waitForPage(driver);
				element = Locators.getInstance().giftcardslink(driver);
				System.out.println("Read more status..."+Keywords.isElementPresent(element));
				Keywords.click(element);
				String URL = driver.getCurrentUrl();
				System.out.println("Url is :"+ URL);
				Assert.assertEquals(URL, "http://staging.1stroundonme.com/about-us" );
				if (DriverSession.getStepResult()) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>About Us</b> click successfully",
									"PASS", "<b>About Us</b> should be click");
				} else
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"<b>About Us</b> successfully not click",
									"FAIL",
									"<b>About Us</b> should be click");
			} catch (Exception e) {
				DriverSession.getLastExecutionReportingInstance().teststepreporting(
								"Exception occurred. While clicking on the <b>About Us</b>",
								"FAIL", "<b>About us</b> should be click");
			}
		}
			public void contactus() {
				List<WebElement> element;
				try {
					Keywords.waitForPage(driver);
					element = Locators.getInstance().contactus(driver);
					//String contactus = driver.findElement(By.tagName("CONTACT US")).getText();
					Keywords.clickByJS(element);
					String URL = driver.getCurrentUrl();
					System.out.println("Url is :"+ URL);
					Assert.assertEquals(URL, "http://staging.1stroundonme.com/contact-us" );
					if (DriverSession.getStepResult()) {
						DriverSession.getLastExecutionReportingInstance().teststepreporting(
										"<b>Contact Us</b> click successfully",
										"PASS", "<b>Contact Us</b> should be click");
					} else
						DriverSession.getLastExecutionReportingInstance().teststepreporting(
										"<b>Contact Us</b> successfully not click",
										"FAIL",
										"<b>Contact Us</b> should be click");
				} catch (Exception e) {
					DriverSession.getLastExecutionReportingInstance().teststepreporting(
									"Exception occurred. While clicking on the <b>Contact Us</b>",
									"FAIL", "<b>Contact us</b> should be click");
				}
			}
				public void partners() {
					WebElement element = null;
					try {
						Keywords.waitForPage(driver);
						element = Locators.getInstance().partners(driver);
						System.out.println("Read partner status..."+Keywords.isElementPresent(element));
						Keywords.click(element);
						String URL = driver.getCurrentUrl();
						System.out.println("Url is :"+ URL);
						Assert.assertEquals(URL, "http://staging.1stroundonme.com/partners" );
						if (DriverSession.getStepResult()) {
							DriverSession.getLastExecutionReportingInstance().teststepreporting(
											"<b>Partners</b> click successfully",
											"PASS", "<b>About Us</b> should be click");
						} else
							DriverSession.getLastExecutionReportingInstance().teststepreporting(
											"<b>Partners</b> successfully not click",
											"FAIL",
											"<b>Partners</b> should be click");
					} catch (Exception e) {
						DriverSession.getLastExecutionReportingInstance().teststepreporting(
										"Exception occurred. While clicking on the <b>About Us</b>",
										"FAIL", "<b>Partners</b> should be click");
					}
	}
}	