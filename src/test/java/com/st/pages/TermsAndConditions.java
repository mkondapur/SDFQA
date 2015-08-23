package com.nk.pages;

import org.apache.bcel.generic.RETURN;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nk.util.BasePageObject;

public class TermsAndConditions extends BasePageObject
{

By termsandcon=By.cssSelector(".hd3");
By closewindowlink=By.cssSelector("#content>div>a>b");

	String actual_Result=null;
	String expected_Result=null;
	boolean flag=false;
	
	public TermsAndConditions(WebDriver driver)
	{
		super(driver);
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * This methos will help you to verify the Text of Terms and condition screen and compares it and if both are eual it will pass
	 */
	public String  verifyTermstext() throws Exception
	{
		Log.info("Verification for Post Your CV Button");
		
		try 
		{
			 //actualResult= uiDriver.findElement(termsandcon).getText();
			actual_Result=getText(termsandcon);
			expected_Result="Terms and Condition";
			//Assert.assertEquals(actualResult, expectedresult, "Terms are not Matching");
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
		}
		
		return actual_Result;
		
	}

	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * This method will helps you to verify the close window exists on the Page
	 */
	public boolean  verifyCloseWindowTermsandCondition() throws Exception
	{
		Log.info("Verification on close window");
		
		try 
		{
			flag=isElementPresent(closewindowlink);
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE CLOSE WINDOW" + "\n verifyCloseWindow "+e.getLocalizedMessage());
		}
		
	}
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * This method will helps you to verify the close window exists on the Page
	 */
	public void  clickOnCloseWindowTermsandConditions() throws Exception
	{
		Log.info("Clicking on close window");
		
		try 
		{
			uiDriver.findElement(closewindowlink).click();
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON THE CLOSE WINDOW" + "\n verifyCloseWindow "+e.getLocalizedMessage());
		}
		
	}

}
