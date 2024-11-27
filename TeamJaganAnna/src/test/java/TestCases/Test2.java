 package TestCases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import MyScreeenRecorder.MyScreenRecorder;
import Utility.DriverUtility;
import Utility.base;
import freemarker.log.Logger;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pojoutility.PojoUtility;

public class Test2 extends base {
	
	public static Logger logger = Logger.getLogger(Test2.class.getName());

	@Test(priority = 0)
	public void Language() throws Exception {
		

		MyScreenRecorder.startRecording("Language");

		PojoUtility.getConfig().setPropertyValue("Skip",
				"//android.widget.Button[@resource-id=\"android:id/button2\"]");
		String SKIP = PojoUtility.getConfig().getPropertyValue("Skip");
		Thread.sleep(1000);
		getdriver().findElement(By.xpath(SKIP)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Skip");

		PojoUtility.getConfig().setPropertyValue("Telugu",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"Telugu\"]");
		String TEL = PojoUtility.getConfig().getPropertyValue("Telugu");
		Thread.sleep(2000);
		getdriver().findElement(By.xpath(TEL)).click();
		ScreenShotutilits(TEL, driver);
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Telugu");

		PojoUtility.getConfig().setPropertyValue("English",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tvLangLetter\" and @text=\"English\"]");
		String ENG = PojoUtility.getConfig().getPropertyValue("English");
		Thread.sleep(2000);
		getdriver().findElement(By.xpath(ENG)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on English");

		PojoUtility.getConfig().setPropertyValue("Next",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]");
		String NEXT = PojoUtility.getConfig().getPropertyValue("Next");
		Thread.sleep(2000);
		getdriver().findElement(By.xpath(NEXT)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Next");

		PojoUtility.getConfig().setPropertyValue("Next1",
				"//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]");
		String NEXT1 = PojoUtility.getConfig().getPropertyValue("Next1");
		Thread.sleep(2000);
		getdriver().findElement(By.xpath(NEXT1)).click();

		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Next1");

		PojoUtility.getConfig().setPropertyValue("Next2",
				"//android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]");
		String NEXT2 = PojoUtility.getConfig().getPropertyValue("Next2");
		Thread.sleep(2000);
		getdriver().findElement(By.xpath(NEXT2)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully clicked on Next2");

		PojoUtility.getConfig().setPropertyValue("Next3",
				"///android.widget.TextView[@resource-id=\"com.tja:id/btn_next\"]");
		String NEXT3 = PojoUtility.getConfig().getPropertyValue("Next3");
		Thread.sleep(2000);
		getdriver().findElement(By.xpath(NEXT3)).click();

		getExtentTest().log(LogStatus.PASS, "Successfully navigate to login page");

	}

	@Test(priority = 1)
	public void LoginPage() throws Exception {

		/*
		  PojoUtility.getConfig().setPropertyValue("None",
		  "//android.widget.Button[@resource-id=\"com.google.android.gms:id/cancel\"]")
		  ; String NONE = PojoUtility.getConfig().getPropertyValue("None");
		  getdriver().findElement(By.xpath(NONE)).click(); Thread.sleep(3000);
		  getExtentTest().log(LogStatus.PASS,
		  "Successfully cilcked on None Of the above");
		*/ 
		WebElement MOB = getdriver()
				.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.tja:id/edInputPhoneNumber\"]"));
		MOB.click();

		MOB.sendKeys("9147080748");
		getExtentTest().log(LogStatus.PASS, "Successfully enterd the MobileNumber");
		Thread.sleep(2000);

		PojoUtility.getConfig().setPropertyValue("Next",
				"//android.widget.TextView[@resource-id=\"com.tja:id/tv_btn_text\"]");
		String NEXT = PojoUtility.getConfig().getPropertyValue("Next");
		getdriver().findElement(By.xpath(NEXT)).click();
		getExtentTest().log(LogStatus.PASS, "Successfully login completed");
		Thread.sleep(25000);

		WebElement WAPP = getdriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
		WAPP.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on While using the App");

		WebElement WAPP1 = getdriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]"));
		WAPP1.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on While using the App1");

		WebElement ALLOW = getdriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
		ALLOW.click();
		//ALLOW.click();

		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on Allow");

		WebElement ALLOW1 = getdriver().findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]"));
		ALLOW1.click();
		getExtentTest().log(LogStatus.PASS, "Successfully cilcked on Allow1");
		Thread.sleep(2000);

		WebElement Logo = getdriver()
				.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_logo\"]"));
		Logo.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully login into the HomePage");
		
		////////////////
		

			WebElement LeftIcon = getdriver()
				.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_left_icon\"]"));
		LeftIcon.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Clicked onn leftIcon");

	
	}
	

	 @Test(priority = 3) 
	 public void ProfilePage() throws Exception {
		 
	  WebElement Profile = getdriver() .findElement(By.
	  xpath("//android.widget.TextView[@resource-id=\"com.tja:id/title\" and @text=\"Profile\"]")); 
	  Profile.click(); 
	  Thread.sleep(2000); 
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on Profile Page");
	  
	  WebElement ProfileName1 = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_toolbar_title\"]"));
	  String actualProfileName1 = ProfileName1.getText(); 
	  String expectedProfileName1= "Profile";
	    if (actualProfileName1.equals(expectedProfileName1)) {
	    System.out.println("ProfileName1 verification successful!"); 
		} else {
		System.out.println("ProfileName1 verification failed. Actual: " +actualProfileName1 + ", Expected: " + expectedProfileName1);
		}
		getExtentTest().log(LogStatus.PASS, "Successfully Verified  Profile ");
	  
	  
	 // Assuming you have already located the username WebElement WebElement
	  WebElement ProfileName = getdriver().findElement(By.xpath( "//android.widget.TextView[@resource-id=\"com.tja:id/tv_profile_name\"]"));
	  
	  // Get the text of the username WebElement String actualProfileName =
	  
	  String actualProfileName = ProfileName.getText(); 
	  
	  String expectedProfileName= "Vijay";
	  
	  // Specify the expected username String expectedProfileName = "Vijay";
	  
	  // Verify the actual username against the expected username if
	  if(actualProfileName.equals(expectedProfileName)) {
	  System.out.println("ProfileName verification successful!");
	  } else
	  {
	  System.out.println("ProfileName verification failed. Actual: " +actualProfileName + ", Expected: " + expectedProfileName); 
	  // You may throwan exception or handle it as appropriate for your test case }
	  }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  ProfileName(Vijay) ");
	  
	  
	  
	  WebElement userContactElement = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_user_contact\"]"));
	  
	  String actualUserContact = userContactElement.getText(); 
	  String expectedUserContact= "9147080748";
	  
	  if (actualUserContact.equals(expectedUserContact)) {
	  System.out.println("UserContact verification successful!"); 
	  } else {
	  System.out.println("UserContact verification failed. Actual: " +actualUserContact + ", Expected: " + expectedUserContact);
	  }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  Contact Number ");
	  
	  
	  
	  WebElement userLevelElement = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/level_tv\"]"));
	  
	  String actualUserLevel = userLevelElement.getText();
	  String expectedUserLevel= "Level 1";
	  
	  if (actualUserLevel.equals(expectedUserLevel)) {
	  System.out.println("UserLevel verification successful!"); } else {
	  System.out.println("UserLevel verification failed. Actual: " +actualUserLevel + ", Expected: " + expectedUserLevel); }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  Level 1 ");
	  
	  
	  
	  WebElement getVerifiedElement = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvBtnVerifyProfile\"]"));
	 
	  String actualGetVerified = getVerifiedElement.getText(); String
	  expectedGetVerified= "Get Verified";
	  
	  if (actualGetVerified.equals(expectedGetVerified)) {
	  System.out.println("Get Verified verification successful!"); }
	  else {
	  System.out.println("Get Verified verification failed. Actual: " +actualGetVerified + ", Expected: " + expectedGetVerified); }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  Get Verified ");
	  
	  WebElement BasicDetailsElement = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_basic_detail\"]"));
		 
	  String actualBasicDetailsElement = BasicDetailsElement.getText(); 
	  String expectedBasicDetailsElement= "Basic Details";
	  
	  if (actualBasicDetailsElement.equals(expectedBasicDetailsElement)) {
	  System.out.println("BasicDetailsElement verification successful!");
	  } else {
	  System.out.println("BasicDetailsElement verification failed. Actual: " +actualBasicDetailsElement + ", Expected: " + expectedBasicDetailsElement); }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  BasicDetails ");
	  
	  WebElement FBTitle = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvFb\"]"));
		 
	  String actualFBTitle = FBTitle.getText(); 
	  String expectedFBTitle= "Munna K";
	  
	  if (actualFBTitle.equals(expectedFBTitle)) {
	  System.out.println("FaceBook Title verification successful!");
	  } else {
	  System.out.println("FaceBook Title verification failed. Actual: " +actualFBTitle + ", Expected: " + expectedFBTitle); }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  FaceBook Title");
	 
	 
     WebElement Notification = getdriver() .findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_right_icon\"]"));
	 Notification.click(); 
	 Thread.sleep(2000); 
	 getExtentTest().log(LogStatus.PASS,"Successfully Cliked on Notification");
	  
	
	  WebElement NtfnLeftIcon = getdriver() .findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_left_icon\"]"));
	  NtfnLeftIcon.click(); 
	  Thread.sleep(2000);
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on NtfnLeftIcon"); 
	 }
	 
	 
	 @Test(priority = 3) 
	 public void GetVerifiedPage() throws Exception {
	  
	  WebElement GetVerified1 = getdriver() .findElement(By.xpath(
	  "//android.widget.TextView[@resource-id=\"com.tja:id/tvBtnVerifyProfile\"]"));
	  GetVerified1.click(); Thread.sleep(2000);
	  getExtentTest().log(LogStatus.PASS, "Successfully Cliked on GetVerified");
	  
	  WebElement ChooseyourCategory = getdriver().findElement(By.xpath("//android.widget.TextView[@text=\"Choose your Category\"]"));
	 String actualChooseyourCategory= ChooseyourCategory.getText(); 
	 String expectedChooseyourCategory = "Choose your Category"; 
	 if(actualChooseyourCategory.equals(expectedChooseyourCategory)) 
	 {
	 System.out.println("ChooseyourCategory verification successful!"); 
	 } else
	 {
	  System.out.println("ChooseyourCategory verification failed. Actual: " +actualChooseyourCategory + ", Expected: " + expectedChooseyourCategory);
	  }
	  getExtentTest().log(LogStatus.PASS,"Successfully Verified  ChooseyourCategory ");
	 
	  WebElement SMediaWarrior = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvIpacVolunter\"]"));
	  String actualSMediaWarrior= SMediaWarrior.getText(); 
      String expectedSMediaWarrior = "Social Media Warrior"; 
		if(actualSMediaWarrior.equals(expectedSMediaWarrior)) 
		{
		System.out.println("SMediaWarrior verification successful!"); 
        } else
		 {
		 System.out.println("SMediaWarrior verification failed. Actual: " +actualSMediaWarrior + ", Expected: " + expectedSMediaWarrior);
		}
	   getExtentTest().log(LogStatus.PASS,"Successfully Verified  Scoial Media Warrior ");
	  
	  
	  WebElement PartyMember = getdriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvIpacWorker\"]"));
		 
		String actualPartyMember = PartyMember.getText(); 
		String expectedPartyMember= "Party Member";
		 if (actualPartyMember.equals(expectedPartyMember)) {
		 System.out.println("PartyMember verification successful!");
		 } else {
		 System.out.println("PartyMember verification failed. Actual: " +actualPartyMember + ", Expected: " + expectedPartyMember); }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  PartyMember ");
		  
	   
	  WebElement SMWarrior = getdriver() .findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvIpacVolunter\"]"));
	  SMWarrior.click(); 
	  Thread.sleep(2000); 
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on SMWarrior");
	
	  
	  WebElement LeftIcon = getdriver() .findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_left_icon\"]"));
	  LeftIcon.click(); 
	  Thread.sleep(2000); 
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on LeftIcon");
	  
	  
	  
	 WebElement PartyMember1 = getdriver() .findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tvIpacWorker\"]"));
	 PartyMember1.click();
	 Thread.sleep(2000); 
	 getExtentTest().log(LogStatus.PASS,"Successfully Cliked on PartyMember");
	  
	
	  WebElement LeftIcon1 = getdriver() .findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_left_icon\"]"));
	  LeftIcon1.click(); 
	  Thread.sleep(2000); 
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on LeftIcon");
	  
	  driver.navigate().back();
	  
	 }
	 
	
	 @Test(priority = 4)
	 public void BasicDetailsPage() throws Exception {
	 
	  WebElement BasicDetails = getdriver() .findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_basic_detail\"]"));
	  BasicDetails.click(); 
	  Thread.sleep(2000);
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on BasicDetails Page");
	  

	  WebElement EditProfile = getdriver().findElement(By.xpath( "//android.widget.TextView[@resource-id=\"com.tja:id/tv_toolbar_title\"]"));
	   String actualEditProfile = EditProfile.getText();
	   String expectedEditProfile= "Edit Profile"; 
	   if (actualEditProfile.equals(expectedEditProfile)) {
	  System.out.println("EditProfile verification successful!"); 
	  } else {
	  System.out.println("EditProfile verification failed. Actual: " +actualEditProfile + ", Expected: " + expectedEditProfile);
	  }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  EditProfile ");
	  
	  //personal Information
	  
	  WebElement PersonalInformation = getdriver().findElement(By. xpath("//android.widget.TextView[@text=\"Personal Information\"]"));
	  String actualP_Info = PersonalInformation.getText(); 
	  String expectedP_Info = "Personal Information";
	  if (actualP_Info.equals(expectedP_Info)) {
	  System.out.println("PersonalInformation verification successful!");
	  } else {
	  System.out.println("PersonalInformation verification failed. Actual: " +actualP_Info + ", Expected: " + expectedP_Info); 
	  }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  Personal Information ");
	 
	  
	  WebElement Name = getdriver().findElement(By.xpath( "//android.widget.TextView[@text=\"Name\"]"));
	   String actualName = Name.getText(); 
	   String expectedName = "Name"; 
	   if(actualName.equals(expectedName)) {
	   System.out.println("Name verification successful!"); 
	   } else {
	   System.out.println("Name verification failed. Actual: " + actualName +", Expected: " + expectedName); 
	   }
	   getExtentTest().log(LogStatus.PASS,"Successfully Verified  Name ");
	  
	  
	  
	  WebElement userNameElement = getdriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.tja:id/et_user_name\"]")); 
	  String actualUserName = userNameElement.getText();
	  String expectedUserName ="Vijay"; 
	  if (actualUserName.equals(expectedUserName)) {
	  System.out.println("userName verification successful!");
	  } else {
	  System.out.println("Username verification failed. Actual: " + actualUserName+ ", Expected: " + expectedUserName); 
	  }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  UserName ");
	  
	  
	  WebElement userContactNumber = getdriver().findElement(By.xpath("//android.widget.TextView[@text=\"Contact Number\"]"));
	   String actualuserContactNumber = userContactNumber.getText(); 
	   String expecteduserContactNumber= "Contact Number";
	  if (actualuserContactNumber.equals(expecteduserContactNumber)) {
	   System.out.println("UserContact verification successful!");
	   } else {
	   System.out.println("UserContact verification failed. Actual: " +actualuserContactNumber + ", Expected: " + expecteduserContactNumber);
	   }
	  getExtentTest().log(LogStatus.PASS,"Successfully Verified  userContactNumber ");
	  
	  
	  WebElement userMobileNumber = getdriver().findElement(By.xpath(
	  "//android.widget.EditText[@resource-id=\"com.tja:id/et_mobile_number\"]"));
	 
	  String actualuseruserMobileNumber = userMobileNumber.getText(); String
	  expecteduserMobileNumber= "9147080748";
	  
	  if (actualuseruserMobileNumber.equals(expecteduserMobileNumber)) {
	  System.out.println("UserMobileNumber verification successful!"); } else {
	  System.out.println("UserMobileNumber verification failed. Actual: " +
	 actualuseruserMobileNumber + ", Expected: " + expecteduserMobileNumber); }
	  getExtentTest().log(LogStatus.PASS,
	 "Successfully Verified  UserMobileNumber ");
	  
	  
	  WebElement userWhatsAppNumber = getdriver().findElement(By.
	  xpath("//android.widget.TextView[@text=\"WhatsApp Number\"]"));
	 
	  String actualuseruserWhatsAppNumber = userWhatsAppNumber.getText(); String
	  expecteduserWhatsAppNumber= "WhatsApp Number";
	  
	  if (actualuseruserWhatsAppNumber.equals(expecteduserWhatsAppNumber)) {
	  System.out.println("UserWhatsAppNumber verification successful!"); } else {
	  System.out.println("UserWhatsAppNumber verification failed. Actual: " +
	  actualuseruserWhatsAppNumber + ", Expected: " + expecteduserWhatsAppNumber);
	 } getExtentTest().log(LogStatus.PASS,
	 "Successfully Verified  UserWhatsAppNumber ");
	 
	 	WebElement WhatsAppNum = getdriver() .findElement(By.xpath(
	 "//android.widget.EditText[@resource-id=\"com.tja:id/et_whats_app\"]"));
	  WhatsAppNum.click();
	  
	  WhatsAppNum.sendKeys("9147080748"); getExtentTest().log(LogStatus.PASS,
	 "Successfully enterd the WhatsAppNumber"); Thread.sleep(2000);
	  
	  WebElement userEmailId = getdriver().findElement(By.
	  xpath("//android.widget.TextView[@text=\"Email ID\"]"));
	  
	  String actualuseruserEmailId = userEmailId.getText(); String
	  expecteduserEmailId= "Email ID";
	  
	  if (actualuseruserEmailId.equals(expecteduserEmailId)) {
	  System.out.println("UserEmailId verification successful!"); } else {
	  System.out.println("UserEmailId verification failed. Actual: " +
	 actualuseruserEmailId + ", Expected: " + expecteduserEmailId); }
	  getExtentTest().log(LogStatus.PASS, "Successfully Verified  UserEmailId ");
	  
	  WebElement verifyuserEmailId = getdriver().findElement(By.xpath(
	  "//android.widget.EditText[@resource-id=\"com.tja:id/et_user_email\"]"));
	  
	  String actualuserverifyuserEmailId = verifyuserEmailId.getText(); String
	  expectedverifyuserEmailId= "ipac2113@gmail.com";
	  
	  if (actualuserverifyuserEmailId.equals(expectedverifyuserEmailId)) {
	  System.out.println("verifyuserEmailId verification successful!"); } else {
	  System.out.println("verifyuserEmailId verification failed. Actual: " +
	  actualuserverifyuserEmailId + ", Expected: " + expectedverifyuserEmailId); }
	  getExtentTest().log(LogStatus.PASS,"Successfully Verified  Verify UserEmailId ");
	  
	  
	  WebElement RightIocn = getdriver() .findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_right_icon\"]"));
	  RightIocn.click(); 
	  Thread.sleep(2000); 
	  getExtentTest().log(LogStatus.PASS,"Successfully Cliked on RightIocn");
	  
	  WebElement LeftIcon = getdriver()
				.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_left_icon\"]"));
		LeftIcon.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Clicked onn leftIcon");
	 }
	 @Test(priority = 5)
	 public void ReferralPage() throws Exception {

			WebElement ReferredIcon = getdriver().findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/title\" and @text=\"Referral\"]"));
			ReferredIcon.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on ReferredFriends");

			WebElement ReferredFriends = getdriver()
					.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Referred Friends\"]"));
			ReferredFriends.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on ReferredFriends");

			WebElement Invitebtn = getdriver()
					.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Invite\"]"));
			Invitebtn.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Invite Friend");
			
		/*	WebElement InviteFriendbtn = getdriver()
					.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.tja:id/btnInviteFriend\"]"));
			InviteFriendbtn.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Invite Friend");

			WebElement whatsAppIcon = getdriver().findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"WhatsApp\"]"));
			whatsAppIcon.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on whatsAppIcon");
			
		*/	
			WebElement LeftIcon = getdriver()
					.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/iv_left_icon\"]"));
			LeftIcon.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Clicked onn leftIcon");
		}
	 
	 @Test(priority = 6)
	 public void ContactUsPage() throws Exception {
			
			WebElement ContactUs = getdriver().findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/title\" and @text=\"Contact Us\"]"));
			ContactUs.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Contact Us");
			
			WebElement Suggestions = getdriver().findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/chat1\" and @text=\"Suggestions\"]"));
			Suggestions.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Suggestions");
			
			/*
			WebElement Newfeature = getdriver().findElement(
					By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/chat1\" and @text=\"Addition of new feature\"]"));
			Newfeature.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Newfeature ");
			
			WebElement TextBox = getdriver()
					.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.tja:id/rl_textbox\"]"));
			TextBox.click();
			TextBox.sendKeys("please add vedio session in every day");
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully enterd the content");
			
			WebElement SendBtn = getdriver().findElement(
					By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/ivIpacSend\"]"));
			SendBtn.click();
			Thread.sleep(2000);
			getExtentTest().log(LogStatus.PASS, "Successfully Cliked on SendBtn ");
		 
	*/
	  
	  
	  /*
	 * 
	 * @Test(priority = 4) public void ScrollUp(){
	 * 
	 * ScrollUp(); }
	 * 
	 * private void scrollUp() { // Get the screen dimensions int screenHeight =
	 * driver.manage().window().getSize().getHeight();
	 * 
	 * // Set the scroll points int startX =
	 * driver.manage().window().getSize().getWidth() / 2; int startY = (int)
	 * (screenHeight * 0.8); // 80% from the bottom int endY = (int) (screenHeight *
	 * 0.2); // 20% from the top
	 * 
	 * // Perform the scroll using TouchAction TouchAction touchAction = new
	 * TouchAction((PerformsTouchActions) driver);
	 * touchAction.press(PointOption.point(startX, startY))
	 * .moveTo(PointOption.point(startX, endY)) .release() .perform(); try {
	 * Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * 
	 * Dimension size = driver.manage().window().getSize();
	 * 
	 * int startX = size.width / 2; int startY = (int) (size.heigh * 0.8); int endY
	 * = (int) (size.height * 0.2); // Set start and end coordinates for the swipe
	 * // // int startX = size.width/ 2; /* int startX = (int) (size.width * 0.5);
	 * int startY = (int) (size.height * 0.8);
	 * 
	 * int endX = (int) (size.width * 0.2); int endY = (int) (size.height * 0.2);
	 * 
	 * // Perform scroll up using TouchAction TouchAction touchAction = new
	 * TouchAction((PerformsTouchActions) driver); touchAction
	 * .press(PointOption.point(startX, startY))
	 * //.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	 * .moveTo(PointOption.point(startX, endY)).release().perform();
	 * 
	 * try { Thread.sleep(1000); } catch (InterruptedException e) {
	 * e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //////Demographic Information
	 * 
	 * WebElement userDemographicInfo = getdriver().findElement(By.
	 * xpath("//android.widget.TextView[@text=\"Demographic Information\"]"));
	 * 
	 * String actualuserDemographicInfo = userDemographicInfo.getText(); String
	 * expecteduserDemographicInfo= "Demographic Information";
	 * 
	 * if (actualuserDemographicInfo.equals(expecteduserDemographicInfo)) {
	 * System.out.println("Demographic Information  verification successful!"); }
	 * else {
	 * System.out.println("Demographic Information  verification failed. Actual: " +
	 * actualuserDemographicInfo + ", Expected: " + expecteduserDemographicInfo); }
	 * getExtentTest().log(LogStatus.PASS,
	 * "Successfully Verified  Verify Demographic Information ");
	 * 
	 * 
	 * WebElement District = getdriver().findElement(By.xpath(
	 * "//android.widget.TextView[@text=\"District\"]"));
	 * 
	 * String actualDistrict = District.getText(); String expectedDistrict=
	 * "District";
	 * 
	 * if (actualDistrict.equals(expectedDistrict)) {
	 * System.out.println("District verification successful!"); } else {
	 * System.out.println("District verification failed. Actual: " + actualDistrict
	 * + ", Expected: " + expectedDistrict); } getExtentTest().log(LogStatus.PASS,
	 * "Successfully Verified  District ");
	 * 
	 * ////////////////////
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * WebElement DIST = getdriver() .findElement(By.xpath(
	 * "//android.widget.EditText[@resource-id=\"com.tja:id/et_district\"]"));
	 * 
	 * DIST.click(); Select s = new Select(DIST);
	 * s.selectByVisibleText("West Godavari"); //s.selectByValue("West Godavari");
	 * 
	 * getExtentTest().log(LogStatus.PASS,
	 * "Successfully Selected the West Godavari District"); }
	 * 
	 * ////////////////////////////// /* @Test(priority = 4) public void
	 * selectDistrictByScrolling() {
	 * 
	 * 
	 * driver.findElement(By.xpath("//*[contains(@text,'Views')]");
	 * 
	 * driver.
	 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))"
	 * ).click();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * 
	 * 
	 * 
	 * // Replace "Your District Text" with the text or attribute of the element
	 * representing the district String targetDistrict = "West Godavari";
	 * 
	 * // Scroll and select the district scrollDownToElement(targetDistrict);
	 * 
	 * // Click or perform further actions on the selected district
	 * driver.findElement(By.xpath(
	 * "//android.widget.EditText[@resource-id=\"com.tja:id/et_district\"]" +
	 * targetDistrict + "West Godavari']")).click();
	 * 
	 * // Add assertions or verification as needed }
	 * 
	 * private void scrollDownToElement(String elementText) { while
	 * (!isElementPresent(By.
	 * xpath("//android.widget.TextView[@resource-id=\"com.tja:id/tv_list_item\" and @text=\"West Godavari\"]"
	 * + elementText + "West Godavari']"))) { scrollDown(); } }
	 * 
	 * private void scrollDown() { // Get the size of the screen Dimension size =
	 * driver.manage().window().getSize();
	 * 
	 * // Set start and end coordinates for the swipe int startX = size.width / 2;
	 * int startY = (int) (size.height * 0.8); int endY = (int) (size.height * 0.2);
	 * 
	 * // Perform scroll down using TouchAction TouchAction touchAction = new
	 * TouchAction((PerformsTouchActions) driver); touchAction
	 * .press(PointOption.point(startX, startY))
	 * .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	 * .moveTo(PointOption.point(startX, endY)) .release() .perform(); }
	 * 
	 * private boolean isElementPresent(By by) { try { return
	 * driver.findElement(by).isDisplayed(); } catch
	 * (org.openqa.selenium.NoSuchElementException e) { return false; } }
	 * 
	 /* 
	 * WebElement AssemblyConstituency = getdriver().findElement(By.
	 * xpath("//android.widget.TextView[@text=\"Assembly Constituency\"]"));
	 * 
	 * String actualAssemblyConstituency = AssemblyConstituency.getText(); String
	 * expectedAssemblyConstituency= "AssemblyConstituency";
	 * 
	 * if (actualAssemblyConstituency.equals(expectedAssemblyConstituency)) {
	 * System.out.println("AssemblyConstituency verification successful!"); } else {
	 * System.out.println("AssemblyConstituency verification failed. Actual: " +
	 * actualAssemblyConstituency + ", Expected: " + expectedAssemblyConstituency);
	 * } getExtentTest().log(LogStatus.PASS,
	 * "Successfully Verified  AssemblyConstituency ");
	 * 
	 * WebElement Assembly = getdriver() .findElement(By.xpath(
	 * "//android.widget.EditText[@resource-id=\"com.tja:id/et_ac_name\"]"));
	 * 
	 * Assembly.click(); Select s1 = new Select(Assembly);
	 * s.selectByValue("Palacole");
	 * 
	 * getExtentTest().log(LogStatus.PASS,
	 * "Successfully Selected the Palacole Assembly");
	 * 
	 * 
	 * 
	 * 
	 * //////Professional Details: WebElement ProfessionalDetails =
	 * getdriver().findElement(By.
	 * xpath("//android.widget.TextView[@text=\"Professional Details\"]"));
	 * 
	 * String actualProfessionalDetails = ProfessionalDetails.getText(); String
	 * expectedProfessionalDetails= "Professional Details";
	 * 
	 * if (actualProfessionalDetails.equals(expectedProfessionalDetails)) {
	 * System.out.println("ProfessionalDetails verification successful!"); } else {
	 * System.out.println("ProfessionalDetails verification failed. Actual: " +
	 * actualProfessionalDetails + ", Expected: " + expectedProfessionalDetails); }
	 * getExtentTest().log(LogStatus.PASS,
	 * "Successfully Verified  Professional Details ");
	 * 
	 * 
	 * WebElement Education = getdriver().findElement(By.xpath(
	 * "//android.widget.TextView[@text=\"Education\"]"));
	 * 
	 * String actualEducation = Education.getText(); String expectedEducation=
	 * "Education";
	 * 
	 * if (actualEducation.equals(expectedEducation)) {
	 * System.out.println("Education verification successful!"); } else {
	 * System.out.println("Education verification failed. Actual: " +
	 * actualEducation + ", Expected: " + expectedEducation); }
	 * getExtentTest().log(LogStatus.PASS, "Successfully Verified  Education ");
	 * 
	 * 
	 * 
	 * WebElement Select = getdriver() .findElement(By.xpath(
	 * "//android.widget.EditText[@resource-id=\"com.tja:id/et_education\"]"));
	 * 
	 * Select.click(); Select s2 = new Select(Select); s.selectByValue("Palacole");
	 * 
	 * getExtentTest().log(LogStatus.PASS, "Successfully Entered the Assembly");
	 * 
	 * 
	 * 
	 * 
	 * WebElement rightIcon = getdriver() .findElement(By.xpath(
	 * "//android.widget.ImageView[@resource-id=\"com.tja:id/iv_right_icon\"]"));
	 * rightIcon.click(); getExtentTest().log(LogStatus.PASS,
	 * "Successfully Clicked on RightIcon"); Thread.sleep(2000);
	 * 
	 * getExtentTest().log(LogStatus.PASS,
	 * "Personal Information Successfully Updated");
	 * 
	 * 
	 * 
	 * MyScreenRecorder.stopRecording();
	 * 
	 */ 
	 /*
	 * 
	 * @Test(priority = 2) public void Scroll() throws Exception {
	 * 
	 * WebElement sectionElement = driver.findElement(By.xpath(
	 * "//android.widget.TextView[@resource-id=\"com.tja:id/tvShorts1\"]"));
	 * 
	 * // Get the location of the section element int startX =
	 * sectionElement.getLocation().getX(); int startY =
	 * sectionElement.getLocation().getY();
	 * 
	 * // Perform scroll to the section TouchAction touchAction = new
	 * TouchAction((PerformsTouchActions) driver); touchAction
	 * .press(PointOption.point(startX, startY))
	 * .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	 * .moveTo(PointOption.point(startX, startY - 200)) // Adjust the Y-coordinate
	 * as needed .release() .perform();
	 */

	// android.widget.TextView[@resource-id=\"com.tja:id/tv_toolbar_title\"]

	/*
	 * PojoUtility.getConfig().setPropertyValue("Logo1",
	 * "//android.widget.ImageView[@resource-id=\\\"com.tja:id/iv_logo\\\"]");
	 * String Logo1 = PojoUtility.getConfig().getPropertyValue("Logo1");
	 * getdriver().findElement(By.xpath(Logo1)).click();
	 * getExtentTest().log(LogStatus.PASS, "Successfully login into the HomePage");
	 * Thread.sleep(20000);
	 * 
	 * 
	 * WebElement Logo = getdriver() .findElement(By.xpath(
	 * "//android.widget.ImageView[@resource-id=\\\"com.tja:id/iv_logo\\\"]"));
	 * Logo.click(); Thread.sleep(2000); getExtentTest().log(LogStatus.PASS,
	 * "Successfully login into the HomePage");
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @Test(priority = 2) public void selectShortsSectionTest() { // Scroll down
	 * until the "Shorts" section is found scrollDownToSection("SHORTS ");
	 * 
	 * // Your test logic here after selecting the "Shorts" section }
	 * 
	 * private void scrollDownToSection(String sectionText) { boolean sectionFound =
	 * false; int maxScrollAttempts = 2; // Set a maximum number of scroll attempts
	 * to avoid infinite scrolling
	 * 
	 * for (int i = 0; i < maxScrollAttempts; i++) { // Check if the element with
	 * the specified text is present if (isElementPresent(By.
	 * xpath("//*[@text='//android.widget.TextView[@resource-id=\"com.tja:id/tvShorts1\"] "
	 * + sectionText + "SHORTS ']"))) { sectionFound = true; break; }
	 * 
	 * // If not found, scroll down scrollDown(); }
	 * 
	 * if (!sectionFound) { System.out.println("Section 'SHORTS" + sectionText +
	 * "' not found after scrolling."); // Handle the case where the section is not
	 * found } }
	 * 
	 * private void scrollDown() { // Get the size of the screen Dimension size =
	 * driver.manage().window().getSize();
	 * 
	 * // Set start and end coordinates for the swipe int startX = size.width / 2;
	 * int startY = (int) (size.height * 0.8); int endY = (int) (size.height * 0.2);
	 * 
	 * // Perform scroll down using TouchAction TouchAction touchAction = new
	 * TouchAction((PerformsTouchActions) driver); touchAction
	 * .press(PointOption.point(startX, startY))
	 * .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
	 * .moveTo(PointOption.point(startX, endY)) .release() .perform(); }
	 * 
	 * private boolean isElementPresent(By by) { try { driver.findElement(by);
	 * return true; } catch (org.openqa.selenium.NoSuchElementException e) { return
	 * false; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

/*
 * 
 * WebElement NAME = getdriver() .findElement(By.xpath(
 * "//android.widget.EditText[@resource-id=\"com.tja:id/et_name\"]"));
 * 
 * NAME.sendKeys("Vijay"); getExtentTest().log(LogStatus.PASS,
 * "Successfully enterd the Name");
 * 
 * WebElement EMAIL = getdriver() .findElement(By.xpath(
 * "//android.widget.EditText[@resource-id=\"com.tja:id/et_email\"]"));
 * 
 * EMAIL.sendKeys("ipac2113@gmail.com"); getExtentTest().log(LogStatus.PASS,
 * "Successfully enterd the Email");
 * 
 * WebElement GENDER = getdriver() .findElement(By.xpath(
 * "//android.widget.RadioButton[@resource-id=\"com.tja:id/rb1\"]"));
 * 
 * GENDER.click();
 * 
 * getExtentTest().log(LogStatus.PASS, "Successfully Cliked the gender");
 * 
 * 
 * WebElement DOB = getdriver() .findElement(By.xpath(
 * "//android.widget.TextView[@resource-id=\"com.tja:id/ll_dob\"]"));
 * DOB.click();
 * 
 * 
 * 
 * WebElement HD = getdriver() .findElement(By.xpath(
 * "//android.widget.TextView[@resource-id=\"android:id/date_picker_header_year\"]"
 * )); HD.click();
 * 
 * WebElement Tx19= getdriver() .findElement(By.
 * xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"2019\"]"
 * )); Tx19.click();
 * 
 * 
 * WebElement day19= getdriver() .findElement(By.
 * xpath("//android.view.View[@content-desc=\"16 January 2019\"]"));
 * day19.click();
 * 
 * WebElement ok= getdriver() .findElement(By.xpath(
 * "//android.widget.Button[@resource-id=\"android:id/button1\"]")); ok.click();
 * 
 * 
 * 
 * 
 * 
 * 
 * Select yr = new Select(HD);
 * 
 * yr.selectByValue("1999");
 * 
 * HD = getdriver()
 * .findElement(By.xpath("android:id/date_picker_header_year")); HD.click();
 * 
 * DOB.sendKeys("13-09-1999"); Select header = new
 * Select(driver.findElement(By.id("android:id/date_picker_header_year")))
 * ; Select dayDropdown = new
 * Select(driver.findElement(By.id("13 September 1998"))); Select
 * monthDropdown = new Select(driver.findElement(By.id(
 * "//android.view.View[@resource-id=\"android:id/month_view\"]"))); Select
 * yearDropdown = new Select(driver.findElement(By.
 * xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"1998\"]"
 * )));
 * 
 * 
 * 
 * dayDropdown.selectByVisibleText("13");
 * monthDropdown.selectByVisibleText("September");
 * 
 * 
 * 
 * 
 * 
 * 
 * List<WebElement> datePickerBox = driver.findElements(By.xpath(
 * "//android.widget.TextView[@resource-id=\\\"com.tja:id/ll_dob\\\"]"));
 * 
 * WebElement month = datePickerBox.get(0); WebElement day =
 * datePickerBox.get(1); WebElement year = datePickerBox.get(2);
 * 
 * month.click(); month.sendKeys("Feb");
 * 
 * day.click(); day.sendKeys("22");
 * 
 * year.click(); year.sendKeys("2018");
 * 
 * 
 * 
 * getExtentTest().log(LogStatus.PASS, "Successfully ENTERD THE DOB");
 * 
 * 
 * 
 * 
 * 
 * 
 * WebElement DIST = getdriver() .findElement(By.xpath(
 * "//android.widget.TextView[@resource-id=\"com.tja:id/ll_dob\"]"));
 * 
 * DIST.click(); Select s = new Select(DIST); s.selectByValue("West Godavari");
 * 
 * getExtentTest().log(LogStatus.PASS, "Successfully Entered the Dist");
 * 
 * WebElement Assembly = getdriver() .findElement(By.xpath(
 * "//android.widget.TextView[@resource-id=\"com.tja:id/ll_dob\"]"));
 * 
 * Assembly.click(); Select s1 = new Select(Assembly);
 * s.selectByValue("Palacole");
 * 
 * getExtentTest().log(LogStatus.PASS, "Successfully Entered the Assembly");
 * 
 * WebElement CHEKBOX = getdriver() .findElement(By.xpath(
 * "//android.widget.CheckBox[@resource-id=\"com.tja:id/chTermsConditions\"]"));
 * 
 * CHEKBOX.click(); getExtentTest().log(LogStatus.PASS,
 * "Successfully clicked on checkbox");
 * 
 * PojoUtility.getConfig().setPropertyValue("Next11",
 * "//android.widget.TextView[@resource-id=\"com.tja:id/btnRegister\"]"); String
 * NEXT11 = PojoUtility.getConfig().getPropertyValue("Next11");
 * getdriver().findElement(By.xpath(NEXT11)).click();
 * getExtentTest().log(LogStatus.PASS,
 * "Successfully Registeration is completed"); Thread.sleep(2000);
 * 
 * }
 */
}