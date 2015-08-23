package com.st.pages;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.st.util.BasePageObject;


public class RecruitNaukriPage extends BasePageObject
{
	

	
By youeorder=By.xpath("//div[@class='greyBdrCrt']/span");
By RecruiteNaukriSlogo=By.cssSelector(".flLeft.lH20>a>img");
By clickher=By.xpath("//a/strong");

String actual_Result=null;
String expected_Result=null;
String parent_window=null;
boolean flag=false;

	public RecruitNaukriPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return
	 * @throws Exception
	 */
	public String  verifyourorder() throws Exception
	{
		Log.info("Verification for Verify Your Orders Text");
	
		try 
		{
			actual_Result=getText(youeorder);
			expected_Result="Your Order Details";
		Assert.assertEquals(actual_Result, expected_Result, "Verify your orders Text is not Matching");
		
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE Verify Your Orders Text" + "\n verifyourorder "+e.getLocalizedMessage());
		}
		
		return actual_Result;
		
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return LoginNaukriPage
	 * @throws Exception
	 */
	public LoginNaukriPage  clickONClickhere() throws Exception
	{
		Log.info("Verification for Click on Here Link");
		
		try 
		{
			
			uiDriver.findElement(clickher).click();
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON CLICK ON HERE LINK" + "\n clickONClickhere "+e.getLocalizedMessage());
		}
		
		return new LoginNaukriPage(uiDriver);
		
	}
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean verifyClickOnHereLink() throws Exception
	{
		Log.info("Verifcation of Link on Here Link ");
		try 
		{
			flag=isElementPresent(clickher);
			Assert.assertTrue(flag, "Clickon Here Link is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON HERE LINK" + "\n verifyClickOnHereLink" + e.getLocalizedMessage());
		}
	}
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean verifyRecruitNaukriSiteLogo() throws Exception
	{
		Log.info("Verifcation of RecruitNaukriSiteLogo ");
		try 
		{
			flag=isElementPresent(RecruiteNaukriSlogo);
			Assert.assertTrue(flag, "Recruite Naukri Site Logo is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE RECRUITE NAUKEI SITE LOGO" + "\n verifyRecruitNaukriSiteLogo" + e.getLocalizedMessage());
		}
	}
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return HomePage
	 * @throws Exception
	 */
	public HomePage clickRecruiteNaukriSiteLogo() throws Exception
	{
		Log.info("Verifcation of Link on Here Link ");
		try 
		{
			uiDriver.findElement(RecruiteNaukriSlogo).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON HERE LINK" + "\n verifyClickOnHereLink" + e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
	}
}
