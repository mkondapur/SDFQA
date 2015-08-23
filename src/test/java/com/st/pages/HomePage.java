package com.st.pages;


import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.st.common.NKConstants;
import com.st.util.BasePageObject;

public class HomePage extends BasePageObject{

	By imgSIteLogo = By.cssSelector(".nLogo.fl>img");
	By lnkJobs = By.xpath("//a[contains(@title,'Search Jobs')]/div");
	By lnkLogin = By.xpath("//a[contains(@title,'Jobseeker Login')]/div");
	By lnkAdvancedSearch = By.linkText("Advanced Search");
	By txtSkill = By.xpath(".//*[@id='skill']//input[1]");
	
	boolean flag = false;
	String pageTitle = null;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isSiteLogoDisplayed(){
	
	flag = isElementPresent(imgSIteLogo);
		//flag = uiDriver.findElement(imgSIteLogo).isDisplayed();
		return flag;
	}
	
	public HomePage clickOnSiteLogo(){
		//isSiteLogoDisplayed();
		flag = isElementPresent(imgSIteLogo);
		uiDriver.findElement(imgSIteLogo).click();
		pageTitle = uiDriver.getTitle().trim();
		Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_HOMEPAGE,"Home page tilte is not displayed as expected");
		return this;
	}
	
	public boolean isLoginButtonDisplayed() {
		flag = uiDriver.findElement(lnkLogin).isDisplayed();
		
		return flag;
	}
	public JobseekerLoginPage clickOnLogin(){
		isLoginButtonDisplayed();
		uiDriver.findElement(lnkLogin).click();
		return new JobseekerLoginPage(uiDriver);
	}
	
	public AdvancedSearchPage clickOnAdvancedSearch(){
		WebElement element = uiDriver.findElement(lnkAdvancedSearch);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "Advanced search link is not displayed");
		element.click();
		return new AdvancedSearchPage(uiDriver);
	}
	
	public HomePage enterSkill(String skill){
		WebElement element = uiDriver.findElement(txtSkill);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "Advanced search link is not displayed");
		element.clear();
		element.sendKeys(skill);
		return this;
	}
	
}
