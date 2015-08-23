package com.nk.pages;

import java.sql.Driver;

import org.apache.bcel.generic.RETURN;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nk.common.NKConstants;
import com.nk.util.BasePageObject;

public class ResumeNaukriPage extends BasePageObject
{
	

	
	public ResumeNaukriPage(WebDriver driver)
	{
		super(driver);
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	/* UI ELEMENTS */
	
	By resumetext= By.xpath("//div[7]/div/h2");
	By IneedbetterResume=By.xpath("//div[@class='homeCol2']/h2[@id='forTop']");
	By ResumeDisplay=By.xpath("//div[@class='wrap']/div/h2");
	By customersupportlink= By.partialLinkText("Customer Support service");
	By Homeimagebutton=By.cssSelector(".home");
	
	
	
	//By siteLogo= By.cssSelector(".nLogo.fl>img");
	String pageTitle=null;
	String actual_Result=null;
	String expected_Result=null;
	String parent_window=null;
	boolean flag=false;
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return title
	 * @throws Exception
	 * This method will get the Page Title and compare it.
	 */
	public void verifyNaukriFastForwardTitle() throws Exception
	{
		Log.info("getting the on page titles of naukri Fast and Forward link");
		try 
		{
			pageTitle=uiDriver.getTitle().trim();
			Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_NAUKRIFASTFORWARDPAGE, "Naukri Fast Forward Link title is not matching or displayed as expected");
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED VERIFYING THE NAUKRI FAST FORWARD PAGE TITLE " + "\n verifyNaukriFastForwardTitle " +e.getLocalizedMessage());
		}
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual Result
	 * @throws Exception
	 * This method will help us to check I need Impressive Resume Text is Present on the Page
	 */
	public String verifyGetResumeText() throws Exception
	{
		Log.info("Verification of Resume Text");
		try 
		{
			actual_Result =uiDriver.findElement(resumetext).getText().trim();
			
			expected_Result="I need an impressive resume";
			Assert.assertEquals(actual_Result, expected_Result, "Both are not Matching");
			//div[@class='wrap']/div/h2
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE TEXT "+ "\n verifyGetResumeText" + e.getLocalizedMessage());
		}
		return actual_Result;
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual Result
	 * @throws Exception
	 * This method will help us to check I need Impressive Resume Text is Present on the Page
	 */
	public String verifyINeedImpresive() throws Exception
	{
		Log.info("Verification of I Need Impressive Resume");
		try 
		{
			actual_Result =getText(IneedbetterResume).trim();
			
			expected_Result="I need an impressive resume";
			Assert.assertEquals(actual_Result, expected_Result, "Both are not Matching");
			//div[@class='wrap']/div/h2
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE I Need Impressive Resume TEXT "+ "\n verifyINeedImpresive" + e.getLocalizedMessage());
		}
		return actual_Result;
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual Result
	 * @throws Exception
	 * This method will help us to check I need Impressive Resume Text is Present on the Page
	 */
	public ResumeNaukriPage clickOnCustomerSupportService() throws Exception
	{
		Log.info(" Clicking on Customer Support service ");
		try 
		{
			uiDriver.findElement(customersupportlink).click();
			
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON CUSTOMER SUPPORT LINK" + "\n clickOnCustomerSupportService " +e.getLocalizedMessage());
		}
		return this;
	}
	
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return actual Result
	 * @throws Exception
	 * This method will help us to check I need Impressive Resume Text is Present on the Page
	 */
	public String verifyResumeDisplayText() throws Exception
	{
		Log.info("Verification of Resume Text");
		try 
		{
			actual_Result =uiDriver.findElement(ResumeDisplay).getText();
			
			expected_Result="Why Resume Display";
			Assert.assertEquals(actual_Result, expected_Result, "Both are not Matching");
			//div[@class='wrap']/div/h2
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE TEXT "+ "\n verifyGetResumeText" + e.getLocalizedMessage());
		}
		return actual_Result;
	}
	

	/*************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Customer service  box is Present on the Screen
	 */
	public boolean verifyCustomerServiceLink() throws Exception
	{
		Log.info("verification of Customer Service Link ");
		try 
		{
			flag=isElementPresent(customersupportlink);
			Assert.assertTrue(flag, "Customer Service LInk is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE CUSTOMER SERVICE LINK  " + " \n verifyCustomerServiceLink" +e.getLocalizedMessage());
		}
	}
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
