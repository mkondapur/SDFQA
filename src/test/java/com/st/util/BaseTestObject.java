package com.st.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTestObject {

	protected static WebDriver uiDriver;;
	public static String propertyFilePath = System.getProperty("user.dir")+"\\src\\test\\resource\\TestData\\testData.properties";
	FileInputStream fileInput =null;
	Properties ObjProperty = getPropertyContents();
	public String browser = ObjProperty.getProperty("browser");
	public String url = ObjProperty.getProperty("url");
	/**
	 
     * This function will execute before each Test tag in testng.xml
 
     * @param browser
 
     * @throws Exception
 
     */
	private static final Properties prop = new Properties();

	private static void loadPropertiesFile() {
		InputStream input = null;

		try {
			input = new FileInputStream(propertyFilePath);
			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static Properties getPropertyContents() {
		loadPropertiesFile();
		return prop;
	}
	
	
	
	@BeforeTest(alwaysRun = true)
    public void setup() throws Exception{
        if(browser.equalsIgnoreCase("FF")){
            uiDriver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("GC")){
            System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
            uiDriver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
            uiDriver = new InternetExplorerDriver();
        }
        else{
        	throw new Exception("Browser is not correct");
        }
        uiDriver.manage().deleteAllCookies();
        uiDriver.get(url);
        Thread.sleep(5000);
        uiDriver.manage().window().maximize();
        uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        
}
	@AfterClass
	public void tearDown(){
		uiDriver.quit();
	}
}
