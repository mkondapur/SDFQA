package com.nk.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nk.util.BasePageObject;

public class JobSearchNaukriPage extends BasePageObject
{
	

	
	public JobSearchNaukriPage(WebDriver driver)
	{
		super(driver);
	}
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By locationtextbox=By.xpath("//div/div[2]/input[@class='sugInp w135']");
	By locationname=By.xpath("//div[@class='count']/h1/span[3]");
	By termsandcon=By.cssSelector(".hd3");
	By closewindowlink=By.cssSelector("#content>div>a>b");
	By jobsearchnaukrisite=By.xpath(".nLogo.fl>img");
	
	String actual_Result= null;
	String actual_Result1= null;
	String expected_Result=null;
	boolean flag=false;
	
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
	public HomePage verifyLocationName() throws Exception
	{
		try 
		{
			actual_Result=uiDriver.findElement(locationtextbox).getAttribute("placeholder");
			System.out.println("Manjunath" + actual_Result);
			actual_Result1=uiDriver.findElement(locationname).getText();
			System.out.println(actual_Result1);
			
			
		} catch (Exception e) 
		{
			throw new Exception(" FAILED TO GET THE LOCATIONS NAME IN" +" verifylocationname" +e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
		
	}
	
	/**
	 * @author manjunathr
	 * @return flag
	 * This method will helps you to verify the close window exists on the Page
	 */
	public boolean  verifyJobSearchNaukriPageSiteLogo() throws Exception
	{
		Log.info("Verification on Job search site logo");
		
		try 
		{
			flag=isElementPresent(jobsearchnaukrisite);
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE CLOSE WINDOW" + "\n verifyCloseWindow "+e.getLocalizedMessage());
		}
		
	}
	
	
	public HomePage  clickOnJobSearchNaukriPageSiteLogo() throws Exception
	{
		Log.info("Click  on Job search site logo");
		
		try 
		{
			uiDriver.findElement(jobsearchnaukrisite).click();
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE CLOSE WINDOW" + "\n verifyCloseWindow "+e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
		
	}

}
