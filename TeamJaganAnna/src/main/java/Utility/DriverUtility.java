package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.IExtentTestClass;
import com.relevantcodes.extentreports.LogStatus;

import freemarker.log.Logger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import supporters.ScreenShotutility;

@SuppressWarnings("unused")
public class DriverUtility {

	private static String browser;
	private static WebDriver driver;
	private static ExtentReports er;
	private static ExtentTest et;
	private static Logger log;
	public static RemoteWebDriver mobileDriver;
	public static String appiumserver = "0.0.0.0";
	public static int appiumPort = 4723;
	static URL appiumURL = null;

	@Parameters("browser")
	@BeforeSuite
	public static void openBrowser(@Optional("chromebrowser") String browser) {
		er = new ExtentReports("D:\\IPAC Projects\\TeamJaganAnna\\ExtentReports\\Reports.html");

	}

	public static RemoteWebDriver initiliazeDriver() {

		try {
			appiumURL = new URL("http://" + appiumserver + ":" + appiumPort + "/wd/hub");
			mobileDriver = new RemoteWebDriver(appiumURL, setAppCapabilitiesAndroid());
			// extentTest.log(LogStatus.PASS, "application has been Lanuched Succuesfully");
		} catch (Exception e) {
			e.printStackTrace();

		}

		return mobileDriver;
		
	}

	public static DesiredCapabilities setAppCapabilitiesAndroid() {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability("deviceName", "Pixel 6a");
		//capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("platformVersion", "14");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("Automation Name", " UiAutomator2");
		capabilities.setCapability("Udid", "32281JEGR08738");
		//capabilities.setCapability("Udid", "10BCAX0CX0000K0");
		// capabilities.setCapability("Udid", "32281JEGR08738");
		// capabilities.setCapability(MobileCapabilityType.APP,
		// "D2D/Applications/app-staging-release.apk");
		capabilities.setCapability("appPackage", "com.tja");
		capabilities.setCapability("appActivity", "com.tja.activities.LandingActivity");
		// capabilities.setCapability("appActivity",
		// "com.d2.app.activities.ChooseLanguageStartActivity");

		return capabilities;

	}
	
	
	
	@BeforeMethod
	public static void beforemethod(Method m) {
		et = er.startTest(m.getName());
		;
		log = Logger.getLogger(m.getName());
	}

	public static Logger getlog() {
		return log;
	}
	

	public static String ScreenShotutilitys(String imgName, RemoteWebDriver mobileDriver) throws IOException {
		String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) mobileDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D:\\IPAC Projects\\TeamJaganAnna\\ScreenShots" + imgName + ".png"));

		return imgName;

	}


/*
	
	 * public static String ScreenShotutilitys(String imgName, WebDriver driver)
	 * throws IOException { String dateName = new
	 * SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date()); TakesScreenshot
	 * ts = (TakesScreenshot) driver; File src =
	 * ts.getScreenshotAs(OutputType.FILE);
	 * 
	 * FileUtils.copyFile(src, new
	 * File("D:\\IPAC Projects\\TeamJaganAnna\\ScreenShots" + imgName + ".png"));
	 * 
	 * return imgName;
	 * 
	 * }
	 */
	
	
	@AfterMethod

	public static void AfterMethod(ITestResult result,Method m) throws IOException {
		/*er.endTest(et);
		er.flush();*/
		if(result.getStatus()==ITestResult.FAILURE){
			et.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			
			et.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
			
			TakesScreenshot ts=(TakesScreenshot)mobileDriver;
			
		     File src=ts.getScreenshotAs(OutputType.FILE);

		     FileUtils.copyFile(src, new File("\\TeamJaganAnna\\" +result.getName()+".png"));
		     
	         FileUtils.copyFile(src, new File("D:\\IPAC Projects\\TeamJaganAnna\\ScreenShots" +result.getName()+".png"));
	        
	         String screenShotPath = ScreenShotutility.ScreenShotutilitys("imgName", mobileDriver);
	        
	         et.log(LogStatus.FAIL, result.getThrowable());
	        
	         et.log(LogStatus.FAIL, "Snapshot below:" +et.addScreenCapture(screenShotPath));
	         
	         
		
			er.endTest(et);
			
			er.flush();
			
		}
		else if(result.getStatus()==ITestResult.SKIP){
			
			et.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			
			et.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
			
			
			
		}
		
		
		er.endTest(et);; //ending test and ends the current test and prepare to create html report
		
		er.flush();
	}
	
	
	
	/*
	@AfterMethod
	public static void AfterMethod(ITestResult result, Method m) throws IOException {
		er.endTest(et);

		// Handle the result and perform necessary actions...

		if (result.getStatus() == ITestResult.FAILURE) {
			et.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
			et.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());

			// Take a screenshot on test failure
			if (mobileDriver != null) {
				try {
					TakesScreenshot ts = (TakesScreenshot) mobileDriver;
					File src = ts.getScreenshotAs(OutputType.FILE);
					String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
					String screenshotPath = "D:\\IPAC Projects\\TeamJaganAnna\\ScreenShots" + result.getName()
							+ "_" + dateName + ".png";

					// Save the screenshot to a file
					FileUtils.copyFile(src, new File(screenshotPath));

					// Convert the screenshot to Base64
					Path screenshotPathObj = Paths.get(screenshotPath);
					byte[] screenshotBytes = Files.readAllBytes(screenshotPathObj);
					String base64 = Base64.getEncoder().encodeToString(screenshotBytes);

					// Log the screenshot in the report
					et.log(LogStatus.FAIL,
							"Snapshot below: " + et.addScreenCapture("data:image/png;base64," + screenshotBytes));
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("mobileDriver is null. Cannot take a screenshot.");
			}

			er.endTest(et);
			er.flush();
		} else if (result.getStatus() == ITestResult.SKIP) {
			et.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			et.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
		}

		er.endTest(et);
		er.flush();
	}
*/
	@AfterTest
	public void endreport() {
		// driver.close();
		er.flush();
		er.close();
	}

	public static WebDriver getmobileDriver() {
		return mobileDriver;

	}

	public static WebDriver getdriver() {
		return mobileDriver;

	}

	public static ExtentTest getExtentTest() {

		return et;
	}

	@AfterSuite
	public static void CloseBrowser() {
		if (mobileDriver != null) {
			// driver.close();
			System.out.println("Browser Wil be Closed");

		} else {
			System.out.println("driver value will be null");
		}
	}
}

