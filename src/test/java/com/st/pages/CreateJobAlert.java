package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.nk.util.BasePageObject;

public class CreateJobAlert extends BasePageObject
{

	public CreateJobAlert(WebDriver driver)
	{
		super(driver);
	}
	
	
	By closeimage=By.xpath("//div[@id='imsLBMain']//div[@class='ltGlobalHd']/a");
	By tellustext=By.xpath("//div[@id='imsLBMain']//div[@class='ltGlobalHd']");
	
	String actual_Result=null;
	String expected_Result=null;
	boolean flag=false;
	
	
	/*@Test
    public void createAlert() throws InterruptedException{////div[@class='ltGlobalTtl']
     WebElement createJobAlertButton = driver.findElement(By.xpath("//div[@class='wgtCont']/button[@id='cjaMain']"));
     createJobAlertButton.click();
     Thread.sleep(2000);
     WebElement popUpTitle = driver.findElement(By.xpath("//div[@id='imsLBMain']//div[@class='ltGlobalHd']"));
     String popUpTitleText = popUpTitle.getText().trim();
     String expectedTitle = "Tell us what kind of jobs you want";*/
	
/****************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will Helps you to verify Tell us text is Present on the screen
	 */
	public void verifyTellUsTextisPresent() throws Exception
	{
		try 
		{
			//switchToFrame(theElement);
			actual_Result=getText(tellustext).trim();
			expected_Result="Tell us what kind of jobs you want";
			Assert.assertEquals(actual_Result, expected_Result,"Both Text are Not Matching");
			
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERFYING THE TELL US TEXT IS PRESENT ON THE SCREEN" + "\n verifyTellUsTextisPresent" +e.getLocalizedMessage());
		}
	}
	
	/****************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will Helps you to verify Close image is Present on the screen
	 */
	public boolean verifyCloseImagebutton() throws Exception
	{
		try 
		{
			flag=isElementPresent(closeimage);
			Assert.assertTrue(flag, "Tell Us text is not present on the Screen");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERFYING THE CLOSE IMAGE IS PRESENT ON THE SCREEN" + "\n verifyCloseImagebutton" +e.getLocalizedMessage());
		}
	}
	/****************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will Helps you to verify Close image is Present on the screen
	 */
	public HomePage clickOnCloseImagebutton() throws Exception
	{
		try 
		{
			uiDriver.findElement(closeimage).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERFYING THE CLOSE IMAGE IS PRESENT ON THE SCREEN" + "\n verifyCloseImagebutton" +e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
	}
}
