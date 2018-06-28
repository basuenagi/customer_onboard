package com.zycus.selenium.factory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.zycus.selenium.constants.ConfigConstants;
import com.zycus.selenium.constants.Driver;
import com.zycus.selenium.parsers.ConfigParser;

public class DriverFactory {

	private static String driverToTest = ConfigParser.getDriverToTest();

	static {
		loadDrivers();
	}

	private static void loadDrivers() {
		//TODO : Configuration and load based on the driver configurations
		File file = new File(ConfigParser.getChromeDriverPath());
		System.setProperty(ConfigParser.getChromeDriverPropertyPath(), file.getAbsolutePath());
		
		File file2 = new File(ConfigParser.getFireFoxDriverPath());
		System.setProperty(ConfigParser.getFireFoxDriverPropertyPath(), file2.getAbsolutePath());
		
		File file3 = new File(ConfigParser.getIEDriverPath());
		System.setProperty(ConfigParser.getIEDriverPropertyPath(), file3.getAbsolutePath());
		
	}

	public static WebDriver getDriver() {

		if (Driver.CHROME.getDriverToTest().equals(driverToTest)) {
			WebDriver driver = new ChromeDriver();
			return driver;
		}
		if (Driver.FIREFOX.getDriverToTest().equals(driverToTest)) {
			
			WebDriver driver = new FirefoxDriver();
			return driver;
		}
		if (Driver.IE.getDriverToTest().equals(driverToTest)) {
			WebDriver driver = new InternetExplorerDriver();
			return driver;
		}

		return new ChromeDriver();

	}
}
