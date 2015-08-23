package com.st.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.st.util.BasePageObject;



public class LoginNaukriPage extends BasePageObject
{
	
	
	//WebDriver uiDriver;
	By termsandcon=By.cssSelector(".hd3");
	By forgetlink=By.partialLinkText("Forgot Password?");
	By siteLogo= By.cssSelector(".nLogo.fl>img");
	By instasitelogo=By.cssSelector(".flLeft.lH20>a>img");
	By resetpwdtext=By.xpath("//h1");
	By myEmailidRad=By.id("rd_email");
	By emailidtextbox=By.id("forgotemail");
	By submitbtn=By.cssSelector(".blueBut1>button");
	By loginherelink=By.partialLinkText("Login Again");
	
boolean flag=false;
String actual_Result = null;
String expected_Result=null;
		public LoginNaukriPage(WebDriver driver)
		{
			//this.uiDriver=driver;
			super(driver);
			
		}
		
		private static Logger Log = Logger.getLogger(Logger.class.getName());
		
		/*************************************************************************************************************************************/
		public String  verifyTermstext() throws Exception
		{
			Log.info("Verification for Post Your CV Button");
			
			try 
			{
				// actualResult= uiDriver.findElement(termsandcon).getText();
				actual_Result=getText(termsandcon);
				expected_Result="Terms and Condition";
				Assert.assertEquals(actual_Result, expected_Result, "Terms are not Matching");
			} catch (Exception e)
			{
				throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
			}
			
			return actual_Result;
			
		}
		/*************************************************************************************************************************************/
		public String  verifyFortgetpassword() throws Exception
		{
			Log.info("Verification for Post Your CV Button");
			String actualResult = null;
			try 
			{
				 actualResult= uiDriver.findElement(forgetlink).getText();
				String expectedresult="Forgot Password?";
				System.out.println("uthkrush");
				//Assert.assertEquals(actualResult, expectedresult, "Terms are not Matching");
			} catch (Exception e)
			{
				throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
			}
			
			return actualResult;
			
		}
/**************************************************************************************************************************************************/
		
		/**
		 * @author manjunathr
		 * @return Flag
		 * @throws Exception
		 * This method will verify  site logo is present on the Page
		 */
		public boolean verifySiteLogo() throws Exception
		{
		Log.info("Verification of Sitelogo ");
			try 
			{
				flag=isElementPresent(siteLogo);
				Assert.assertTrue(flag, "Login naukri Site Logo is Missing");
				return flag;
			} 
			catch (Exception e) {
				
				throw new Exception("FAILED VERIFYING THE SITE LOGO " + "\n verifySiteLogo " +e.getLocalizedMessage());
			}
			
		}
	
/**************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return HomePage
		 * @throws Exception
		 * This method will click on site logo and redirects to Home Page
		 */
		public HomePage clickOnSiteLogo() throws Exception
		{
		Log.info("Clicking on Sitelogo Image");
			try 
			{
				uiDriver.findElement(siteLogo).click();
			} 
			catch (Exception e) {
				
				throw new Exception("FAILED CLICKON SITE " + "\nclickOnSiteLogo " +e.getLocalizedMessage());
			}
			return new HomePage(uiDriver);
		}
		//Forgot Password?
	
/**************************************************************************************************************************************************/

		public boolean verifyResetYourPasswordText() throws Exception
		{
			Log.info("Verifcation of Reset Password Text");
			try 
			{
				flag= isElementPresent(resetpwdtext);
				Assert.assertTrue(flag, "Reset Password Text Message is not displayed");
				return flag;
				
			} catch (Exception e) 
			{
			throw new Exception("FAILED WHILE VERIFYING THE RESET YOUR PASSWORD TEXT" + "\n verifyResetYourPasswordText" +e.getLocalizedMessage());
			}
		}
	/**************************************************************************************************************************************************/
		
		public boolean verifyIremeberMyEmailId() throws Exception
		{
			Log.info("Verification of I remember my email id radio button");
			
			try 
			{
				flag=isElementPresent(myEmailidRad);
			
				if (uiDriver.findElement(myEmailidRad).isSelected()) 
				{
					System.out.println("Selected");
				}
				Assert.assertTrue(flag, "Email id Radio button is not selected");
				return flag;
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE VERIFYING THE I REMEMBER EMAIL ID LINK" + "\nverifyIremeberMyEmailId " +e.getLocalizedMessage());
			}
		}
		/**************************************************************************************************************************************************/
		
		public void enterEmailID( String email) throws Exception
		{
			Log.info("Entering Email id");
			try 
			{
				uiDriver.findElement(emailidtextbox).sendKeys(email);
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHIEL ENTERING THE EMAIL ID " + "\n enterEmailID" + e.getLocalizedMessage());
			}
		}
		
		/**************************************************************************************************************************************************/
		
		public LoginNaukriPage clickOnSubmitButton() throws Exception
		{
			Log.info("Clicking on Submit button");
			try 
			{
				uiDriver.findElement(submitbtn).click();
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING ON SUBMIT BUTTON" + "\n clickOnSubmitButton" + e.getLocalizedMessage());
			}
			return this;
		}
	/*******************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return HomePage
		 * @throws Exception
		 * This method will click on site logo and redirects to Home Page
		 */
		public LoginNaukriPage clickOnLoginAgain() throws Exception
		{
		Log.info("Clicking on Login agin Link Image");
			try 
			{
				uiDriver.findElement(loginherelink).click();
			} 
			catch (Exception e) {
				
				throw new Exception("FAILED CLICKON Login Here Link " + "\n clickOnLoginAgain " +e.getLocalizedMessage());
			}
			return this;
		}	
}



