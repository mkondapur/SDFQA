package com.st.test;

import org.testng.annotations.Test;

import com.st.common.NKCommon;
import com.st.common.NKConstants;
import com.st.pages.HomePage;
import com.st.pages.JobListingsPage;
import com.st.pages.SearchResultPage;
import com.st.util.BasePageObject;
import com.st.util.BaseTestObject;

public class SearchPageTest extends BaseTestObject {

SearchResultPage objSearchResultPage;
HomePage objHomePage;
JobListingsPage objJobListingPage;
NKCommon objNKCommon;
BasePageObject objBasePageObject;
	
	@Test(priority = -1)
	public void popUpClose() throws InterruptedException{
		objNKCommon = new NKCommon(uiDriver);
		objNKCommon.closepopUp();
		
	}
	
	@Test(priority=0)
	public void verifySearchSection() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.verifySkillTextBox();
		objHomePage.verifyLocationTextBox();
		objHomePage.verifyExperiencedropdown();		
	}
	
	@Test(priority=3)
	public void verifySearchBySkill() throws Exception{
		
		objNKCommon = new NKCommon(uiDriver);
		objNKCommon.closepopUp();
		objBasePageObject = new BasePageObject(uiDriver);
		String skill = objBasePageObject.getExcelTest(1, 1, "Search");
		objHomePage = new HomePage(uiDriver);
		objHomePage.enterSkillEntry(skill);		
		objHomePage.clickOnSearchButton();		
		SearchResultPage searchRes = new SearchResultPage(uiDriver);
	    String displayedSkill = searchRes.getSkillDisplayed();
		searchRes.verifySkillsSelectedAndDisplayed(skill,displayedSkill);
		
	}
	
	@Test(priority=1)
	public void verifySearchByLocationField() throws Exception{
			
		objBasePageObject = new BasePageObject(uiDriver);
		String locn = objBasePageObject.getExcelTest(1, 2, "Search");
		objHomePage = new HomePage(uiDriver);
		objHomePage.enterLocation(locn);
		objSearchResultPage = objHomePage.clickOnSearchButton();
		SearchResultPage searchRes = new SearchResultPage(uiDriver);
		searchRes.verifyJobLocations(locn);
		objHomePage.clickOnSiteLogo();
		
		
	}
	
	@Test(priority=2)
	public void verifySearchByExperienceField() throws Exception{
			
		objNKCommon = new NKCommon(uiDriver);
		objNKCommon.closepopUp();
		objBasePageObject = new BasePageObject(uiDriver);
		String skill = objBasePageObject.getExcelTest(1, 1, "Search");
		objHomePage = new HomePage(uiDriver);
		objHomePage.enterSkillEntry(skill);
		objHomePage.SelectExperience();
		int exp = objHomePage.getSelectedYrsExp();
		objSearchResultPage = objHomePage.clickOnSearchButton();
		objSearchResultPage.verifyExp(exp);
		objHomePage.clickOnSiteLogo();
		
		
	}
		
	@Test(priority = 14)
	public void verifyRefineByEducation() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnEducation();
		objSearchResultPage.selectEducationType();
		String educationSelected = objSearchResultPage.getSelectedEducationType();
		objSearchResultPage.clickOnSubmitButton();
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyEducationSelectedUG(educationSelected);
		objJobListingPage.closeWindow();
		Thread.sleep(1000);
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.selectEducationType();
		objSearchResultPage.clickOnEducation();
	}

	@Test(priority = 12)	
	public void verifyRefineByIndustryType() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnIndustry();
		objSearchResultPage.verifyIndustryDD();
		objSearchResultPage.clickOnSoftwareServicesIndustryCheckbox();
		String industryTypeSelected = objSearchResultPage.getIndusrtySelected();
		objSearchResultPage.clickOnSubmitButton();
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyIndustryType(industryTypeSelected);
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnSoftwareServicesIndustryCheckbox();
		objSearchResultPage.clickOnIndustry();
		
	}
	
	@Test(priority = 13)
	public void verifyRefineByIndustryPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnIndustry();
		objSearchResultPage.verifyIndustryDD();
		objSearchResultPage.verifyIndustryMoreLink();
		objSearchResultPage.clickOnIndustryMoreLink();
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnIndustryMoreLink();
		String morePopUpTitle = objSearchResultPage.getMorePopUpHeaderTitle();
		objSearchResultPage.verifyPopUpHeaderTitle(morePopUpTitle, NKConstants.TITLE_INDUSTRYPOPUP);
		objSearchResultPage.clickOnITSoftwareServicesIndustryCheckbox();
		String industryTypeSelected = objSearchResultPage.getMorePopUpIndusrtySelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyIndustryType(industryTypeSelected);
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnIndustryMoreLink();
		objSearchResultPage.clickOnITSoftwareServicesIndustryCheckbox();
		objSearchResultPage.clickOnPopUpRefineButton();
		objSearchResultPage.clickOnIndustry();
		
		
	}
	
	@Test(priority = 15)
	public void verifyRefineByEducationPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnEducation();
		objSearchResultPage.clickOnEducationMoreLink();
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnEducationMoreLink();
		String morePopUpTitle = objSearchResultPage.getMorePopUpHeaderTitle();
		objSearchResultPage.verifyPopUpHeaderTitle(morePopUpTitle, NKConstants.TITLE_EDUCATIONPOPUP);
		objSearchResultPage.clickOnMCAEducationPopUpCheckbox();
		String educationSelected = objSearchResultPage.getMorePopUpEducationSelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyEducationSelectedPG(educationSelected);
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnEducationMoreLink();
		objSearchResultPage.verifyPopUpHeaderTitle(morePopUpTitle, NKConstants.TITLE_EDUCATIONPOPUP);
		objSearchResultPage.clickOnMCAEducationPopUpCheckbox();
		objSearchResultPage.clickOnPopUpRefineButton();
		objSearchResultPage.clickOnEducation();
		
	}
		
	@Test(priority = 9)	
	public void verifyRefineByFreshness() throws Exception{	
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnFreshnessArrow();
		objSearchResultPage.verifyFressnessDropdown();
		objSearchResultPage.verifyFressnessDropdownContents();
		objSearchResultPage.clickOnFreshnesSelected();
		int daysSelected = objSearchResultPage.getFreshnessSelected();
		objSearchResultPage.clickOnSubmitButton();
		objSearchResultPage.verifyDatePosted(daysSelected);
	}
	
	@Test(priority = 11)
	public void verifyRefineByLocationPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyLocationDropdown();
		objSearchResultPage.clickOnLocationMoreLink();
		objSearchResultPage.verifyLocationCheckBoxes();
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnLocationMoreLink();
		objSearchResultPage.clickOnLocationPune();
		String LocationSelected = objSearchResultPage.getLocationPuneSelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		objSearchResultPage.verifyDisplayedJobLocations(LocationSelected);
		objSearchResultPage.clickOnLocationMoreLink();
		objSearchResultPage.clickOnLocationPune();
		objSearchResultPage.clickOnPopUpRefineButton();
		objSearchResultPage.clickOnLocation();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 10)
	public void verifySearchByLocationSection() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnLocation();
		objSearchResultPage.verifyLocationDropdown();
		objSearchResultPage.clickOnLocationBangalore();
		String LocationSelected = objSearchResultPage.getLocationBangaloreSelected();
		objSearchResultPage.clickOnSubmitButton();
		objSearchResultPage.verifyDisplayedJobLocations(LocationSelected);
		objSearchResultPage.clickOnLocationBangalore();
	}
		
	@Test(priority = 4)
	public void verifySearchResultsPage(){
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyNaukriLogo();
		objSearchResultPage.verifyHeaderIcons();
		objSearchResultPage.verifyTabs();
		objSearchResultPage.verifyEmployerZoneLink();
		objSearchResultPage.verifyBuyOnlineLink();
		objSearchResultPage.verifySearchResultHead();
		objSearchResultPage.verifySearchResultBody();
		objSearchResultPage.verifyAdvancedSearchLink();
		objSearchResultPage.verifyRefineSection();
		objSearchResultPage.verifyRecentSearchSection();
		objSearchResultPage.verifyRegisterNowForm();
		objSearchResultPage.verifySubmitButton();
		objSearchResultPage.getJobsInboxDisplayed();
		objSearchResultPage.verifyFooterSection();
		objSearchResultPage.verifyPartnerSection();
		objSearchResultPage.verifyDisclaimer();
		objSearchResultPage.verifyfressnessSection();
	}
	
	@Test(priority = 5)
	public void verifyRefineResultsSection(){
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyLocationSection();
		objSearchResultPage.verifyIndustrySection();
		objSearchResultPage.verifySalarySection();
		objSearchResultPage.verifyEducationSection();
		objSearchResultPage.verifyEmployerTypeSection();
		objSearchResultPage.verifyJobTypeSection();
		objSearchResultPage.verifySubmitButton();
			
	}
	
	@Test(priority = 8)
	public void verifySearchResultsSection(){
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyJobCount();
		objSearchResultPage.verifyDetailedViewIcon();
		objSearchResultPage.verifyDetailedViewSelectedByDefault();
		objSearchResultPage.verifyListViewIcon();
		objSearchResultPage.verifySortByDropdown();
		String defaultSortByValue = objSearchResultPage.getDefaultSortByValue();
		objSearchResultPage.verifySortByDDDefault(defaultSortByValue,NKConstants.SORTBYDEFAULTSELECTION);
		objSearchResultPage.verifySortByArrow();
		objSearchResultPage.verifySortByDDDate();			
	}
	
	@Test(priority = 7)
	public void verifySearchDetailedViewResults() throws Exception{
		
		objSearchResultPage.clickOnDetailedViewIcon();
		objSearchResultPage.verifyResultBodyTitle();
		objSearchResultPage.verifyResultBodyOrganization();
		objSearchResultPage.verifyResultBodyExperienceRequirements();
		objSearchResultPage.verifyResultBodyJobLocation();
		objSearchResultPage.verifyResultBodykeySkills();
		objSearchResultPage.verifyResultBodyJobDescription();
		objSearchResultPage.verifyResultBodyOtherDetails();
		
	}
	
	@Test(priority = 6)
	public void verifySearchListingViewResults() throws Exception{
		
		objSearchResultPage.clickOnListViewIcon();
		objSearchResultPage.verifyResultBodyTitle();
		objSearchResultPage.verifyResultBodyOrganization();
		objSearchResultPage.verifyResultBodyExperienceRequirements();
		objSearchResultPage.verifyResultBodyJobLocation();
		objSearchResultPage.verifyResultBodyOtherDetails();		
		objSearchResultPage.verifyResultBodyJobDescForListingView();
		objSearchResultPage.verifyResultBodySkillsForListingView();
		
		
	}
	
}	
