package com.st.pages;

import java.sql.Driver;

import org.apache.bcel.generic.RETURN;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.st.common.NKConstants;
import com.st.util.BasePageObject;


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
	By NaukriFFSitelogo=By.cssSelector(".nLogo.fl>img");
	By customername=By.id("cust_name");
	By customerEmail=By.id("cust_email");
	By customerPhone=By.id("cust_phone");
	By customerCode=By.id("cust_code");
	By customerTranscation=By.id("cust_transcode");
	By customerQuery=By.id("cust_query");
	By Submitbutton=By.xpath("//span/button/b");
	
	By Error_customername=By.id("errCustName");
	By Error_customerEmail=By.id("errCustEmail");
	By Error_customerPhone=By.id("errCustPhone");
	By Error_customerQuery=By.id("errCustQuery");

	
	
	
	
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
	 * @return Home Page
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
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Naukri Fast forward site logo box is Present on the Screen
	 */
	public boolean verifyNaukriFastforwardSitelogo() throws Exception
	{
		Log.info("verification of NaukriFastforwardSitelogo ");
		try 
		{
			flag=isElementPresent(NaukriFFSitelogo);
			Assert.assertTrue(flag, "NaukriFastforwardSitelogo button is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE NaukriFastforwardSitelogo  " + " \n verifyNaukriFastforwardSitelogo" +e.getLocalizedMessage());
		}
	}

	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return Home Page
	 * @throws Exception
	 * This method will check Home Page Image Button is Present on the Screen
	 */
	public ResumeNaukriPage clickOnNaukriFastforwardSitelogo() throws Exception
	{
		Log.info("Click on Naukri Fast forward site logo button ");
		try 
		{
			uiDriver.findElement(NaukriFFSitelogo).click();
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE Naukri Fast forward Site Logo  " + " \n clickOnNaukriFastforwardSitelogo" +e.getLocalizedMessage());
		}
		return this;
	}

	/*************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Customer Name Text box is Present on the Screen
	 */
	public boolean verifyCustomerNameTextbox() throws Exception
	{
		Log.info("verification of verifyCustomerNameTextbox ");
		try 
		{
			flag=isElementPresent(customername);
			Assert.assertTrue(flag, "verifyCustomerNameTextbox  is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE verifyCustomerNameTextbox  " + " \n verifyCustomerNameTextbox  " +e.getLocalizedMessage());
		}
	}
	
/*************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return customername
	 * @throws Exception
	 * This method will check Customer Name Text box is Present on the Screen
	 */
	public void enterCustomerNameTextbox(String custrname ) throws Exception
	{
		Log.info("entering the verifyCustomerNameTextbox ");
		try 
		{
			uiDriver.findElement(customername).sendKeys(custrname);
			/*int length=custrname.length();
			
			
			if ((length>1 && length<20) ==true)
			{
				flag=true;
				System.out.println("Customer Name Entered");
				System.out.println(uiDriver.findElement(Error_customername).getText());
			} else
			{
				flag=false;
			System.out.println("Customername is Not entered");
			actual_Result=getText(Error_customername);
			System.out.println("Manju" + actual_Result);
			}
			
			if (custrname.trim().isEmpty())
			{
				System.out.println("Empty Spaces are not allowed");
			}
			else 
			{
				System.out.println("Valid entery");
			}
			
		} */
		}
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE 	ENTERING THE verifyCustomerNameTextbox  " + " \n verifyCustomerNameTextbox  " +e.getLocalizedMessage());
		}
	}
/*************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Customer Name Text box is Present on the Screen
	 */
	public boolean verifyCustomerEmailTextbox() throws Exception
	{
		Log.info("verification of verifyCustomerEmailTextbox ");
		try 
		{
			flag=isElementPresent(customerEmail);
			Assert.assertTrue(flag, "verifyCustomerEmailTextbox  is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE verifyCustomerEmailTextbox  " + " \n verifyCustomerEmailTextbox  " +e.getLocalizedMessage());
		}
	}
	
/*************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return customerEmail
	 * @throws Exception
	 * This method will check Customer Name Text box is Present on the Screen
	 */
public void enterCustomerEmailID(String email) throws Exception
{
	try
	{
		uiDriver.findElement(customerEmail).sendKeys(email);
		
	} catch (Exception e) 
	{
		throw new Exception("FAILED WHILE ENTERING THE EMAIL ID " + "\n  enterCustomerEmailID  " + e.getLocalizedMessage());
	}
}
/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check Customer Phone Number Text box is Present on the Screen
 */
