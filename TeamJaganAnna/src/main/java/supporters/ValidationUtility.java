package supporters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CustomizedExceptions.FrameWorkException;
import Utility.DriverUtility;



public class ValidationUtility extends DriverUtility {
	
	private static boolean b;
	public static boolean validateMobileNum(String mobileNum) 
	{
		Pattern pattern = Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNum);
		if (matcher.find()&&matcher.group().equals(mobileNum))
			b=true;
		else
			b=false;
		return b;
	}
	public static boolean validateEmail(String email) 
	{
		Pattern pattern = Pattern.compile("[a-zA-Z]+[A-Za-z0-9]*[@][a-z][.][a-z]+");
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()&&matcher.group().equals(email))
			b=true;
		else
			b=false;
		return b;
	}
	
	public WebElement validateWebElement(String locName,String locMechanism) throws FrameWorkException 
	{
		WebElement element=null;
		switch(locName)
		{
		case "id":
			element = getmobileDriver().findElement(By.id(locMechanism));
			if (element.isDisplayed()&&element.isEnabled()) 
				System.out.println("webelemnt is enadbled and disabled");
			else
				throw new FrameWorkException("Unable to identify the element with id :" +locMechanism+" with type :" +locName);
		}
		return element;
	}

}
