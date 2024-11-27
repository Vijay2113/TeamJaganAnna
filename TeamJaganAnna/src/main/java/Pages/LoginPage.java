package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Utility.DriverUtility;
import pojoutility.PojoUtility;

public class LoginPage extends DriverUtility {

	public void Language() throws Exception {
	initiliazeDriver();
	setAppCapabilitiesAndroid();
	
	
	PojoUtility.getConfig().setPropertyValue("English",
			"//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"English\"]");
	String p = PojoUtility.getConfig().getPropertyValue("English");
	Thread.sleep(3000);

	WebElement telugu = getmobileDriver().findElement(
			By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"Telugu\"]"));
	telugu.click();
	getExtentTest().log(LogStatus.INFO, "Successfully clicked on telugu");

	WebElement english = getmobileDriver().findElement(
			By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"English\"]"));
	english.click();
	getExtentTest().log(LogStatus.INFO, "Successfully clicked on english");

	WebElement next = getmobileDriver()
			.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]"));
	next.click();
	getExtentTest().log(LogStatus.INFO, "Successfully clicked on next");

	WebElement next1 = getmobileDriver()
			.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]"));
	next1.click();
	
	next1.click();
	
	next1.click();
	getExtentTest().log(LogStatus.INFO, "Successfully clicked on next1");
	
	
	
	
	
	}
	
	
	
}
