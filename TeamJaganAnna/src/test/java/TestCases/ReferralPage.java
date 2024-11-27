package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Utility.DriverUtility;

public class ReferralPage extends DriverUtility {

	public void ReferralPage() throws Exception {

		WebElement ReferredIcon = getmobileDriver().findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/title\" and @text=\"Referral\"]"));
		ReferredIcon.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on ReferredFriends");

		WebElement ReferredFriends = getmobileDriver()
				.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Referred Friends\"]"));
		ReferredFriends.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on ReferredFriends");

		WebElement Invitebtn = getmobileDriver()
				.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Invite\"]"));
		Invitebtn.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Invite Friend");
		
		WebElement InviteFriendbtn = getmobileDriver()
				.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.tja:id/btnInviteFriend\"]"));
		InviteFriendbtn.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Invite Friend");

		WebElement whatsAppIcon = getmobileDriver().findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"WhatsApp\"]"));
		whatsAppIcon.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on whatsAppIcon");
	}
}
