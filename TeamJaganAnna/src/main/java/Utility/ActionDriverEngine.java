package Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionDriverEngine extends DriverUtility {
	private static Actions actions = new Actions(getmobileDriver());
	private static WebElement element;

	public ActionDriverEngine() {

	}

	static public void sendKeysAction(String locatorMechanism, String testData, String locator) {
		String locMech = locatorMechanism;
		switch (locMech) {
		case "id":
			element = getmobileDriver().findElement(By.id(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;
		case "css":
			element = getmobileDriver().findElement(By.cssSelector(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;
		case "xpath":
			element = getmobileDriver().findElement(By.xpath(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;
		case "className":
			element = getmobileDriver().findElement(By.className(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;
		case "name":
			element = getmobileDriver().findElement(By.name(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;
		case "linkText":
			element = getmobileDriver().findElement(By.linkText(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;
		case "partialLinkText":
			element = getmobileDriver().findElement(By.partialLinkText(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.clear();
				element.sendKeys(testData);
			}
			break;

		}
	}

	public static void clickACtion(String locatorMechanism, String locator) {
		String locMech = locatorMechanism;
		switch (locMech) {
		case "id":
			element = getmobileDriver().findElement(By.id(locator));
			// if (element.isDisplayed()&&element.isEnabled()) {
			if (element.isEnabled()) {
				element.click();
			}
			break;
		case "css":
			element = getmobileDriver().findElement(By.cssSelector(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
			}
			break;
		case "xpath":
			element = getmobileDriver().findElement(By.xpath(locator));
			// if (element.isDisplayed()&&element.isEnabled()) {
			if (element.isEnabled()) {
				element.click();
			}
			break;
		case "className":
			element = getmobileDriver().findElement(By.className(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
			}
			break;
		case "name":
			element = getmobileDriver().findElement(By.name(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
			}
			break;
		case "linkText":
			element = getmobileDriver().findElement(By.linkText(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
			}
			break;
		case "partialLinkText":
			element = getmobileDriver().findElement(By.partialLinkText(locator));
			if (element.isDisplayed() && element.isEnabled()) {
				element.click();
				;
			}
			break;

		}
	}

	public static void windowHandles(int index) {
		Set<String> windows = getmobileDriver().getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		String windowName = list.get(index);
		getmobileDriver().switchTo().window(windowName);
	}

	public static List<WebElement> getAllFrames() {
		List<WebElement> frames = getmobileDriver().findElements(By.tagName("iframe"));
		return frames;
	}

	public static void switchToFrame(String locatorMech, String locator) {

		switch (locatorMech) {
		case "idORname":
			getmobileDriver().switchTo().frame(locator);
			break;
		case "index":
			if (getAllFrames().size() >= Integer.parseInt(locator)) {
				getmobileDriver().switchTo().frame(locator);
			}

			break;
		case "webelement":
			getmobileDriver().switchTo().frame(locator);
			break;
		}
	}

	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot t = (TakesScreenshot) getmobileDriver();
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\" + imgName + ".jpeg"));

	}

	public static void dropDown(WebElement elementone, String dropDownSelect, String dropDownData) {
		String tagName = elementone.getTagName();
		if (tagName.equalsIgnoreCase("select")) {
			Select select = new Select(elementone);

			switch (dropDownSelect) {
			case "value":
				select.selectByValue(dropDownData);
				break;
			case "text":
				select.selectByVisibleText(dropDownData);
				break;
			case "index":
				select.selectByIndex(Integer.parseInt(dropDownData));
				break;
			}
		}
	}

	public static void mouseHover(WebElement elementone) {
		actions.moveToElement(elementone).build().perform();
	}

	public static void rightClick(WebElement elementOne) {

		actions.contextClick(elementOne).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
	}

	public static boolean isDisplayed(WebElement element) {
		boolean flag = true;
		if (element.isDisplayed() && element.isEnabled())
			;
		else
			flag = false;
		return flag;
	}

	public static void enterUrl(String url) {
		getmobileDriver().get(url);
	}
}
