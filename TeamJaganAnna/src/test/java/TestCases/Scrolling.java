package TestCases;


import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Scrolling {


	public static AndroidDriver driver;
	
	
	
	@org.testng.annotations.Test
		 public  static  void sample() throws Exception {
		
		 File classpathRoot = new File(System.getProperty("user.dir"));
		 
		 Thread.sleep(10000);
		 
			File appDir = new File(classpathRoot, "/Applications");
			File app = new File(appDir, "tja-app-production-release.apk");
			
			//appiumURL = new URL("http://" + appiumserver + ":" + appiumPort + "/wd/hub");
			
			 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Pixel 6a");
		capabilities.setCapability("platformVersion", "14");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("Automation Name", " UiAutomator2");
		capabilities.setCapability("Udid", "32281JEGR08738");
		
		//capabilities.setCapability("ignoreHiddenApiPolicyError", "True");
		
		//capabilities.setCapability("noReset", "True");
		
		
		//capabilities.setCapability("Udid", "PDAID18091400612");
		
		// capabilities.setCapability(MobileCapabilityType.APP,
		// "D2D/Applications/app-staging-release.apk");
		
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.tja");
		capabilities.setCapability("appActivity", "com.tja.activities.LandingActivity");
		
	    //driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    
	    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
	    
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		

		//skip button for stagging
		
driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"Telugu\"]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"English\"]")).click();

Thread.sleep(3000);

WebElement t= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]"));

t.click();

Thread.sleep(3000);

WebElement NEXTBUTTON1  = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]"));

Thread.sleep(3000);

NEXTBUTTON1.click();

WebElement NEXTBUTTON2  = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]"));

NEXTBUTTON2.click();


WebElement NEXTBUTTON3  = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]"));

NEXTBUTTON3.click();




WebElement mobilenumber=   driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.tja:id/edInputPhoneNumber\"]"));

mobilenumber.sendKeys("9147080748");


Thread.sleep(3000);




WebElement mobilenumberNext   =	driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]"));

mobilenumberNext.click();

WebElement WAPP =driver
.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
WAPP.click();
Thread.sleep(2000);

WebElement WAPP1 =driver
.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
WAPP1.click();
Thread.sleep(2000);



WebElement ALLOW =driver
.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
ALLOW.click();

Thread.sleep(2000);



WebElement ALLOW1 =driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]"));

Thread.sleep(2000);

ALLOW1.click();

Thread.sleep(2000);


WebElement Logo =driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_logo\"]"));

Logo.click();




}
	
	public  static void scrollByID(String className, int index) throws InterruptedException {

        try {

             driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\""+className+"\").instance("+index+"));")); 

        } catch (Exception e) {
           e.printStackTrace();
        }
    
	
	


WebElement stories1= driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.tja:id/iv_story_image\"])[1]"));

//WebElement 	stories2  =driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_story_title\" and @text=\"Siddham🔥\"]"));

	//String  ActualTitle=stories2.getText();
	
	String ExpectedTitle ="Siddham🔥";
	
	System.out.println(ExpectedTitle);
	
	//Assert.assertNotEquals(ActualTitle, ExpectedTitle);
	
	stories1.click();
	
	
	Thread.sleep(4000);
	
	
	
WebElement close=	driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_close\"]"));


close.click();



//swipe

WebElement heart1=  driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_singleImage\"]"));

scrollByID("android.widget.TextView", 0);


Thread.sleep(4000);

driver.findElementByXPath("(//android.widget.ImageView[@resource-id=\"com.tja:id/ivShortsThumbnail\"])[1]").click();




//AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvShorts1\"]"));

/*
 * driver.findElement(MobileBy.AndroidUIAutomator(
 * "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
 * 
 * driver.findElement(MobileBy.AndroidUIAutomator(
 * "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(100000)"
 * ));
 * 
 */




/*driver.findElement(MobileBy.AndroidUIAutomator(
		  "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(0)"));*/

//driver.findElementByXPath("(//android.widget.ImageView[@resource-id=\"com.tja:id/ivShortsThumbnail\"])[1]").click();


//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SHORTS\").instance(0))");


//(//android.widget.ImageView[@resource-id="com.tja:id/ivShortsThumbnail"])[1]

//heart1.click(); 



//WebElement list =  driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvShorts1\"]"));



//list.click();

			
	
}

}
