package com.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import static com.automation.utils.DriverUtils.getDriver;

public class WebElementUtils extends LogUtils {
	static Long timeout = Long.parseLong("50");
	static WebDriverWait wait = new WebDriverWait(getDriver(), timeout);

	public static void waitForVisible(WebElement locator) {
		Log.debug("Waiting for element to be visible");
		try {
			wait.until(ExpectedConditions.visibilityOf(locator));
			Log.debug("element is visible");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void waitForElementToBeClickable(WebElement element) {
		Log.debug("Waiting for element to be clickable");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
