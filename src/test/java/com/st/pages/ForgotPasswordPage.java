package com.nk.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import com.nk.common.NKConstants;
import com.nk.util.BasePageObject;

public class ForgotPasswordPage extends BasePageObject {
	
	String text=null;
	By title=By.xpath("//div[@id='rPanel']//h1");
	By Rememberusername=By.xpath("//div[@class='pt10']/input[@id='rd_un']");
	By forgot=By.id("forgotusername");
	public ForgotPasswordPage(WebDriver driver){
		super(driver);
	}

	public void resetPasswordTitle() throws InterruptedException
	{
		text=uiDriver.findElement(title).getText().toLowerCase();
		uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Assert.assertEquals(text, NKConstants.FORGOTPASSWORD_RESETPASSWORD, "Reset Password Title is not displayed");
	}
	public void rememberUserNamePage(){
		uiDriver.findElement(Rememberusername).click();
		uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean flag=uiDriver.findElement(forgot).isDisplayed();
		Assert.assertTrue(flag, "I Remember my user name field is not displayed");
		uiDriver.close();
		}
	public void passingUserName(String username){
		uiDriver.findElement(forgot).sendKeys("uthkarsh.venkat@gmail.com");
		
	}
	
	
}
