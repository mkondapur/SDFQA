package com.st.test;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.st.common.NKCommon;
import com.st.common.NKConstants;
import com.st.pages.CreateJobAlert;
import com.st.pages.CustomerSupportPage;
import com.st.pages.HomePage;
import com.st.pages.InfoEdgePage;
import com.st.pages.JobSearchNaukriPage;
import com.st.pages.LoginNaukriPage;
import com.st.pages.LoginRecruitNaukriPage;
import com.st.pages.MyNaukriPage;
import com.st.pages.RecruitNaukriPage;
import com.st.pages.ResumeNaukriPage;
import com.st.pages.TermsAndConditions;
import com.st.util.BaseTestObject;
import com.st.util.ExcelutilObject;

import net.sourceforge.htmlunit.corejs.javascript.ObjToIntMap;

public class HomePageTest extends BaseTestObject

{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	

HomePage objHomePage;
LoginRecruitNaukriPage objLoginRecruitNaukriPage;
RecruitNaukriPage objRecruitNaukriPage;
LoginNaukriPage objLoginNaukriPage;
MyNaukriPage objMyNaukriPage;
TermsAndConditions objTermsAndConditions;
CreateJobAlert objCreateJobAlert;
ResumeNaukriPage objResumeNaukriPage;
CustomerSupportPage objCustomerSupportPage;
NKCommon objNKCommon;
JobSearchNaukriPage objJobSearchNaukriPage;
InfoEdgePage objInfoEdgePage;
//IMP for Excel 
Properties objProperties=getPropertyContents();


boolean flag;
String actual_Result=null;
String parent_window=null;
public String parentWindowName = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com".trim();


@Parameters({"browserType","url"})


@Test(priority=1, enabled=false)
public void clickOnSiteLogoAndCheckThePageTitle() throws Exception
{
	Log.info("----> Clicking on Site Logo and Verifying Home Page Title<------------");
try 
{
	
	objHomePage= new HomePage(uiDriver);
	flag=objHomePage.verifySiteLogo();
	Assert.assertTrue(flag, "Site Logo is not Matching");
	objHomePage.clickOnSiteLogo();
	objHomePage.verifyHomePageTitle();
	objHomePage.getHeaderLinksName();
} 
catch (Exception e) 
{
	throw new Exception("FAILED CLICK ON SITELOGO AND VERFIY PAGETITLE TESTCASE" + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
}

}

@Test (priority=3, enabled=false)
public void clickOnEmployerZone() throws Exception
{
Log.info("Clicking on the Employer Zone Link");
/*String parentWindowName =uiDriver.getWindowHandle();
System.out.println("HP tilte:"+parentWindowName);*/
try 
{
	objHomePage= new HomePage(uiDriver);
	objHomePage.verifyHomePageTitle();
	flag=objHomePage.verifyEmplyerZone();
	Assert.assertTrue(flag, "Employerzone Link is not displayed");
	objLoginRecruitNaukriPage=objHomePage.clickEmployerZone();
	objLoginRecruitNaukriPage.waitImplicit(5000);
	objLoginRecruitNaukriPage.getLoginRecruiteNaukriGetTitle();
	flag=objLoginRecruitNaukriPage.verifyLoginRecruiteNaukriSiteLogo();
	Assert.assertTrue(flag, "Login Recruit Naukri Site Logo is not displayed");
	flag=objLoginRecruitNaukriPage.verifyRequestInformationText();
	Assert.assertTrue(flag, "Verify Request Information Text is not displayed");
	objHomePage=objLoginRecruitNaukriPage.clickOnRecruitNaukriSiteLogo();
	objHomePage.verifyHomePageTitle();
} 
catch (Exception e) 
{
	throw new Exception("FAILED WHILE CLICKING ON EMPLOYER ZONE TESTCASE" + "\n clickOnEmployerZone " +e.getLocalizedMessage());
}
}
@Test (priority=4, enabled=false)
public void clickOnBuyonlineLinks() throws Exception
{
	/*String parentWindowName =uiDriver.getWindowHandle();
	System.out.println("HP tilte:"+parentWindowName);*/
try 
{
	objHomePage= new HomePage(uiDriver);
	flag=objHomePage.verifyBuyOnline();
	Assert.assertTrue(flag, "Buy online object is Missing");
	//parent_window=uiDriver.getWindowHandle();
	objRecruitNaukriPage=objHomePage.clickOnBuyOnLineSubMenu();
	objRecruitNaukriPage.verifyourorder();
	objRecruitNaukriPage.verifyClickOnHereLink();
	objLoginNaukriPage=objRecruitNaukriPage.clickONClickhere();
	objLoginNaukriPage.verifySiteLogo();
	objHomePage=objLoginNaukriPage.clickOnSiteLogo();
	objHomePage.verifyHomePageTitle();
	flag=objHomePage.verifyBuyOnline();
	Assert.assertTrue(flag, "Buy online object is Missing");
	objRecruitNaukriPage=objHomePage.clickOnPostAnInstaJob();
	objRecruitNaukriPage.verifyRecruitNaukriSiteLogo();
	objHomePage=objRecruitNaukriPage.clickRecruiteNaukriSiteLogo();
	objHomePage.verifyHomePageTitle();
	
	
	
} catch (Exception e) 
{
	throw new Exception("FAILED WHILE CLICKING ON BUY ONLINE LINKS" + "\n clickOnBuyLinks " +e.getLocalizedMessage());
}	
/*finally {
	closeAndSwitchToParent(parentWindowName);
}*/
}



@Test (priority=5,enabled=false)
public void clickOnPostYourCV() throws Exception
{
	String parentWindowName = uiDriver.getWindowHandle();
	try
	{
		objHomePage=new HomePage(uiDriver);
		objHomePage.verifyIagreeTermsAndConditionsPara();
		objHomePage.verifyTermsAndConditionsLink();
		objJobSearchNaukriPage=objHomePage.clickOnTermsAndConditionsLink();
		objJobSearchNaukriPage.verifyCloseWindowTermsandCondition();
		objJobSearchNaukriPage.clickOnCloseWindowTermsandConditions();
		uiDriver.switchTo().window(parentWindowName);
		Thread.sleep(5000);
		objHomePage.verifyEnterEmailIDTextBox();
		objHomePage.enterEmailIdText("agtewesse.edws@gmail.com");
		objHomePage.verifyCreatePassword();
		objHomePage.enterCreatePassword("jaskjasd");
		objHomePage.verifyPostYourCV();
		objMyNaukriPage =objHomePage.clickOnPostYourCV();
		objMyNaukriPage.verifyLogoutLink();
		objLoginNaukriPage=objMyNaukriPage.clickOnLogoutLink();
		objLoginNaukriPage.clickOnLoginAgain();
		objLoginNaukriPage.waitImplicit(4000);
		objHomePage=objLoginNaukriPage.clickOnSiteLogo();
		objHomePage.verifyHomePageTitle();
		
		
		
	} catch (Exception e) 
	{
		throw new Exception("Failed click on Post your CV Test case" + "\n clickOnPostYourCV" +e.getLocalizedMessage());
	}
	
}

@Test (priority=6, enabled=false)
public void clickOnCreateJobAlert() throws Exception
{
	String parentWindowName = uiDriver.getWindowHandle();
	try 
	{
		objHomePage= new HomePage(uiDriver);
		objHomePage.verifyGetMatchedJobsPara();
		objHomePage.verifyCreateJobAlertButton();
		objCreateJobAlert=objHomePage.clickonCreateJobAlertButton();
		objCreateJobAlert.verifyTellUsTextisPresent();
		objCreateJobAlert.verifyCloseImagebutton();
		objHomePage=objCreateJobAlert.clickOnCloseImagebutton();
		objHomePage.verifyHomePageTitle();
		
		//objCreateJobAlert.closeBrowser();
		
		
	} catch (Exception e)
	{
		throw new Exception("FAILED CREATE JOB ALERT TEST CASE " + "\n clickOnCreateJobAlert" +e.getLocalizedMessage() );
	}
}

@Test (priority=2, enabled=false)
public void clickOnNaukriFastForwardLink() throws Exception
{
	try 
	{
		objHomePage= new HomePage(uiDriver);
		objHomePage.verifyNaukriFastForwardImageLink();
		objResumeNaukriPage=objHomePage.clickOnNaukriFastForwardImageLink();
		objResumeNaukriPage.waitImplicit();
		//objResumeNaukriPage.verifyNaukriFastForwardTitle();
		objResumeNaukriPage.verifyINeedImpresive();
		objResumeNaukriPage.verifyCustomerServiceLink();
		objResumeNaukriPage.clickOnCustomerSupportService();
		objResumeNaukriPage.verifyHomeImage();
		objHomePage=objResumeNaukriPage.clickOnHomeImage();
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyKnowYourResumeScoreLink();
		objResumeNaukriPage=objHomePage.clickOnKnowYourResumeScoreLink();
		objResumeNaukriPage.waitImplicit();
		objResumeNaukriPage.verifyNaukriFastforwardSitelogo();
		objResumeNaukriPage.clickOnNaukriFastforwardSitelogo();
		Thread.sleep(4000);
		objResumeNaukriPage.verifyCustomerServiceLink();
		objResumeNaukriPage.clickOnCustomerSupportService();
		objResumeNaukriPage.verifyHomeImage();
		objHomePage=objResumeNaukriPage.clickOnHomeImage();
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyResumeFeedbackReportLink();
		objResumeNaukriPage=objHomePage.clickOnResumeFeedbackReportLink();
		objResumeNaukriPage.verifyNaukriFastforwardSitelogo();
		objResumeNaukriPage.clickOnNaukriFastforwardSitelogo();
		objResumeNaukriPage.verifyCustomerServiceLink();
		objResumeNaukriPage.clickOnCustomerSupportService();
		objResumeNaukriPage.verifyHomeImage();
		objHomePage=objResumeNaukriPage.clickOnHomeImage();
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyGetYourFreeText();
		objHomePage.verifyGet3to4MoreTimesProfilesText();
		objHomePage.verifyNotGettingEnoughProfilesLink();
		objResumeNaukriPage=objHomePage.clickOnNotGettingEnoughProfilesLink();
		objResumeNaukriPage.verifyNaukriFastforwardSitelogo();
		objResumeNaukriPage.clickOnNaukriFastforwardSitelogo();
		objResumeNaukriPage.verifyCustomerServiceLink();
		objResumeNaukriPage.clickOnCustomerSupportService();
		objHomePage=objResumeNaukriPage.clickOnHomeImage();
		objHomePage.verifyHomePageTitle();
		
	} catch (Exception e)
	{
		throw new Exception("FAILED CLICK ON FAST AND FORWARD " + "\n clickOnCreateJobAlert" +e.getLocalizedMessage() );
	}
	
}

@Test(priority=7,enabled=false)
public void clickOnJobsbyLocationsLinks() throws Exception
{
try {
	objHomePage= new HomePage(uiDriver);
	objHomePage.verifyHomePageTitle();
	objHomePage.verifyJobsByLocation();
	objJobSearchNaukriPage=objHomePage.clickOnJobsBYLocationsName();
	objJobSearchNaukriPage.clickOnJobSearchNaukriPageSiteLogo();
	objHomePage.verifyHomePageTitle();
	objJobSearchNaukriPage=objHomePage.clickOnViewAllLocationsLink();
	objJobSearchNaukriPage.clickOnJobSearchNaukriPageSiteLogo();
	objHomePage.verifyHomePageTitle();
} catch (Exception e)
{
	throw new Exception("FAILED WHILE VERIFYING AND CLICKING ON THE JOBS BY LINKS " + "\n clickOnJobsbyLocationsLinks" +e.getLocalizedMessage());
}	
}

@Test(priority=9,enabled=false)
public void clickOnJobsCatLinks() throws Exception
{
	try
	{
		objHomePage= new HomePage(uiDriver);
		objHomePage.verifyJobsByCategoryText();
		objJobSearchNaukriPage=objHomePage.clickOnJobsByCategoryList();
		objJobSearchNaukriPage.clickOnJobSearchNaukriPageSiteLogo();
		System.out.println("Manjunath");
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyViewAllCategoriesLink();
		objJobSearchNaukriPage=objHomePage.clickONViewAllCategoriesLink();
		objJobSearchNaukriPage.clickOnJobSearchNaukriPageSiteLogo();
		System.out.println("Harish");
		objHomePage.verifyHomePageTitle();
		
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED THE TEST CASE OF VERIFY CLICK ON JOBS CATEGORY LINKS" + "\n clickOnJobsCatLinks" + e.getLocalizedMessage());
	}
}
@Test(priority=8, enabled=false)
public void verifybest() throws Exception
{
	objHomePage= new HomePage(uiDriver);
	objHomePage.verifyBestPlaceToWorkTabs();

}
@Test(priority=10,enabled=false)
public void clickOnFootInformationLinks() throws Exception
{
	try
	{
		parent_window=uiDriver.getWindowHandle();
		objHomePage= new HomePage(uiDriver);
		objHomePage.verifyFootInformationText();
		objHomePage.verifyAboutusLink();
		objInfoEdgePage=objHomePage.ClickOnAboutusLink();
		objInfoEdgePage.verifyNaukriSiteImage();
		objInfoEdgePage.clickOnNaukriSiteImage();
		objInfoEdgePage.verifyNaukriimage();
		objHomePage=objInfoEdgePage.clickOnNaukriImage();
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyFootTermsAndConditionLink();
		objTermsAndConditions=objHomePage.ClickOnFootTermsAndConditionLink();
		Thread.sleep(5000);
		objTermsAndConditions.clickOnCloseWindowTermsandConditions();
		uiDriver.switchTo().window(parent_window);
		System.out.println("Manju");
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyPrivacyandPolicylink();
		objJobSearchNaukriPage=objHomePage.ClickOnPrivacyandPolicy();
		Thread.sleep(5000);
		objJobSearchNaukriPage.verifyCloseWindowOfPrivacyPolicy();
		objJobSearchNaukriPage.clickOnCloseWindowOfPrivacyPolicy();
		Thread.sleep(5000);
		uiDriver.switchTo().window(parent_window);
		objHomePage.verifyHomePageTitle();
		System.out.println("Hegde");
		objHomePage.verifyResourceslink();
		//parent_window=uiDriver.getWindowHandle();
		objJobSearchNaukriPage=objHomePage.ClickOnResourcesLink();
		objJobSearchNaukriPage.verifyCareerResourceText();
		Thread.sleep(4000);
		System.out.println("OLE");
		objJobSearchNaukriPage.verifyHomePageSiteLogo();
		objHomePage=objJobSearchNaukriPage.clickOnHomepagesitelogo();
		objHomePage.verifyHomePageTitle();
		System.out.println("Ashwini");
		
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED THE TEST CASE OF VERIFY CLICK ON FOOT INFORMATION LINKS" + "\n clickOnFootInformationLinks   " + e.getLocalizedMessage());
	}
}

@Test(priority=11,enabled=true)
public void verifyContactCustomerService() throws Exception
{
	try
	{
		objHomePage= new HomePage(uiDriver);
		objHomePage.verifyHomePageTitle();
		objHomePage.verifyKnowYourResumeScoreLink();
		objResumeNaukriPage=objHomePage.clickOnKnowYourResumeScoreLink();
		String custrname=getExcelTest(1, 2);
		objResumeNaukriPage.verifyCustomerServiceLink();
		objResumeNaukriPage.clickOnCustomerSupportService();
		objResumeNaukriPage.verifyCustomerNameTextbox();
		//objResumeNaukriPage.enterCustomerNameTextbox("   ");
		System.out.println(custrname);
		objResumeNaukriPage.enterCustomerNameTextbox(custrname);
		Thread.sleep(9000);
		objResumeNaukriPage.clickOnSubmit();
		
		/*objResumeNaukriPage.verifyCustomerEmailTextbox();
		objResumeNaukriPage.enterCustomerEmailID("asshwslwe@gmail.com");
		objResumeNaukriPage.verifyCustomerContactNumber();
		objResumeNaukriPage.enterCustomerContactNumber("9880306305");
		objResumeNaukriPage.verifyCustomerCode();
		objResumeNaukriPage.enterCustomerCode("96854789");
		objResumeNaukriPage.verifyTranscationCode();
		objResumeNaukriPage.enterTranscationCode("898798789789");
		objResumeNaukriPage.verifySpecifyQuery();
		objResumeNaukriPage.enterSpecifyQuery("Sampel testing for ");
		Thread.sleep(9000);
		objResumeNaukriPage.verifySubmitButton();
		objResumeNaukriPage.clickOnSubmit();
		Thread.sleep(9000);*/
		
	} 
	
	catch (Exception e)
	{
		throw new Exception("FAILED TEST CASE OF VERIFY CONTACT CUSTOMER SERVICE FUNCTION " + "\n verifyContactCustomerService  "+e.getLocalizedMessage());
	}
}
public void closeAndSwitchToParent(String parentWindowName ) throws InterruptedException{
	uiDriver.close();
	Thread.sleep(5000);
	uiDriver.switchTo().window(parentWindowName);
}

public String getExcelTest(int row,int column) throws Exception {
	ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "ContactCustomer");
	return ExcelutilObject.getCellData(row, column);
	
}

}
