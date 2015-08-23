package com.nk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.common.NKConstants;
import com.nk.util.BasePageObject;

import junit.framework.Assert;

public class LoginRecruitNaukriPage extends BasePageObject
{

	public LoginRecruitNaukriPage(WebDriver driver) 
	{
		super(driver);
	}
	
	private static Logger Log=Logger.getLogger(Logger.class.getName());
	
	boolean flag=false;
	String expected_Result=null;
	String actual_Result=null;
	String PageTitle=null;
	
	By loginrecruitsitelog= By.cssSelector(".flLeft>a>img");
	By Requestinformationpara=By.xpath("//div[@class='row']/span/a[2]/strong");

	public boolean verifyLoginRecruiteNaukriSiteLogo() throws Exception
	{
		Log.info("Verification of Login Recruit Naukri Site Logo");
		try 
		{
			flag=isElementPresent(loginrecruitsitelog);
			return flag;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE LOGIN RECRUIT NAUKRI SITE LOGO " + "\n verifyLoginRecruiteNaukriSiteLogo " +e.getLocalizedMessage());
		}
	}
	
	
	public void getLoginRecruiteNaukriGetTitle() throws Exception
	{
		Log.info("Getting the Login Recruit Naukri page Title");
		try 
		{
			PageTitle=getPageTitle();
			//Assert.assertEquals(PageTitle, NKConstants.PAGETITLE_LOGINRECRUITNAUKRIPAGE, "LoginRecruiteNaukriGetTitles are not Matching");
			System.out.println(PageTitle);
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LOGIN RECRUIT NAUKRI TITLE" + "\n getLoginRecruiteNaukriGetTitle" +e.getLocalizedMessage());
		}
		
		
	}
		public HomePage clickOnRecruitNaukriSiteLogo() throws Exception
		{
			Log.info("Clicking on the Recruite Naukri Site Logo");
			
			try 
			{
				uiDriver.findElement(loginrecruitsitelog).click();
			}
			catch (Exception e) 
			{
			throw new Exception("FAILED WHILE CLICKING ON THE LOGIN RECRUIT SITE LOGO" + "\n clickOnRecruitNaukriSiteLogo" + e.getLocalizedMessage());
			}
			return new HomePage(uiDriver);
		}
		
		public boolean verifyRequestInformationText() throws Exception
		{
			Log.info("Verification of Request information Text");
			
			try 
			{
				flag=isElementPresent(Requestinformationpara);
				return flag;
				
			} 
			catch (Exception e) 
			{
				throw new Exception("FAILED WHILE VERIFYING THE REQUEST INFORMATION TEXT" + "\n verifyRequestInformationText " +e.getLocalizedMessage());
			}
		}
		
	}
	
