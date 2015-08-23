package com.st.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.st.common.NKConstants;
import com.st.util.BasePageObject;


public class MyNaukriPage extends BasePageObject
{

	//WebDriver uiDriver;
	
	public MyNaukriPage(WebDriver driver)
	{
		//this.uiDriver=driver;
		super(driver);
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By mynaukrilbl= By.xpath("//ul[@class='rghtSec fr menu logged']/li[2]/a");
	By logoutlink=By.xpath("//div[@class='subMenu']/ul/li[5]/a");
	By logout=By.xpath("//div[@class='w770']/div/a[1]");
	
	boolean flag=false;
	String actual_Result;
	String expected_Result;
	String Parent_window;
	String txt = null;
	/****************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * verifys the mynaukri head is displayed on the Page
	 */
	public boolean verifyMyNaukriHead() throws Exception
	{
		Log.info("Verification of My naukri Text");
		try 
		{
			
			flag= uiDriver.findElement(mynaukrilbl).isDisplayed();
			Assert.assertTrue(flag, "MY Naukri text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE MY NAUKRI " + "\n verifymynaukritext" +e.getLocalizedMessage());
		}
	}
	
	/****************************************************************************************************************************************/
	/**
	 * 
	 * @author manjunathr
	 * @return loginnaukripage
	 * @throws Exception
	 * This method will verifys the mynaukri and move object to logout and click on logout button and object will move to login naukri page
	 */
	public LoginNaukriPage verifyMyNaukriLinkAndClickOnLogOut() throws Exception
	{
		Log.info("Clciking on My naukri link button");
		
		
			try 
			{
				//WebElement mynaukri=uiDriver.findElement(mynaukrilbl);
				mouseover(mynaukrilbl);
				waitImplicit();
				WebElement logoutnk= uiDriver.findElement(logoutlink);
				logoutnk.click();
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING ON MY NAUKRI LINK BUTTON" + "\n clickOnMyNaukrilinknbutton" +e.getLocalizedMessage());
			}
		return new LoginNaukriPage(uiDriver);
	}
	/****************************************************************************************************************************************/
	/**
	 * 
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verifys the mynaukri and move object to logout and click on logout button and object will move to login naukri page
	 */
	
	public boolean verifyLogoutLink() throws Exception
	{
		Log.info("verify on Logout Link for New User");
		try 
		{
			flag=isElementPresent(logout);
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE Verifying the LOGOUT LINK FOR NEW USER" +"\n clickOnLogoutLink" +e.getLocalizedMessage());
		}
		
	}

	/**
	 * 
	 * @author manjunathr
	 * @return loginnaukripage
	 * @throws Exception
	 * This method will verifys the mynaukri and move object to logout and click on logout button and object will move to login naukri page
	 */
	
	/****************************************************************************************************************************************/
	
	
	public LoginNaukriPage clickOnLogoutLink() throws Exception
	{
		Log.info("Clicking on Logout Link for New User");
		try 
		{
			
			uiDriver.findElement(logout).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON LOGOUT LINK FOR NEW USER" +"\n clickOnLogoutLink" +e.getLocalizedMessage());
		}
		return new LoginNaukriPage(uiDriver);
	}
	
	public void verifyingUsernameLoginPage(){
		txt=uiDriver.getTitle().toLowerCase();
		Assert.assertEquals(txt, NKConstants.PAGETITLE_MYNUAKRIPAGE,"User Login Page tilte is not displayed");
		}
}
