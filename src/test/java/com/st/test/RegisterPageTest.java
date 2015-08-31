package com.st.test;


import org.testng.annotations.Test;

import com.st.common.NKCommon;
import com.st.common.NKConstants;
import com.st.pages.CompleteMyProfilePage;
import com.st.pages.CreateYourJobAlertsPage;
import com.st.pages.HomePage;
import com.st.pages.JobAlertCreatedPage;
import com.st.pages.RegistrationPage;
import com.st.pages.SaveMyProfilePage;
import com.st.util.BasePageObject;
import com.st.util.BaseTestObject;

public class RegisterPageTest extends BaseTestObject{
	
		
	HomePage objHomePage;
	RegistrationPage objRegistrationPage;
	SaveMyProfilePage objSaveMyProfilePage;
	CompleteMyProfilePage objCompleteMyProfilePage;
	CreateYourJobAlertsPage objCreateYourJobAlertsPage;
	JobAlertCreatedPage objJobAlertCreatedPage;
	NKCommon objNKCommon;	
	BasePageObject objBasePageObject;
	
				
		
	@Test(priority = -1)
	public void popUpClose() throws InterruptedException{
		objNKCommon = new NKCommon(uiDriver);
		objNKCommon.closepopUp();
	}
	
	@Test(priority = 0)
	public void verifyRegistrationPage() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.clickOnLoginbutton();
		Thread.sleep(1000);
		objHomePage.clickOnRegisterLink();
		Thread.sleep(2000);
		objRegistrationPage = new RegistrationPage(uiDriver);
		objRegistrationPage.verifyRegistrationPageTitle();
		objRegistrationPage.verifyRegistrationPageMessage();	
		objRegistrationPage.verifyCreateLoginDetailsSection();
		objRegistrationPage.verifyYourContactInformationSection();
		objRegistrationPage.verifyYourCurrentEmploymentDetailsSection();
		objRegistrationPage.verifyYourEducationBackgroundSection();
		objRegistrationPage.verifyUploadYourDetailedResumeSection();
		objRegistrationPage.verifyMailerAndPrivacySettingsSection();
		objRegistrationPage.verifyIAgreeCheckbox();
		objRegistrationPage.verifyTermsConditionslink();
		objRegistrationPage.verifyJoinNaukriButton();
		objHomePage = new HomePage(uiDriver);
		
	}
	
	@Test(priority = 1)
	public void verifyCreateLoginDetails() throws Exception{
		objRegistrationPage = new RegistrationPage(uiDriver);
		objRegistrationPage.verifyEmailField();
		objRegistrationPage.clickOnPasswordfield();
		objRegistrationPage.verifyEmailErrorDisplayed();
		objRegistrationPage.verifyConfirmPassword();
		objRegistrationPage.enterEmail(NKConstants.EMAILID_EXISTING);
		objRegistrationPage.clickOnPasswordfield();
		Thread.sleep(1000);
		objRegistrationPage.verifyErrorAlert();
		objRegistrationPage.verifyAlreadyRegisteredMsg();
		objRegistrationPage.clickOnClose();
		objRegistrationPage.enterEmail(NKConstants.EMAILID_UNIQUE );
		Thread.sleep(2000);
		objBasePageObject = new BasePageObject(uiDriver);
		String invalidPassword = objBasePageObject.getExcelTest(1, 1, "Register");
		objRegistrationPage.enterPassword(invalidPassword);
		Thread.sleep(2000);
		objRegistrationPage.clickOnConfirmPasswordField();
		Thread.sleep(2000);
		objRegistrationPage.verifyPasswordErrorDisplayed();
		objRegistrationPage.clickOnPasswordfield();
		Thread.sleep(2000);
		String validPassword = objBasePageObject.getExcelTest(1, 2, "Register");
		objRegistrationPage.enterPassword(validPassword);
		Thread.sleep(2000);
		objRegistrationPage.enterConfirmPassword(invalidPassword);
		objRegistrationPage.clickOnNameField();
		Thread.sleep(2000);
		objRegistrationPage.verifyConfirmPasswordErrorDisplayed();
		Thread.sleep(2000);
		objRegistrationPage.clickOnConfirmPasswordField();
		objRegistrationPage.enterConfirmPassword(validPassword);
		Thread.sleep(2000);
		objRegistrationPage.clickOnNameField();
		
	}	
	@Test(priority = 2)
	public void verifyYourContactInformation() throws Exception{
		String fullName = objBasePageObject.getExcelTest(1, 3, "Register");
		objRegistrationPage.enterFullName(fullName);
		objRegistrationPage.clickOnJoinNaukriButton();
		Thread.sleep(2000);
		objRegistrationPage.verifyLocationDDErrorDisplayed();
		objRegistrationPage.clickOnCurrrentLocationDropdown();
		objRegistrationPage.selectBangalore();
		objRegistrationPage.verifyMobileNumberErrorDisplayed(NKConstants.ERROR_EXPECTEDMOBILENUMBER);
		objRegistrationPage.enterMobileNumber(NKConstants.MOBILENUMBER_INVALID);
		objRegistrationPage.clickOnLandlineLink();
		Thread.sleep(2000);
		objRegistrationPage.verifyCountryCode();
		objRegistrationPage.verifyAreaCode();
		objRegistrationPage.verifyLandLine();
		objRegistrationPage.clickOnLandlineLink();
		objRegistrationPage.verifyMobileNumberErrorDisplayed(NKConstants.ERROR_INVALIDMOBILENUMBER);
		objRegistrationPage.enterMobileNumber(NKConstants.MOBILENUMBER_VALID);
		
	}
	
	@Test(priority = 3)
	public void verifyYourCurrentEmploymentDetails() throws Exception{
		objRegistrationPage = new RegistrationPage(uiDriver);
		objRegistrationPage.verifyExperienceErrorDisplayed();
		//String experience = objBasePageObject.getExcelTest(1, 3, "Search");
		objRegistrationPage.selectExperience(NKConstants.EXPERIENCE);
		Thread.sleep(1000);
		String designation = objBasePageObject.getExcelTest(1, 6, "Register");
		objRegistrationPage.enterDesignation(designation);
		objRegistrationPage.verifySkillsErrorDisplayed(NKConstants.ERROR_SKILLS);
		String skill = objBasePageObject.getExcelTest(1, 1, "Search");
		objRegistrationPage.enterSkills(skill);
		objRegistrationPage.verifyBasicEducationErrorDisplayed();
		String basicEducation = objBasePageObject.getExcelTest(1, 7, "Register");
		objRegistrationPage.selectBasicEducation(basicEducation);
		Thread.sleep(2000);
		String invalidPath = objBasePageObject.getExcelTest(1, 8, "Register");
		objRegistrationPage.chooseFilepath(invalidPath);
		Thread.sleep(1000);
		objRegistrationPage.verifyNonSupportedFileErrorDisplayed();
		Thread.sleep(1000);
		String validPath = objBasePageObject.getExcelTest(1, 9, "Register");
		objRegistrationPage.chooseFilepath(validPath);
		Thread.sleep(1000);
		objRegistrationPage.verifyUploadedFile();
		Thread.sleep(2000);
		objRegistrationPage.clickOnPasteResumeLink();
		Thread.sleep(2000);
		String resumeText = objBasePageObject.getExcelTest(1, 10, "Register");
		objRegistrationPage.enterResumeText(resumeText);
		objRegistrationPage.verifyJobAlertsCheckBox();
		objRegistrationPage.verifyNotificationsCheckBox();
		objRegistrationPage.verifyFastforwardEmailsCheckBox();
		objRegistrationPage.verifyFastforwardSMSCheckBox();
		objRegistrationPage.verifyCommunicationCheckBox();
		objRegistrationPage.verifyPromoCheckBox();
		objRegistrationPage.clickOnIAgreeCheckBox();
		Thread.sleep(2000);
		objRegistrationPage.clickOnJoinNaukriButton();
		Thread.sleep(2000);
		objRegistrationPage.verifyIAgreeErrorDisplayed();
		objRegistrationPage.clickOnIAgreeCheckBox();
		Thread.sleep(2000);
	   	objRegistrationPage.clickOnJoinNaukriButton();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 4)
	public void verifyCompleteMyProfilePage() throws Exception{
		objSaveMyProfilePage = new SaveMyProfilePage(uiDriver);
		objSaveMyProfilePage.verifySaveMyProfilePageTitle();
		objSaveMyProfilePage.verifyRegistrationSuccessfulMsg();
		objSaveMyProfilePage.verifyHeaderWelcomeSection();
		objSaveMyProfilePage.verifyResumeHeadlineSection();
		objSaveMyProfilePage.verifyHeaderLogoutlink();
		objSaveMyProfilePage.verifyReportAProblemLink();
		objSaveMyProfilePage.verifyProfileInformationSection();
		objSaveMyProfilePage.verifyEducationDetailsSection();
		objSaveMyProfilePage.verifyWorkExperienceSection();
		objSaveMyProfilePage.verifyCurrentPositionSection();
		objSaveMyProfilePage.verifySaveMyProfileButton();
		objSaveMyProfilePage.clickOnSaveMyProfileButton();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void verifyEducationDetails() throws Exception{
		objSaveMyProfilePage = new SaveMyProfilePage(uiDriver);
		objSaveMyProfilePage.verifySpecializationErrorDisplayed();
		objSaveMyProfilePage.verifyInstitutionErrorDisplayed();
		objSaveMyProfilePage.verifyYearOfCompletionErrorDisplayed();
		String specialization = objBasePageObject.getExcelTest(1, 11, "Register");
		objSaveMyProfilePage.SelectSpecialization(specialization);
		Thread.sleep(1000);
		String institution = objBasePageObject.getExcelTest(1, 12, "Register");
		objSaveMyProfilePage.SelectInstitution(institution);
		Thread.sleep(1000);
		objSaveMyProfilePage.SelectYearOfCompletion(NKConstants.YEAROFCOMPLETION);
		Thread.sleep(1000);
		objSaveMyProfilePage.verifyIndustryErrorDisplayed();
		objSaveMyProfilePage.verifyFunctionalAreaErrorDisplayed();
		objSaveMyProfilePage.verifyRoleErrorDisplayed();
		String currentIndustry = objBasePageObject.getExcelTest(1, 14, "Register");
		objSaveMyProfilePage.selectCurrentIndustry(currentIndustry);
		Thread.sleep(1000);
		String functionalArea = objBasePageObject.getExcelTest(1, 15, "Register");
		objSaveMyProfilePage.selectFunctionalArea(functionalArea);
		Thread.sleep(1000);
		String role = objBasePageObject.getExcelTest(1, 16, "Register");
		objSaveMyProfilePage.selectRole(role);
		Thread.sleep(1000);
		objSaveMyProfilePage.verifySalaryErrorDisplayed();
		objSaveMyProfilePage.selectsalLacs(NKConstants.SALARYINLACS);
		Thread.sleep(1000);
		objSaveMyProfilePage.clickOnSaveMyProfileButton();
		Thread.sleep(4000);	
	}
	

	@Test(priority = 6)
	public void verifyCompleteMyProfile() throws Exception{
		objCompleteMyProfilePage = new CompleteMyProfilePage(uiDriver);
		objCompleteMyProfilePage.verifyBasicProfileSavedMessage();
		objCompleteMyProfilePage.verifyCompleteYourprofileMessage();
		objCompleteMyProfilePage.verifyUploadPhotoSection();
		objCompleteMyProfilePage.verifyDesiredJobSection();
		objCompleteMyProfilePage.verifyITSkillsSection();
		objCompleteMyProfilePage.verifyPersonalDetailsSection();
		objCompleteMyProfilePage.verifyWorkAuthorizationSection();
		objCompleteMyProfilePage.verifyLanguagesKnownSection();
		objCompleteMyProfilePage.verifyAffirmativeActionSection();
		objCompleteMyProfilePage.clickOnCompleteMyProfileButton();
		Thread.sleep(4000);
		
	}
	

	@Test(priority = 7)
	public void verifyCreateYourJobAlert() throws Exception{
		objCreateYourJobAlertsPage = new CreateYourJobAlertsPage(uiDriver);
		objCreateYourJobAlertsPage.verifyCreateYourJobAlertsPageTitle();
		objCreateYourJobAlertsPage.verifyNameYourJobAlertBox();
		objCreateYourJobAlertsPage.verifySkillsAutoBox();
		objCreateYourJobAlertsPage.clickOnCreateJobAlertButton();
		Thread.sleep(2000);
		objCreateYourJobAlertsPage.verifyKeySkillsErrorDisplayed();
		objCreateYourJobAlertsPage.verifyJobAlertNameErrorDisplayed();
		String skill = objBasePageObject.getExcelTest(1, 1, "Search");
		objCreateYourJobAlertsPage.enterSkills(skill);
		Thread.sleep(1000);
		String jobAlertName = objBasePageObject.getExcelTest(1, 18, "Register");
		objCreateYourJobAlertsPage.enterJobAlertName(jobAlertName);
		Thread.sleep(1000);
		objCreateYourJobAlertsPage.clickOnCreateJobAlertButton();
		Thread.sleep(4000);
		objJobAlertCreatedPage = new JobAlertCreatedPage(uiDriver);
		objJobAlertCreatedPage.verifyAlertSuccessMessage();
		objJobAlertCreatedPage.verifyMyNaukriIcon();
		objJobAlertCreatedPage.verifyNaukriLogo();
		objJobAlertCreatedPage.verifyNotificationsIcon();
		objJobAlertCreatedPage.clickOnLogoutLink();
		
		
	}
	
	
}

