package com.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {

// Initialize Log4j logs

	public static Logger Log = LogManager.getLogger(LogUtils.class.getName());//
	// public static Logger log = LogManager.getLogger(base.class.getName());

	// This is to print log for the beginning of the test case, as we usually run so
	// many test cases as a test suite



	public static void info(String message) {

		Log.info(message);

	}

	public static void warn(String message) {

		Log.warn(message);

	}

	public static void error(String message) {

		Log.error(message);

	}

	public static void fatal(String message) {

		Log.fatal(message);

	}

	public static void debug(String message) {

		Log.debug(message);

	}

}