package Utility;

public class Scrolling {

	
	public void scrollTillText(String exacttext) {
		
		base.getdriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+exacttext+"\").instance(0))"); 
		

	}
	
public void scrollTillTextClick(String exacttext) {
		
		base.getdriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+exacttext+"\").instance(0))").click(); 
		

	}
}
