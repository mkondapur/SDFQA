package com.st.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.st.util.BasePageObject;


public class JobListingsPage extends BasePageObject{
		
	public JobListingsPage(WebDriver driver){
		super(driver); 
	}
	
	/* UI Elements Initialization*/
	By educationRequirementsUG= By.xpath("//div[@itemprop='educationRequirements']/p[1]/span");
	By applyOnCompanyWebsite = By.xpath("//div[@class='sumAct']//button[contains(.,'Apply on Company Website')]");
	By loginToApply = By.xpath("//div[@class='sumAct']/button[@class='loginBtn']");
	By registerAndApply = By.xpath("//div[@class='sumAct']/button[@id='trigAAR']");
	By industryIT = By.xpath("//div[@class='jDisc mt20']/p[2]//a[1]");
	By industrySoftware = By.xpath("//div[@class='jDisc mt20']/p[2]//a[2]");
	By educationRequirementsPG= By.xpath("//div[@itemprop='educationRequirements']/p[2]/span");
	
	
	
	/*Variables Initialization*/
	boolean flag = false;
	
    public void switchToNewWindow() throws InterruptedException{
		
		Set<String>windowNames = uiDriver.getWindowHandles();
		for(String winName: windowNames){
			Thread.sleep(3000);
			uiDriver.switchTo().window(winName);
		}
	}
	public boolean verifyEducationRequirementsUG(){
		flag = isElementPresent(educationRequirementsUG);
		Assert.assertTrue(flag, "Education Requirements is not displayed");
		return flag;
	}
	
	public void verifyEducationSelectedUG(String eduSel){
		verifyEducationRequirementsUG();
		String education = getText(educationRequirementsUG);
		if(education.contains(eduSel)){
			System.out.println("Selected Education matches with the displayed Education");
		}else{
			System.out.println("Selected Education doesnot match with the displayed Education");
		}
		
	}
	
	public boolean verifyEmployerTypeCompanyJobs(){
		flag = isElementPresent(applyOnCompanyWebsite);
		Assert.assertTrue(flag, "Employer type CompanyJobs selected doesnot matches with the displayed value");
		System.out.println("Employer type CompanyJobs selected is verified");
		return flag;
		
	}
	
	public boolean verifyLoginToApplyButton(){
		flag = isElementPresent(loginToApply);
		Assert.assertTrue(flag, "LoginToApply button is not displayed");
		return flag;
		
	}
	
	public boolean verifyRegisterAndApplyButton(){
		flag = isElementPresent(registerAndApply);
		Assert.assertTrue(flag, "RegisterAndApply button is not displayed");
		return flag;
		
	}
	
	public void verifyEmployerTypeConsultant(){
		boolean flag1 = verifyLoginToApplyButton();
		boolean flag2 = verifyRegisterAndApplyButton();
		if(flag1 && flag2){
			System.out.println("Employer type ConsultantJobs selected matches with the displayed value");			
		}else{
			System.out.println("Employer type ConsultantJobs selected doesnot matches with the displayed value");
		}
	}
	
	public void verifyIndustryType(String industryTypeSelected){
		String indusType1 = getText(industryIT);
		String indusType2 = getText(industrySoftware);
		if((industryTypeSelected.contains(indusType1)) && (industryTypeSelected.contains(indusType2)) ){
			System.out.println("Industry type selected matches with the displayed value");			
		}else{
			System.out.println("Industry type selected doesnot match with the displayed value");
		}
	}
	
	public boolean verifyEducationRequirementsPG(){
		flag = isElementPresent(educationRequirementsPG);
		Assert.assertTrue(flag, "Education Requirements is not displayed");
		return flag;
	}
	
	public void verifyEducationSelectedPG(String eduSel){
		verifyEducationRequirementsPG();
		String education = getText(educationRequirementsPG);
		if(education.contains(eduSel)){
			System.out.println("Selected Education matches with the displayed Education");
		}else{
			System.out.println("Selected Education doesnot match with the displayed Education");
		}
		
	}
    
	public void closeWindow(){
		uiDriver.close();
	}
}
