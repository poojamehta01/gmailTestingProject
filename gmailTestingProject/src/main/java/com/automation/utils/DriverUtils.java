package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.automation.utils.ConfigUtils.*;

public class DriverUtils extends LogUtils {
	static WebDriver driver;

	public static void initDriver() {
		Log.debug("Initializing the webDrvier");
		loadProperties();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.manage().window().maximize();
		driver.get(getPropertyByKey("application.url"));
	}

	public static WebDriver getDriver() {

		if (driver == null) {
			initDriver();
		}
		return driver;
	}

	public static void tearDown() {
		Log.debug("Closing the webDrvier");
		driver.quit();
		driver = null;
	}
	
}
