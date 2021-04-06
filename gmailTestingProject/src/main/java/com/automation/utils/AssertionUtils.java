package com.automation.utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.automation.utils.LogUtils.*;
import static com.automation.utils.DriverUtils.getDriver;

public class AssertionUtils {
	public static void assertPresent(WebElement element) {
		waitForVisible(element);
		String message = String.format("Element %s should be displayed !!!", element.getText());
		Assert.assertTrue(element.isDisplayed(), message);
		Log.debug(message);
	}

	private static void waitForVisible(WebElement element) {
	}

	public static void assertNotPresent(WebElement element) {
		Assert.assertTrue(!element.isDisplayed(), String.format("Element %s is not displayed !!!", element.getText()));
	}

	public static void assertEquals(WebElement element, String actual, String expected) {
		Log.debug("Assertion on actuals vs expcted");
		waitForVisible(element);
		String message = String.format("Actual text is %s and expected text is %s", actual, expected);

		Assert.assertTrue(actual.contains(expected), message);
		Log.info(message + "\n" + "actual : " + actual + "\n" + "expected : " + expected);
	}

	public static void assertEquals(WebElement element, String expected) {
		waitForVisible(element);
		Assert.assertTrue(element.getText().contains(expected),
				String.format("Actual text is %s and expected text is %s", element.getText(), expected));
	}

	public static void assertPageTitle(String expected) {
		String actualTitle = getDriver().getTitle();
		String message = String.format("Actual text is %s and expected text is %s", actualTitle, expected);
		Assert.assertTrue(actualTitle.contains(expected), message);
		Log.info(message + "\n" + "actual : " + actualTitle + "\n" + "expected : " + expected);

	}

}
