package com.st.pages;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.st.util.BasePageObject;

public class InfoEdgePage extends BasePageObject
{

	public  InfoEdgePage(WebDriver driver)
	{
		super(driver);
	}
	
	By naukripartner= By.xpath("//div[1][@id='mycrawler16']/ul[1]/li[1]/a/img");
	By naukriimage=By.xpath("//tr[2]/td[1]/a[1]/img");
	
	boolean flag=false;
	
	public boolean verifyNaukriSiteImage() throws Exception
	{
		try {
			flag=isElementPresent(naukripartner);
			Assert.assertTrue(flag, "Naukri site image is missing");
			return flag;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRI IMAGE ON ABOUT US SCREEN" +"\n verifyNaukriSiteImage " +e.getLocalizedMessage());
		}
	}
	
	public InfoEdgePage clickOnNaukriSiteImage() throws Exception
	{
		try {
			uiDriver.findElement(naukripartner).click();
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRI PARTNER IMAGE ON ABOUT US SCREEN" +"\n verifyNaukriSiteImage " +e.getLocalizedMessage());
		}
		return this;
	}
	
	public boolean verifyNaukriimage() throws Exception
	{
		try {
			flag=isElementPresent(naukriimage);
			Assert.assertTrue(flag, "Naukri site image is missing");
			return flag;
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRI IMAGE ON ABOUT US SCREEN" +"\n verifyNaukriimage " +e.getLocalizedMessage());
		}
	}
	
	public HomePage clickOnNaukriImage() throws Exception
	{
		try {
			uiDriver.findElement(naukriimage).click();
			switchToNewWindow();
			
		} catch (Exception e) {
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRI IMAGE ON ABOUT US SCREEN" +"\n clickOnNaukriImage " +e.getLocalizedMessage());
		}
		return new HomePage(uiDriver);
		
	}
}
