package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import MyScreeenRecorder.MyScreenRecorder;
import Utility.DriverUtility;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pojoutility.PojoUtility;

public class ScrollUp extends DriverUtility {

	
	@Test(priority = 0)
	public void Language() throws Exception {
		initiliazeDriver();
		setAppCapabilitiesAndroid();

		MyScreenRecorder.startRecording("Language");

		PojoUtility.getConfig().setPropertyValue("Skip",
				"//android.widget.Button[@resource-id=\"android:id/button2\"]");
		String SKIP = PojoUtility.getConfig().getPropertyValue("Skip");
		Thread.sleep(1000);
		getmobileDriver().findElement(By.xpath(SKIP)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Skip");

		PojoUtility.getConfig().setPropertyValue("Telugu",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"Telugu\"]");
		String TEL = PojoUtility.getConfig().getPropertyValue("Telugu");
		Thread.sleep(2000);
		getmobileDriver().findElement(By.xpath(TEL)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Telugu");

		PojoUtility.getConfig().setPropertyValue("English",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"English\"]");
		String ENG = PojoUtility.getConfig().getPropertyValue("English");
		Thread.sleep(2000);
		getmobileDriver().findElement(By.xpath(ENG)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on English");

		PojoUtility.getConfig().setPropertyValue("Next",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]");
		String NEXT = PojoUtility.getConfig().getPropertyValue("Next");
		Thread.sleep(2000);
		getmobileDriver().findElement(By.xpath(NEXT)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Next");

		PojoUtility.getConfig().setPropertyValue("Next1",
				"//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]");
		String NEXT1 = PojoUtility.getConfig().getPropertyValue("Next1");
		Thread.sleep(2000);
		getmobileDriver().findElement(By.xpath(NEXT1)).click();

		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Next1");

		PojoUtility.getConfig().setPropertyValue("Next2",
				"//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]");
		String NEXT2 = PojoUtility.getConfig().getPropertyValue("Next2");
		Thread.sleep(2000);
		getmobileDriver().findElement(By.xpath(NEXT2)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Next2");

		PojoUtility.getConfig().setPropertyValue("Next3",
				"//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]");
		String NEXT3 = PojoUtility.getConfig().getPropertyValue("Next3");
		Thread.sleep(2000);
		getmobileDriver().findElement(By.xpath(NEXT3)).click();

		getExtentTest().log(LogStatus.PASS, "Successfully navigate to login page");

	}

	@Test(priority = 1)
	public void LoginPage() throws Exception {

		WebElement None = getmobileDriver()
				.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.gms:id/cancel\"]"));
		None.click();
		getExtentTest().log(LogStatus.PASS,"Successfully cilcked on None Of the above");
		 
		WebElement MOB = getmobileDriver()
				.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.tja:id/edInputPhoneNumber\"]"));
		MOB.click();

		MOB.sendKeys("9147080748");
		getExtentTest().log(LogStatus.PASS, "Successfully enterd the MobileNumber");
		Thread.sleep(2000);

		PojoUtility.getConfig().setPropertyValue("Next",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]");
		String NEXT = PojoUtility.getConfig().getPropertyValue("Next");
		getmobileDriver().findElement(By.xpath(NEXT)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully login completed");
		Thread.sleep(25000);

		WebElement WAPP = getmobileDriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
		WAPP.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on While using the App");

		WebElement WAPP1 = getmobileDriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
		WAPP1.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on While using the App1");

		WebElement ALLOW = getmobileDriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
		ALLOW.click();
		ALLOW.click();

		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on Allow");

		WebElement Logo = getmobileDriver()
				.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_logo\"]"));
		Logo.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully login into the HomePage");
		
	}

	
	
	
	
	
	@Test(priority = 2)
    public void scrollUpTest() {
        // Your test logic here, navigate to the screen or element where scrolling is needed

        // Example: Scroll up in a chat conversation
		ScrollUp();
 
        // Set the coordinates for the swipe action
        
    }

	private void ScrollUp() {
		
		Dimension size = mobileDriver.manage().window().getSize();
		
		int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        TouchAction touchAction = new TouchAction((PerformsTouchActions) mobileDriver);
        touchAction.press(PointOption.point(startX, startY))  
        .waitAction() // Optional: Adjust the duration of the scroll
        .moveTo(PointOption.point(startX, endY))
        .release()
        .perform();
        
		// TODO Auto-generated method stub
		/*int startX = mobileDriver.manage().window().getSize().getWidth() / 2;
        int startY = (int) (mobileDriver.manage().window().getSize().getHeight() * 0.8); // 80% from the bottom
        int endY = (int) (mobileDriver.manage().window().getSize().getHeight() * 0.2); // 20% from the top

        // Perform the swipe using TouchAction
       
    
       // TouchAction touchAction = new TouchAction((PerformsTouchActions) mobileDriver);
        AndroidTouchAction touchAction = new AndroidTouchAction((PerformsTouchActions) mobileDriver);
        touchAction.press(PointOption.point(startX, startY))
                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                   .moveTo(PointOption.point(startX, endY))
                   .release()
                   .perform();
		*/
	}
	
	
	
	
	
	
	/*
	
	@Test(priority = 2)
		    public void scrollUpTest() {
		        // Your test logic here, navigate to the screen or element where scrolling is needed

		        // Example: Scroll up in a chat conversation
		        scrollUpTest();
		    }
		 
		 private void scrollUp() {
		        // Set the coordinates for the swipe action
		        int startX = mobileDriver.manage().window().getSize().getWidth() / 2;
		        int startY = (int) (mobileDriver.manage().window().getSize().getHeight() * 0.8); // 80% from the bottom
		        int endY = (int) (mobileDriver.manage().window().getSize().getHeight() * 0.2); // 20% from the top

		        // Perform the swipe using TouchAction
		        TouchAction touchAction = new TouchAction((PerformsTouchActions) mobileDriver);
		        touchAction.press(PointOption.point(startX, startY))
		                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
		                   .moveTo(PointOption.point(startX, endY))
		                   .release()
		                   .perform();
		    }
*/		 
}
