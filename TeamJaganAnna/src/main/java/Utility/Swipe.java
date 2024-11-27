package Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe extends base{
	

	public void Swipe() throws InterruptedException, IOException {
	
		WebElement FirstImg = getdriver().findElement(By.id("//android.view.ViewGroup[@resource-id=\"com.d2.app:id/options_container\"]"));

	
		
		
	        int startX = 500;
	        int startY = 1000;
	        int endX = 500;
	        int endY = 500;

	        TouchAction touchAction = new TouchAction(driver);
	        touchAction.longPress(PointOption.point(startX, startY))
	                   .moveTo(PointOption.point(endX, endY))
	                   .release()
	                   .perform();
	    }
		
/*
				String firstImgValue =  FirstImg.getAttribute("focusable");
				Assert.assertEquals(false, firstImgValue);
				
				
		String secondImgValue =  FirstImg.getAttribute("focusable");
		Assert.assertEquals(false, secondImgValue);
	
		*/
	}




