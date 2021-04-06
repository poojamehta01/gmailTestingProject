package com.automation.utils;
import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;


import java.io.IOException;

public class ScreenshotUtils extends DriverUtils {
	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("//gmailTestingProject//screenShots//screenshot.png"));

	}

}