public boolean verifyCustomerContactNumber() throws Exception
{
	Log.info("verification of verifyCustomerContactNumber ");
	try 
	{
		flag=isElementPresent(customerPhone);
		Assert.assertTrue(flag, "verifyCustomerContactNumber  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE verifyCustomerContactNumber  " + " \n verifyCustomerContactNumber  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return customerPhone
 * @throws Exception
 * This method will check Customer Name Text box is Present on the Screen
 */
public void enterCustomerContactNumber(String phone) throws Exception
{
try 
{
	uiDriver.findElement(customerPhone).sendKeys(phone);
} 
catch (Exception e) {
	throw new Exception("FAILED WHILE ENTERING THE CONATCT NUMBER " + "\n enterCustomerContactNumber  "+e.getLocalizedMessage());
}	

}
/*************************************************************************************************************************************/
/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check Transcation Code  box is Present on the Screen
 */
public boolean verifyCustomerCode() throws Exception
{
	Log.info("verification of verifyCustomerCode ");
	try 
	{
		flag=isElementPresent(customerCode);
		Assert.assertTrue(flag, "verifyCustomerCode  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE verifyCustomerCode  " + " \n verifyCustomerCode  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return code
 * @throws Exception
 * This method will check Customer Name Text box is Present on the Screen
 */
public void enterCustomerCode(String code) throws Exception
{
try 
{
	uiDriver.findElement(customerCode).sendKeys(code);
} 
catch (Exception e) {
	throw new Exception("FAILED WHILE ENTERING THE CUSTOMER TRANSCATION CODE " + "\n enterTranscationCode  "+e.getLocalizedMessage());
}	

}
/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check Transcation Code  box is Present on the Screen
 */
public boolean verifyTranscationCode() throws Exception
{
	Log.info("verification of TranscationCode ");
	try 
	{
		flag=isElementPresent(customerTranscation);
		Assert.assertTrue(flag, "verifyTranscationCode  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE verifyTranscationCode  " + " \n verifyTranscationCode  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return code
 * @throws Exception
 * This method will check Customer Name Text box is Present on the Screen
 */
public void enterTranscationCode(String Trancode) throws Exception
{
try 
{
	uiDriver.findElement(customerTranscation).sendKeys(Trancode);
} 
catch (Exception e) {
	throw new Exception("FAILED WHILE ENTERING THE CUSTOMER TRANSCATION CODE " + "\n enterTranscationCode  "+e.getLocalizedMessage());
}	

}
/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check Customer CodeText box is Present on the Screen
 */
public boolean verifySpecifyQuery() throws Exception
{
	Log.info("verification of verifySpecifyQuery ");
	try 
	{
		flag=isElementPresent(customerQuery);
		Assert.assertTrue(flag, "verifySpecifyQuery  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE verifySpecifyQuery  " + " \n verifySpecifyQuery  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return query
 * @throws Exception
 * This method will check Specify Query Text box is Present on the Screen
 */
public void enterSpecifyQuery(String query) throws Exception
{
try 
{
	uiDriver.findElement(customerQuery).sendKeys(query);
} 
catch (Exception e) {
	throw new Exception("FAILED WHILE ENTERING THE SPECIFY QUERY " + "\n enterSpecifyQuery  "+e.getLocalizedMessage());
}	

}
/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check Submitbutton is Present on the Screen
 */
public boolean verifySubmitButton() throws Exception
{
	Log.info("verification of verifySubmitButton ");
	try 
	{
		flag=isElementPresent(Submitbutton);
		Assert.assertTrue(flag, "verifySubmitButton  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE verifySubmitButton  " + " \n verifySubmitButton  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/

/**
 * @author manjunathr
 * 
 * @throws Exception
 * This method will check Customer Name Text box is Present on the Screen
 */
public void clickOnSubmit() throws Exception
{
try 
{
	uiDriver.findElement(Submitbutton).click();
} 
catch (Exception e) {
	throw new Exception("FAILED WHILE ENTERING THE SUBMIT BUTTON " + "\n clickOnSubmit  "+e.getLocalizedMessage());
}	

}
/*************************************************************************************************************************************/
/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check CustomerNameErrorMessage is Present on the Screen
 */
public boolean verifyCustomerNameErrorMessage() throws Exception
{
	Log.info("verification of CustomerNameErrorMessage ");
	try 
	{
		flag=isElementPresent(Error_customername);
		Assert.assertTrue(flag, "CustomerNameErrorMessage  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE CustomerNameErrorMessage  " + " \n CustomerNameErrorMessage  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/
/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check CustomerEmailErrorMessage is Present on the Screen
 */
public boolean verifyCustomerEmailErrorMessage() throws Exception
{
	Log.info("verification of verifyCustomerEmailErrorMessage ");
	try 
	{
		flag=isElementPresent(Error_customerEmail);
		Assert.assertTrue(flag, "CustomerEmailErrorMessage  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE CustomerEmailErrorMessage  " + " \n CustomerEmailErrorMessage  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/
/**
 * @author manjunathr
 * @return flag
 * @throws Exception
 * This method will check Submitbutton is Present on the Screen
 */
public boolean verifyCustomerQueryErrorMessage() throws Exception
{
	Log.info("verification of CustomerQueryErrorMessage ");
	try 
	{
		flag=isElementPresent(Error_customerQuery);
		Assert.assertTrue(flag, "verifyCustomerQueryErrorMessage  is Missing");
		return flag;
	} 
	catch (Exception e) 
	{

		throw new Exception("FAILED WHILE VERIFYING THE verifyCustomerQueryErrorMessage  " + " \n verifyCustomerQueryErrorMessage  " +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/



}