//PropertyConfigurator.configure("D:\\Selenium\\SmartCitizen\\Log4j.properties");

/*
 * if(browser.equalsIgnoreCase("chromebrowser")){
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe"); driver=new
 * ChromeDriver(); driver.manage().deleteAllCookies();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
 * 
 * 
 * }else if (browser.equalsIgnoreCase("firefoxbrowser")) {
 * System.setProperty("webdriver.gecko.driver",
 * "D:\\Smartcitizen_Connect\\New_Maven_Project\\browsers\\geckodriver-v0.21.0-win32\\geckodriver.exe"
 * ); driver=new FirefoxDriver(); driver.manage().deleteAllCookies();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
 * 
 * }else if (browser.equalsIgnoreCase("internetexplorer")) {
 * System.setProperty("webdriver.ie.driver",
 * "D:\\Selenium jars\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
 * driver=new InternetExplorerDriver(); driver.manage().deleteAllCookies();
 * driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
 * 
 * } else{ System.out.println("Driver value is null"); }
 */

// Other methods...

/*
 * public static void getResult(ITestResult result) throws Exception {
 * 
 * er.endTest(et); if (result.getStatus() == ITestResult.FAILURE) {
 * 
 * // String screenshotPath = path.getAbsolutePath() + "\\FailedTestCase_" +
 * FileUtility.Timestamp() + ".png"; String screenShotPath =
 * ScreenShotutility.ScreenShotutilitys("imgName", mobileDriver); File shot =
 * ((TakesScreenshot) mobileDriver).getScreenshotAs(OutputType.FILE);
 * FileUtils.copyFile(shot, new File(screenShotPath)); InputStream is = new
 * FileInputStream(screenShotPath); byte[] ssBytes = IOUtils.toByteArray(is);
 * String base64 = Base64.getEncoder().encodeToString(ssBytes);
 * 
 * et.log(LogStatus.FAIL, result.getThrowable());
 * 
 * 
 * et.log(LogStatus.FAIL, "Snapshot below: " +
 * et.addScreenCapture(screenShotPath));
 * 
 * et.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
 * et.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
 * 
 * } else if (result.getStatus() == ITestResult.SKIP) { et.log(LogStatus.SKIP,
 * "Test Case Skipped is " + result.getName()); }
 * mobileDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //
 * mobileDriver.manage().wait(10); // mobileDriver.close(); mobileDriver.quit();
 * }
 */

/*
 * @AfterMethod
 * 
 * public static void AfterMethod(ITestResult result,Method m) throws
 * IOException {
 * 
 * er.endTest(et); er.flush();
 * 
 * 
 * if(result.getStatus()==ITestResult.FAILURE){ et.log(LogStatus.FAIL,
 * "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
 * et.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to
 * add error/exception in extent report String dateName = new
 * SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date()); TakesScreenshot
 * ts=(TakesScreenshot)driver; File src=ts.getScreenshotAs(OutputType.FILE);
 * 
 * FileUtils.copyFile(src, new
 * File("D:\\ScreenShots\\"+result.getName()+".png")); String screenShotPath =
 * ScreenShotutility.ScreenShotutilitys("imgName", driver);
 * 
 * et.log(LogStatus.FAIL, result.getThrowable());
 * 
 * 
 * et.log(LogStatus.FAIL, "Snapshot below: " +
 * et.addScreenCapture(screenShotPath));
 * 
 * er.endTest(et); er.flush();
 * 
 * } else if(result.getStatus()==ITestResult.SKIP){ et.log(LogStatus.SKIP,
 * "Test Case SKIPPED IS " + result.getName()); } else
 * if(result.getStatus()==ITestResult.SUCCESS){ et.log(LogStatus.PASS,
 * "Test Case PASSED IS " + result.getName());
 * 
 * 
 * 
 * }
 * 
 * 
 * er.endTest(et);; //ending test and ends the current test and prepare to
 * create html report er.flush(); }
 */
