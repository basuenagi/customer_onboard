package com.zycus.selenium.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.zycus.selenium.constants.ConfigConstants;

public class ConfigParser {
	
	private static Properties prop = new Properties();

	static {
		loadProperties();
	}

	public static void loadProperties() {

		try {
			ClassLoader classLoader = ConfigParser.class.getClassLoader();
			File file = new File(classLoader.getResource("config.properties")
					.getFile());

			prop.load(new FileInputStream(file));
		} catch (Exception e) {
			System.out.println("Unable to load the properties file");
			System.exit(1);
		}
	}
	
	
	
	public static String getURL(){
		return prop.getProperty(ConfigConstants.URL);
	}
	
	public static String getDriverToTest(){
		return prop.getProperty(ConfigConstants.DRIVER_TO_TEST);
	}
	
	public static String getChromeDriverPath(){
		return prop.getProperty(ConfigConstants.CHROME_DRIVER_PATH);
	}
	public static String getChromeDriverPropertyPath(){
		return prop.getProperty(ConfigConstants.CHROME_DRIVER_PROPERTY_PATH);
	}
	
	public static String getFireFoxDriverPath(){
		return prop.getProperty(ConfigConstants.FIREFOX_DRIVER_PATH);
	}
	public static String getFireFoxDriverPropertyPath(){
		return prop.getProperty(ConfigConstants.FIREFOX_DRIVER_PROPERTY_PATH);
	}
	
	public static String getIEDriverPath(){
		return prop.getProperty(ConfigConstants.IE_DRIVER_PATH);
	}
	public static String getIEDriverPropertyPath(){
		return prop.getProperty(ConfigConstants.IE_DRIVER_PROPERTY_PATH);
	}
	
	
	public static String getTimeToWait(){
		return prop.getProperty(ConfigConstants.TIME_TO_WAIT);
	}
}