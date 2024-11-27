package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Utility.DriverUtility;

public class ContactUsPage  extends DriverUtility {

	public void ContactUsPage() throws Exception {
		
		WebElement ContactUs = getmobileDriver().findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/title\" and @text=\"Contact Us\"]"));
		ContactUs.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Contact Us");
		
		WebElement Suggestions = getmobileDriver().findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/chat1\" and @text=\"Suggestions\"]"));
		Suggestions.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Suggestions");
		
		
		WebElement Newfeature = getmobileDriver().findElement(
				By.xpath("//android.widget.TextView[@resource-id=\"com.tja:id/chat1\" and @text=\"Addition of new feature\"]"));
		Newfeature.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on Newfeature ");
		
		WebElement TextBox = getmobileDriver()
				.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.tja:id/rl_textbox\"]"));
		TextBox.click();
		TextBox.sendKeys("please add vedio session in every day");
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully enterd the content");
		
		WebElement SendBtn = getmobileDriver().findElement(
				By.xpath("//android.widget.ImageView[@resource-id=\"com.tja:id/ivIpacSend\"]"));
		SendBtn.click();
		Thread.sleep(2000);
		getExtentTest().log(LogStatus.PASS, "Successfully Cliked on SendBtn ");
	 
 }


}
