package com.st.pages;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.st.util.BasePageObject;



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
	By jobsearchnaukrisite=By.cssSelector(".nLogo.fl>img");
	By naukrixpath=By.xpath("//div/div/a[@class='nLogo fl']/img");
	By Homepagesitelogo=By.cssSelector("#logo");
	By carresources=By.xpath("//div[5]/h1");
	
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
	public void  verifyLocationName() throws Exception
	{
		try 
		{
			
			String loctionarray[]={"Delhi","Mumbai","Chennai","Gurgaon","Noida","Kolkata","Hyderabad","Pune","Bangalore","Ahmedabad"};
			
	//for (String s : loctionarray)
	//{
		actual_Result=uiDriver.findElement(locationtextbox).getAttribute("value");
		System.out.println("fin" + actual_Result);
		//expected_Result=s.toString();
		System.out.println("hard" +expected_Result);
	
		
	//}
					
		} catch (Exception e) 
		{
			throw new Exception(" FAILED TO GET THE LOCATIONS NAME IN" +" verifylocationname" +e.getLocalizedMessage());
		}
		
		//return new HomePage(uiDriver);
		
	}
	
	public String switchwindowback(String object, String data){
        try {
            String winHandleBefore = uiDriver.getWindowHandle();
            uiDriver.close(); 
            //Switch back to original browser (first window)
            uiDriver.switchTo().window(winHandleBefore);
            //continue with original browser (first window)
        }catch(Exception e){
        return  "Unable to Switch to main window" + e.getMessage();
        }
        return "Pass";
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
			uiDriver.findElement(naukrixpath).click();
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE CLOSE WINDOW" + "\n verifyCloseWindow "+e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
		
	}
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * This method will helps you to verify the close window exists on the Page
	 */
	public boolean  verifyCloseWindowOfPrivacyPolicy() throws Exception
	{
		Log.info("Verification on close window Privacy policy");
		
		try 
		{
			flag=isElementPresent(closewindowlink);
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE CLOSE WINDOW of PRIVACY POLICY" + "\n verifyCloseWindowOfPrivacyPolicy "+e.getLocalizedMessage());
		}
		
	}
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * This method will helps you to verify the close window exists on the Page
	 */
	public void  clickOnCloseWindowOfPrivacyPolicy() throws Exception
	{
		Log.info("Clicking on close window of Privacy and Policy");
		
		try 
		{
			uiDriver.findElement(closewindowlink).click();
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON THE CLOSE WINDOW OF PRIVACY POLICY" + "\n clickOnCloseWindowOfPrivacyPolicy "+e.getLocalizedMessage());
		}
		
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check HomePageSiteLogo  is Present on the Screen
	 */
	public boolean verifyHomePageSiteLogo() throws Exception
	{
		Log.info("verification of Home Image button ");
		try 
		{
			flag=isElementPresent(Homepagesitelogo);
			Assert.assertTrue(flag, "Home Page Site Logo is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE Home Page Site Logo  " + " \n  HomePageSiteLogo  " +e.getLocalizedMessage());
		}
	}

	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return Home Page
	 * @throws Exception
	 * This method will Clickon  Home Page Site Logo is Present on the Screen
	 */
	public HomePage clickOnHomepagesitelogo() throws Exception
	{
		Log.info("Click on Home Page Site Logo button ");
		try 
		{
			uiDriver.findElement(Homepagesitelogo).click();
			//switchToNewWindow();
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE CLICKING ON  THE Home pages ite logo  " + " \n clickOnHomepagesitelogo " +e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
	}

	/*************************************************************************************************************************************/
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * This method will helps you to verify the close window exists on the Page
	 */
	public boolean  verifyCareerResourceText() throws Exception
	{
		Log.info("Verification on Career Resources Text");
		
		try 
		{
			flag=isElementPresent(carresources);
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE CLOSE WINDOW" + "\n verifyCloseWindow "+e.getLocalizedMessage());
		}
		
	}
}
