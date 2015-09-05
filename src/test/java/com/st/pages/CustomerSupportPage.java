package com.st.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.st.util.BasePageObject;


public class CustomerSupportPage extends BasePageObject
{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	public CustomerSupportPage(WebDriver driver)
	{
		super(driver);
	}
	
	By Homeimagebutton=By.cssSelector(".home");
	
	String actual_Result=null;
	String expected_Result=null;
	String parent_window=null;
	boolean flag=false;
	
	/*************************************************************************************************************************************/
	public String getcustPageTitle() throws Exception
	{
		Log.info("Getting the Page title");
		try 
		{
			actual_Result=uiDriver.getTitle().trim();
			expected_Result="Customer Support Services – Naukri FastForward";
			
			Assert.assertEquals(actual_Result, expected_Result,"Customer Support Title is not Matching");
			
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE PAGE TITLE OF CUSTOMER SUPPORT SCREEN" + "\n getPageTitle" +e.getLocalizedMessage());
		}
		return actual_Result;
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Emailtext box is Present on the Screen
	 */
	public boolean verifyHomeImage() throws Exception
	{
		Log.info("verification of Home Image button ");
		try 
		{
			flag=isElementPresent(Homeimagebutton);
			Assert.assertTrue(flag, "Home Image button is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE Home Image button  " + " \n verifyHomeImage" +e.getLocalizedMessage());
		}
	}

	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Home Page Image Button is Present on the Screen
	 */
	public HomePage clickOnHomeImage() throws Exception
	{
		Log.info("Click on Home Image button ");
		try 
		{
			uiDriver.findElement(Homeimagebutton).click();
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE Home Image button  " + " \n verifyHomeImage" +e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
	}

	/*************************************************************************************************************************************/
}
